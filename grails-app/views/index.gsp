<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Welcome to Grails</title>
		<style type="text/css" media="screen">
			#status {
				background-color: #eee;
				border: .2em solid #fff;
				margin: 2em 2em 1em;
				padding: 1em;
				width: 12em;
				float: left;
				-moz-box-shadow: 0px 0px 1.25em #ccc;
				-webkit-box-shadow: 0px 0px 1.25em #ccc;
				box-shadow: 0px 0px 1.25em #ccc;
				-moz-border-radius: 0.6em;
				-webkit-border-radius: 0.6em;
				border-radius: 0.6em;
			}

			.ie6 #status {
				display: inline; /* float double margin fix http://www.positioniseverything.net/explorer/doubled-margin.html */
			}

			#status ul {
				font-size: 0.9em;
				list-style-type: none;
				margin-bottom: 0.6em;
				padding: 0;
			}

			#status li {
				line-height: 1.3;
			}

			#status h1 {
				text-transform: uppercase;
				font-size: 1.1em;
				margin: 0 0 0.3em;
			}

			#page-body {
				margin: 2em 1em 1.25em 18em;
			}

			h2 {
				margin-top: 1em;
				margin-bottom: 0.3em;
				font-size: 1em;
			}

			p {
				line-height: 1.5;
				margin: 0.25em 0;
			}

			#controller-list ul {
				list-style-position: inside;
			}

			#controller-list li {
				line-height: 1.3;
				list-style-position: inside;
				margin: 0.25em 0;
			}

			@media screen and (max-width: 480px) {
				#status {
					display: none;
				}

				#page-body {
					margin: 0 1em 1em;
				}

				#page-body h1 {
					margin-top: 0;
				}
			}
		</style>
	</head>
	<body>
		<a href="#page-body" class="skip"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div id="status" role="complementary">
			<h1>Test 1</h1>
			<p>Generate a Grails application that allows uploading a file. Once the file is loaded, the application must validate and parse each line of file information (plaintext) and then upload the information to the database</p>
			<h1>Test 2</h1>
			<p>Using this webservice www.webservicex.net/ ConvertTemperature.asmx?WSDL, make a calculator to do conversions of temperature. Preferably the results should be displayed asynchronously.</p>
			<h1>Test 3</h1>
			<p>Write a function that returns an array with three dates Date type. The first date should be the first day of the current month, the second must be the current date and the third time should be 23:59 on the last day of the current month</p>
		</div>
		<div id="page-body" role="main">
			<h1>Welcome to Groovy & Grails Test</h1>
			<p>Congratulations, you have selected to take the test!!!</p>

			<div id="controller-list" role="navigation">
				<h2>Solutions:</h2>
				<ul>
					<li><g:link controller="user" action="index">Upload file</g:link></li>
					<li><g:link controller="calculator" action="index">Calculator</g:link></li>
					<li><g:link controller="date" action="index">Dates</g:link></li>
				</ul>
			</div>
		</div>
	</body>
</html>
