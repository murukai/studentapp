<%@include file="../flow-shared/header.jsp" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>	
	<div class="container">
			<div class="row main center-div">
				<div class="main-login main-center">
				<h3>Billing Address</h3>
					<sf:form method="POST"
							modelAttribute="billing"
							class="form-horizontal"
							id="registerForm">
						
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Address Line One</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<sf:input type="text" class="form-control" path="lineOne"  placeholder="Address line one"/>
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Address Line Two</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<sf:input type="text" class="form-control" path="linetwo"  placeholder="Address Line Two"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Cell Phone Number</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<sf:input type="text" class="form-control" path="cellPhone"  placeholder="Cell number"/>
								</div>
							</div>
						</div>	

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Phone Number</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
									<sf:input type="text" class="form-control" path="phone"  placeholder="land line number"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="username" class="cols-sm-2 control-label">City</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
									<sf:input type="text" class="form-control" path="city" placeholder="City"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Province</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<sf:input type="text" class="form-control" path="province" placeholder="Province"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="confirm" class="cols-sm-2 control-label">Country</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<sf:input type="text" class="form-control" path="country" placeholder="Country"/>
								</div>
							</div>
						</div>
							
						<div class="form-group">
							<div class="col-md-offset-4 col-md-6">
								<button type="submit" name="_eventId_personal" class="btn btn-success">
									<span class="glyphicon glyphicon-chevron-left"></span>Personal
								</button>																									 
							</div>
							<div class="col-md-offset-4 col-md-6">
								<button type="submit" name="_eventId_confirm" class="btn btn-success">
										Confirm<span class="glyphicon glyphicon-chevron-right"></span>
								</button>
						    </div>
						</div>
						
					</sf:form>
				</div>
			</div>
		</div>
		
<%@include file="../flow-shared/footer.jsp" %>		