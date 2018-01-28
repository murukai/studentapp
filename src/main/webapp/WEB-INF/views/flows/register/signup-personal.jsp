<%@include file="../flow-shared/header.jsp" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>	
	<div class="container">
			<div class="row main center-div">
				<div class="main-login main-center">
				<h3>Sign up</h3>
					<sf:form method="POST"
							modelAttribute="user"
							class="form-horizontal"
							id="registerForm">
						
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">First Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<sf:input type="text" class="form-control" path="firstname"  placeholder="Enter your First Name"/>
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Last Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<sf:input type="text" class="form-control" path="lastname"  placeholder="Enter your Last Name"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Gender</label>
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
								<label class="radio-inline">
									<sf:radiobutton path="gender" value="male" checked="checked"/> male				
								</label>
								<label class="radio-inline">
									<sf:radiobutton path="gender" value="female"/> female
								</label>
							</div>
						</div>	

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Birth Date</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
									<sf:input type="text" class="form-control" path="birthDate"  placeholder="dd-mm-yyyy"/>
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">ID Number</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
									<sf:input type="text" class="form-control" path="idNumber"  placeholder="ID Number"/>
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label for="username" class="cols-sm-2 control-label">Username</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
									<sf:input type="text" class="form-control" path="username" placeholder="Enter your Username"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<sf:input type="password" class="form-control" path="password" placeholder="Enter your Password"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="confirm" class="cols-sm-2 control-label">Confirm Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<sf:input type="password" class="form-control" path="confirmPassword" placeholder="Confirm your Password"/>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-4">Your Role</label>
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
								<label class="radio-inline">
									<sf:radiobutton path="role" value="student" checked="checked"/> student 				
								</label>
								<label class="radio-inline">
									<sf:radiobutton path="role" value="teacher"/> teacher
								</label>
								<label class="radio-inline">
									<sf:radiobutton path="role" value="guardian"/> guardian
								</label>
							</div>
						</div>	
						<div class="form-group ">
							<button type="submit" name="_eventId_billing" class="btn btn-success">Next - Address
								<span class="glyphicon glyphicon-chevron-right"></span>
							</button>
						</div>
						
					</sf:form>
				</div>
			</div>
		</div>
		
<%@include file="../flow-shared/footer.jsp" %>		