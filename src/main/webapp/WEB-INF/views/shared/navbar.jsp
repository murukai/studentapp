<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="${contextRoot}/home">Student Management</a>
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li id="about"><a href="${contextRoot}/about">About</a></li>

				<li id="contact"><a href="${contextRoot}/contact">Contact</a></li>

				<li class="nav-item"><a class="nav-link"
					href="${contextRoot }/login">Students</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${contextRoot }/sport">Sports</a></li>

				<li class="nav-item"><a class="nav-link"
					href="${contextRoot }/about">About</a></li>
				<security:authorize access="hasAuthority('teacher')">
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Manage<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item"
							href="${contextRoot }/manage/show/levels">Students</a></li>
						<li><a class="dropdown-item"
							href="${contextRoot }/manage/add/sports">Sports</a></li>
						<li><a class="dropdown-item"
							href="${contextRoot }/manage/accounts">Accounts</a></li>
						<li><a class="dropdown-item"
							href="${contextRoot }/manage/books">Books</a></li>
						<li><a class="dropdown-item"
							href="${contextRoot }/manage/teachers">Teachers</a></li>
						<li><a class="dropdown-item"
							href="${contextRoot }/manage/department">Departments</a></li>
						<li><a class="dropdown-item"
							href="${contextRoot }/manage/events">Events</a></li>
						<li><a class="dropdown-item"
							href="${contextRoot }/manage/subjects">Subjects</a></li>
						<li><a class="dropdown-item"
							href="${contextRoot }/manage/levels">levels</a></li>
					</ul></li>
			</security:authorize>
			</ul>

			<ul class="nav navbar-nav navbar-right">
				<security:authorize access="isAnonymous()">
				<li id="membership"><a href="${contextRoot}/register">Sign Up</a>
				</li>
				<li id="login"><a href="${contextRoot}/login">Login</a></li>
				</security:authorize>
				<security:authorize access="isAuthenticated()">
				<li class="dropdown" id="userModel">
					<a class="btn btn-default dropdown-toggle" href="javascript:void(0)" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
						    ${userModel.fullname}
					<span class="caret"></span>
					</a>
					<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
			        	<li id="profile">
			            	<a href="${contextRoot}/view/${userModel.user.id}/profile">
			                	<span class="glyphicon glyphicon-pencil"></span>&#160;<span class="badge">${userModel.fullname} - profile</span>
			                </a>
			            </li>		     
			            <li role="separator" class="divider"></li>	                                   
		                   
						<li id="logout">
		                        <a href="${contextRoot}/logout">Logout</a>
		                </li>                    			    	
					</ul>		
				</li>   
				</security:authorize>			
			</ul>

		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container -->
</nav>

