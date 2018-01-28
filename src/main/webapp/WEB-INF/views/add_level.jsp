<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="container">

	<c:if test="${not empty message}">
		<div class="row">
			<div class="col-xs-12 col-md-offset-2 col-md-8">
				<div class="alert alert-info fade in">${message}</div>
			</div>
		</div>
	</c:if>

	<div class="row">

		<div class="col-md-offset-2 col-md-8">

			<div class="panel panel-primary">

				<div class="panel-heading">

					<h4>Class Management</h4>

				</div>

				<div class="panel-body">
					<sf:form class="form-horizontal" modelAttribute="studentForm"
						action="${contextRoot}/manage/add/levels" method="POST">
						<div class="form-group">
							<label class="control-label col-md-4">Name</label>
							<div class="col-md-8">
								<sf:input type="text" path="name" class="form-control"
									placeholder="Class Name" />
								<sf:errors path="name" cssClass="help-block" element="em" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-4">Description</label>
							<div class="col-md-8">
								<sf:textarea path="description" class="form-control"
									placeholder="Enter your description here!" />
								<sf:errors path="description" cssClass="help-block" element="em" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-4">Capacity</label>
							<div class="col-md-8">
								<sf:input type="text" path="capacity"
									class="form-control" placeholder="How many students it can carry" />
								<sf:errors path="capacity" cssClass="help-block"
									element="em" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-4">Form</label>
							<div class="col-md-8">
								<sf:select path="teacherId" items="${teachers}"
									itemLabel="lastname" itemValue="id"  class="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-4">Form</label>
							<div class="col-md-8">
								<sf:select path="levelId" items="${levels}"
									itemLabel="name" itemValue="id"  class="form-control" />

								<div class="text-right">
									<br />
									<sf:hidden path="id" />
									<sf:hidden path="name" />
									<sf:hidden path="description" />
									<sf:hidden path="capacity" />
									<button type="button" class="btn btn-warning btn"
										data-toggle="modal" data-target="#myCategoryModal">Add
										New Form</button>
								</div>

							</div>

						</div>
				
						<div class="form-group">

							<div class="col-md-offset-4 col-md-4">

								<input type="submit" name="submit" value="Save Class"
									class="btn btn-primary" />

							</div>
						</div>

					</sf:form>

				</div>

			</div>

		</div>

	</div>

	<!-- Modal -->
	<div class="modal fade" id="myCategoryModal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">New Category</h4>
				</div>
				<div class="modal-body">

					<sf:form id="level" class="form-horizontal"
						modelAttribute="level"
						action="${contextRoot}/manage/studentForm/level" method="POST">

						<div class="form-group">
							<label class="control-label col-md-4">Name</label>
							<div class="col-md-8 validate">
								<sf:input type="text" path="name" class="form-control"
									placeholder="Category Name" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Description</label>
							<div class="col-md-8 validate">
								<sf:textarea path="description" class="form-control"
									placeholder="Enter category description here!" />
							</div>
						</div>

						<div class="form-group">
							<div class="col-md-offset-4 col-md-4">
								<input type="submit" name="submit" value="Save"
									class="btn btn-primary" />
							</div>
						</div>
					</sf:form>
				</div>
			</div>
		</div>
	</div>

	<hr />
	<h1>Available Sports</h1>
	<hr />
	<div class="container-fluid">
		<div class="row">


			<div class='col-xs-12'>


				<table id="editStudentFormTable" class="table table-condensed table-bordered">

					<thead>
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Description</th>
							<th>Capacity</th>
							<th></th>
						</tr>
					</thead>

					<tfoot>
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Description</th>
							<th>Capacity</th>
							<th></th>
						</tr>
					</tfoot>


				</table>


			</div>
		</div>
	</div>

</div>