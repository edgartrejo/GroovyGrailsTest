package groovygrailstest

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class UserController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond User.list(params), model:[userInstanceCount: User.count()]
    }

    def show(User userInstance) {
        respond userInstance
    }

    def create() {
        respond new User(params)
    }

    @Transactional
    def doUpload() {

        List listUsers = new ArrayList();
        List listSavedUsers = new ArrayList();

        try{

            request.getFile('file').inputStream.eachLine { line ->
                def userLine = line.split(",")
                def userInstance = new User(userLine[0], Long.valueOf(userLine[1]),userLine[2])
                listUsers.add(userInstance)
            }

            def countLine = 0
            def error
            for (User user in listUsers) {
                countLine++
                user.validate()
                if (!user.hasErrors()){
                    user.save()
                    listSavedUsers.add(user)
                }
                else {
                    error=true
                    flash.errormessage = message(code: 'upload.error', args: [countLine, user.userid, user.coins, user.username])
                    listSavedUsers.each { userInstance ->
                        userInstance.delete flush:true }
                    break
                }
            }

            if (!error)
                flash.message = message(code: 'upload.success', args: [countLine])

        }
        catch(Exception e ) {
            flash.errormessage = "App Error. Please check file"
        }

        redirect (action:'index')

    }

    @Transactional
    def save(User userInstance) {
        if (userInstance == null) {
            notFound()
            return
        }

        if (userInstance.hasErrors()) {
            respond userInstance.errors, view:'create'
            return
        }

        userInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'user.label', default: 'User'), userInstance.id])
                redirect userInstance
            }
            '*' { respond userInstance, [status: CREATED] }
        }
    }

    def edit(User userInstance) {
        respond userInstance
    }

    @Transactional
    def update(User userInstance) {
        if (userInstance == null) {
            notFound()
            return
        }

        if (userInstance.hasErrors()) {
            respond userInstance.errors, view:'edit'
            return
        }

        userInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'User.label', default: 'User'), userInstance.id])
                redirect userInstance
            }
            '*'{ respond userInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(User userInstance) {

        if (userInstance == null) {
            notFound()
            return
        }

        userInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'User.label', default: 'User'), userInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'user.label', default: 'User'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
