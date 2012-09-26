<%@ page import="org.codehaus.groovy.grails.web.servlet.GrailsApplicationAttributes" %>
<!doctype html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<title><g:layoutTitle default="${meta(name: 'app.name')}"/></title>
		<meta name="description" content="">
		<meta name="author" content="">

		<meta name="viewport" content="initial-scale = 1.0">

		<r:require modules="scaffolding"/>


		<link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon">
<g:layoutHead/>
		<r:layoutResources/>
	</head>

	<body><%--
       <g:render template='/includes/ajaxLogin' />
       --%><div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
				<div class="container" style="width:auto;">
					
					<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</a>
					
					<a class="brand" href="${createLink(uri: '/')}">Grails Twitter Bootstrap</a>

					<div class="nav-collapse">
						<ul class="nav">							
							<li class="dropdown">
		<a class="dropdown-toggle" data-toggle="dropdown" href="#">Preview <b class="caret"></b></a>
		<ul class="dropdown-menu" id="swatch-menu">
			<li><a href="#">test</a></li>
			<li class="divider"></li>
		
		</ul>
	</li>
						</ul>
					</div>
					<div class="nav-collapse">
					
					

<ul class="nav pull-right" id="main-menu-right">
<sec:ifLoggedIn>
			<li><a href="/profile">Logged in as <sec:username /> </a></li>
			<li class="divider"></li>
			<li><g:link controller='logout'>Logout</g:link></li>  
      	</sec:ifLoggedIn> 
      
		<sec:ifNotLoggedIn>
			<li><g:link controller='login' action='auth'>Login</g:link> </li>
			 <li class="divider-vertical"></li>
			<li><g:link controller='register' action='index'>Register</g:link> </li>
		</sec:ifNotLoggedIn>
</ul>

					</div>
				
				</div>
			</div>
			</div>
<div class="container-fluid">
<br/><br>
			<g:layoutBody/>

			<hr>

			<footer>
				<p>&copy; AlexSoft 2012</p>
			</footer>
		</div>

		<r:layoutResources/>

	</body>
</html>