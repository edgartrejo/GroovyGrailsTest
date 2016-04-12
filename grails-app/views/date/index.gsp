<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main">

    <title>Dates</title>
    <g:javascript library="jquery" plugin="jquery"/>
</head>
<body>

<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
    </ul>
</div>
<div id="dates" class="content scaffold-create" role="main">
    <h1>Dates</h1>
    <div align="center">
        <table>
            <tr>
                <td>
                    <div id="result">
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <div>
                        <button onclick="<g:remoteFunction controller="date" action="getDates" update="result"/>">Get Dates!</button>
                    </div>
                </td>
            </tr>
        </table>
    </div>
    <div align="left">
        <h1>Code:</h1>
        <code>
            <pre>
            def dates() {</br>

                def dates = new Date[3]</br>

                def firstDate = getCalendarForNow()</br>
                firstDate.set(Calendar.DAY_OF_MONTH, firstDate.getActualMinimum(Calendar.DAY_OF_MONTH))</br>
                setTimeToBeginningOfDay(firstDate)</br>
                dates[0] = firstDate.getTime()</br>

                def currentDate = getCalendarForNow()</br>
                dates[1] = currentDate.getTime()</br>

                def lastDate = getCalendarForNow()</br>
                lastDate.set(Calendar.DAY_OF_MONTH, lastDate.getActualMaximum(Calendar.DAY_OF_MONTH))</br>
                setTimeToEndofDay(thirdDate)</br>
                dates[2] = lastDate.getTime()</br>

                dates</br>
            }</br>

            def getCalendarForNow() {</br>
                Calendar calendar = GregorianCalendar.getInstance()</br>
                calendar.setTime(new Date())</br>
                return calendar</br>
            }</br>

            def setTimeToBeginningOfDay(Calendar calendar) {</br>
                calendar.set(Calendar.HOUR_OF_DAY, 0)</br>
                calendar.set(Calendar.MINUTE, 0)</br>
                calendar.set(Calendar.SECOND, 0)</br>
                calendar.set(Calendar.MILLISECOND, 0)</br>
            }</br>

            def setTimeToEndofDay(Calendar calendar) {</br>
                calendar.set(Calendar.HOUR_OF_DAY, 23)</br>
                calendar.set(Calendar.MINUTE, 59)</br>
                calendar.set(Calendar.SECOND, 59)</br>
                calendar.set(Calendar.MILLISECOND, 999)</br>
            }</br>
            </pre>
        </code>
    </div>

</div>
</body>
</html>