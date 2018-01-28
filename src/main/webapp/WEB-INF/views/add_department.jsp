<div class="container">
	<div class="row">

		<div class="col-md-offset-2 col-md-8">

			<div class="panel panel-primary">

				<div class="panel-heading">

					<h4>Sport Management</h4>

				</div>

				<div class="panel-body">
					<sf:form id="categoryForm" class="form-horizontal"
						modelAttribute="department"
						action="${contextRoot}/manage/department" method="POST">

						<div class="form-group">
							<label class="control-label col-md-4">Name</label>
							<div class="col-md-8 validate">
								<sf:input type="text" path="name" class="form-control"
									placeholder="Department name" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Description</label>
							<div class="col-md-8 validate">
								<sf:textarea path="description" class="form-control"
									placeholder="Enter department description here!" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Number of Teachers</label>
							<div class="col-md-8 validate">
								<sf:input type="text" path="numberOfTeacher"
									class="form-control"
									placeholder="Number of teachers in the department" />
							</div>
						</div>

						<div class="form-group">
							<div class="col-md-offset-4 col-md-4">
								<input type="submit" name="submit" value="Add Department"
									class="btn btn-primary" />
							</div>
						</div>
					</sf:form>

				</div>

			</div>

		</div>
	</div>
	<div class="container-fluid">
		<div class="row">


			<div class='col-xs-12'>


				<table id="departmentsTable" class="table table-condensed table-bordered">

					<thead>
						<tr>
							<th>Name</th>
							<th>Description</th>
							<th>Number Of Teachers</th>
							<th></th>
						</tr>
					</thead>

					<tfoot>
						<tr>
							<th>Name</th>
							<th>Description</th>
							<th>Number Of Teachers</th>
							<th></th>
						</tr>
					</tfoot>


				</table>


			</div>


		</div>
	</div>
</div>