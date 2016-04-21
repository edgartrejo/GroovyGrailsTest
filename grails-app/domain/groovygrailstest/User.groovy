package groovygrailstest

class User {

    String userid
    Long coins
    String username

    User(String userid, Long coins, String username){
        this.userid = userid
        this.coins = coins
        this.username = username
    }

    static constraints = {
        userid(blank: false, nullable: false, size: 10..10, matches: "[0-9]*", unique:true)
        coins(blank: false, nullable: false, min: 1l)
        username(blank: false, nullable: false, unique:true)
    }
}
