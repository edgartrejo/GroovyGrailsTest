<%@ page import="groovygrailstest.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'userid', 'error')} required">
	<label for="userid">
		<g:message code="user.userid.label" default="Userid" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="userid" maxlength="10" pattern="${userInstance.constraints.userid.matches}" required="" value="${userInstance?.userid}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'coins', 'error')} required">
	<label for="coins">
		<g:message code="user.coins.label" default="Coins" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="coins" type="number" value="${userInstance.coins}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'username', 'error')} required">
	<label for="username">
		<g:message code="user.username.label" default="Username" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="username" required="" value="${userInstance?.username}"/>

</div>

