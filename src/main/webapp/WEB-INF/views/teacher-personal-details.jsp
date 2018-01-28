<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div class="container">
	<div class="row">

		<div class="col-md-offset-2 col-md-8">

			<div class="panel panel-primary">

				<div class="panel-heading">

					<h4>Profile Management</h4>

				</div>

				<div class="panel-body">
					<sf:form class="form-horizontal" modelAttribute="teacher"
						action="${contextRoot}/manage/edit/teacher/personal" method="POST">
						<div class="form-group">
							<label for="id" class="control-label col-md-4">Id</label>
							<div class="col-md-8">
								<div class="input-group">
									<sf:input type="text" class="form-control" path="id"  placeholder="Id"/>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="firstname" class="control-label col-md-4">First Name</label>
							<div class="col-md-8">
								<div class="input-group">
									<sf:input type="text" class="form-control" path="firstname"  placeholder="Enter your First Name"/>
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label for="lastname" class="control-label col-md-4">Last Name</label>
							<div class="col-md-8">
								<div class="input-group">
									<sf:input type="text" class="form-control" path="lastname"  placeholder="Enter your Last Name"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Gender</label>
							<div class="input-group">
								<label class="radio-inline">
									<sf:radiobutton path="gender" value="male" checked="checked"/> male				
								</label>
								<label class="radio-inline">
									<sf:radiobutton path="gender" value="female"/> female
								</label>
							</div>
						</div>	

						<div class="form-group">
							<label for="email" class="control-label col-md-4">Birth Date</label>
							<div class="col-md-8">
								<div class="input-group">
									<sf:input type="text" class="form-control" path="birthDate"  placeholder="dd-mm-yyyy"/>
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label for="idNumber" class="control-label col-md-4">ID Number</label>
							<div class="col-md-8">
								<div class="input-group">
									<sf:input type="text" class="form-control" path="idNumber"  placeholder="Place your ID Number"/>
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label for="email" class="control-label col-md-4">Date Enrolled service</label>
							<div class="col-md-8">
								<div class="input-group">
									<sf:input type="text" class="form-control" path="dateEnrolled"  placeholder="Date Enrolled service"/>
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label for="ecnumber" class="control-label col-md-4">Email</label>
							<div class="col-md-8">
								<div class="input-group">
									<sf:input type="text" class="form-control" path="ecnumber"  placeholder="Place your EC Number"/>
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label for="email" class="control-label col-md-4">Email</label>
							<div class="col-md-8">
								<div class="input-group">
									<sf:input type="text" class="form-control" path="email"  placeholder="example@haisiemail.com"/>
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label class="control-label col-md-4">Marital Status</label>
							<div class="input-group">
								
								<label class="radio-inline">
									<sf:radiobutton path="maritalStatus" value="single" checked="checked"/> single				
								</label>
								<label class="radio-inline">
									<sf:radiobutton path="maritalStatus" value="married"/>married
								</label>
							</div>
						</div>	
						
						<div class="form-group">
							<label class="control-label col-md-4">Department</label>
							<div class="col-md-8">
								<sf:select path="departmentId" items="${departments}"
									itemLabel="name" itemValue="id"  class="form-control" />
							</div>

						</div>
						
						<div class="form-group">

							<div class="col-md-offset-4 col-md-4">

								<input type="submit" name="submit" value="Save Profile"
									class="btn btn-primary" />

							</div>
						</div>

					</sf:form>

				</div>

			</div>

		</div>

	</div>
	
</div>