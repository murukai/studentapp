<div class="container">

	<div class="row">

		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>
		<!-- Added breadcrumb component -->
		<div class="row">

			<div class="col-lg-12">

				<c:if test="${userClickFormStudents == true}">
					<script>
						window.studentFormId = '${studentForm.id}';
					</script>

					<ol class="breadcrumb">


						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">Classes</li>
						<li class="active">${studentForm.name}</li>


					</ol>
				</c:if>


			</div>


		</div>

		<div class="row">

			<div class="col-xs-12">

				<table class="table table-striped table-borderd" id="studentTable">
					<thead>
						<tr>
							<th>ID</th>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Gender</th>
							<th>Date Of Birth</th>
							<th>Enrollment Date</th>
							<th>Registration Number</th>
							<th></th>
						</tr>
					</thead>
					<tfoot>
						<tr>
							<th>ID</th>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Gender</th>
							<th>Date Of Birth</th>
							<th>Enrollment Date</th>
							<th>Registration Number</th>
							<th></th>
						</tr>
					</tfoot>
				</table>
			</div>
		</div>

	</div>
</div>