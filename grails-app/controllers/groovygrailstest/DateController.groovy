package groovygrailstest

import jdk.internal.util.xml.impl.Pair

class DateController {

    def index() {

    }

    def getDates(){
        render dates()
    }
    def dates() {

        def dates = new Date[3]

        def firstDate = getCalendarForNow()
        firstDate.set(Calendar.DAY_OF_MONTH, firstDate.getActualMinimum(Calendar.DAY_OF_MONTH))
        setTimeToBeginningOfDay(firstDate)
        dates[0] = firstDate.getTime()

        def currentDate = getCalendarForNow()
        dates[1] = currentDate.getTime()

        def lastDate = getCalendarForNow()
        lastDate.set(Calendar.DAY_OF_MONTH, lastDate.getActualMaximum(Calendar.DAY_OF_MONTH))
        setTimeToEndofDay(lastDate)
        dates[2] = lastDate.getTime()

        dates
    }

    def getCalendarForNow() {
        Calendar calendar = GregorianCalendar.getInstance()
        calendar.setTime(new Date())
        return calendar
    }

    def setTimeToBeginningOfDay(Calendar calendar) {
        calendar.set(Calendar.HOUR_OF_DAY, 0)
        calendar.set(Calendar.MINUTE, 0)
        calendar.set(Calendar.SECOND, 0)
        calendar.set(Calendar.MILLISECOND, 0)
    }

    def setTimeToEndofDay(Calendar calendar) {
        calendar.set(Calendar.HOUR_OF_DAY, 23)
        calendar.set(Calendar.MINUTE, 59)
        calendar.set(Calendar.SECOND, 59)
        calendar.set(Calendar.MILLISECOND, 999)
    }
}
