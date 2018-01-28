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

					<h4>Sport Management</h4>

				</div>

				<div class="panel-body">
					<sf:form class="form-horizontal" modelAttribute="sportEvent"
						action="${contextRoot}/manage/add/sports" method="POST">
						<div class="form-group">
							<label class="control-label col-md-4">Name</label>
							<div class="col-md-8">
								<sf:input type="text" path="name" class="form-control"
									placeholder="Sport Event Name" />
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
							<label class="control-label col-md-4">Contact Person Name</label>
							<div class="col-md-8">
								<sf:input type="text" path="contactPersonName"
									class="form-control" placeholder="Contact Person Name" />
								<sf:errors path="contactPersonName" cssClass="help-block"
									element="em" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-4">Contact Person
								Phone</label>
							<div class="col-md-8">
								<sf:input type="text" path="contactPersonPhone"
									class="form-control" placeholder="Contact Person Phone" />
								<sf:errors path="contactPersonPhone" cssClass="help-block"
									element="em" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-4">Contact Person
								Email</label>
							<div class="col-md-8">
								<sf:input type="email" path="contactPersonEmail"
									class="form-control" placeholder="Contact Person Email" />
								<sf:errors path="contactPersonEmail" cssClass="help-block"
									element="em" />
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-4">Venue</label>
							<div class="col-md-8">
								<sf:input type="text" path="venue" class="form-control"
									placeholder="Enter venue" />
								<sf:errors path="venue" cssClass="help-block" element="em" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Date</label>
							<div class="col-md-8">
								<sf:input type="text" path="time" class="form-control"
									placeholder="Enter Date" />
								<sf:errors path="time" cssClass="help-block" element="em" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Category</label>
							<div class="col-md-8">
								<sf:select path="sportCategoryId" items="${categories}"
									itemLabel="name" itemValue="id"  class="form-control" />

								<div class="text-right">
									<br />
									<sf:hidden path="id" />
									<sf:hidden path="name" />
									<sf:hidden path="description" />
									<sf:hidden path="venue" />
									<sf:hidden path="contactPersonName" />
									<sf:hidden path="contactPersonPhone" />
									<sf:hidden path="contactPersonEmail" />
									<sf:hidden path="time" />
									<button type="button" class="btn btn-warning btn"
										data-toggle="modal" data-target="#myCategoryModal">Add
										New Category</button>
								</div>

							</div>

						</div>
				
						<div class="form-group">

							<div class="col-md-offset-4 col-md-4">

								<input type="submit" name="submit" value="Save Sport Event"
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

					<sf:form id="categoryForm" class="form-horizontal"
						modelAttribute="sportCategory"
						action="${contextRoot}/manage/sport/category" method="POST">

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
							<label class="control-label col-md-4">Sporting
								Instruments</label>
							<div class="col-md-8 validate">
								<sf:input type="text" path="sportingInstruments"
									class="form-control" placeholder="Sporting Instruments" />
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


				<table id="sportsTable" class="table table-condensed table-bordered">

					<thead>
						<tr>
							<th>Name</th>
							<th>Description</th>
							<th>Venue</th>
							<th>Contact Person</th>
							<th>Phone</th>
							<th>Event Time</th>
							<th></th>
						</tr>
					</thead>

					<tfoot>
						<tr>
							<th>Name</th>
							<th>Description</th>
							<th>Venue</th>
							<th>Contact Person</th>
							<th>Phone</th>
							<th>Event Time</th>
							<th></th>
						</tr>
					</tfoot>


				</table>


			</div>


		</div>
	</div>

</div>