<!DOCTYPE html>
<%! import ws.client.TemperatureUnit   %>
<html>
<head>
	<meta name="layout" content="main">
	<g:set var="entityName" value="${message(code: 'calculator.label', default: 'Calculator')}" />
	<title>Calculator</title>
	<g:javascript library="jquery" plugin="jquery"/>
	<script>
		function getCalculus(temp,from,to) {
			<g:remoteFunction controller="calculator" action="calculate" update="result" params="'temperature='+temp+'&fromUnit='+from+'&toUnit='+to"/>
		}
	</script>
</head>
<body>
<a href="#create-calculator" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
<div class="nav" role="navigation">
	<ul>
		<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
	</ul>
</div>
<div id="create-calculator" class="content scaffold-create" role="main">
	<h1>Calculator</h1>
	<g:if test="${flash.message}">
		<div class="message" role="status">${flash.message}</div>
	</g:if>
	<g:hasErrors bean="${calculatorInstance}">
		<ul class="errors" role="alert">
			<g:eachError bean="${calculatorInstance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
			</g:eachError>
		</ul>
	</g:hasErrors>
	<div align="center">
		<table>
			<tr>
				<td align="right">
					<label class="form">Temperature: </label>
				</td>
				<td align="left">
					<g:field type="number" onchange="getCalculus(this.value, document.getElementById('fromUnit').value,document.getElementById('toUnit').value)"  name="temperature"/><br/>
				</td>
			</tr>
			<tr>
				<td align="right">
					<label class="form">From: </label>
				</td>
				<td align="left">
					<g:select name="fromUnit" onchange="getCalculus(document.getElementById('temperature').value,this.value,document.getElementById('toUnit').value)" from="${TemperatureUnit.values()}" value="${TemperatureUnit}" optionKey="value"/>
				</td>
			</tr>
			<tr>
				<td align="right">
					<label class="form">To: </label>
				</td>
				<td align="left">
					<g:select name="toUnit" onchange="getCalculus(document.getElementById('temperature').value, document.getElementById('fromUnit').value,this.value, this.value)" from="${TemperatureUnit.values()}" value="${TemperatureUnit}" optionKey="value"/>
				</td>
			</tr>
			<tr>
				<td align="right">
					<label class="form">Temperature Converted: </label>
				</td>
				<td align="left">
					<div id="result">
					</div>
				</td>
			</tr>
		</table>
		%{--</g:form>--}%
	</div>
</div>
</body>
</html>