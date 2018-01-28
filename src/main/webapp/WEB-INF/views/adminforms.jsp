<div class="container">
	<div class="row">
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>
		<div class="col-md-9">
			<!-- Added breadcrumb component -->
			<div class="row">

				<div class="col-lg-12">

					<c:if test="${userClickLevels == true}">

						<script>
							window.levelId = '';
						</script>

						<ol class="breadcrumb">


							<li><a href="${contextRoot}/home">Home </a></li>
							<li class="active">/ All Levels</li>


						</ol>
					</c:if>


					<c:if test="${userClickLevelForms == true}">
						<script>
							window.levelId = '${level.id}';
						</script>

						<ol class="breadcrumb">


							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">/ Levels</li>
							<li class="active">/ ${level.name}</li>


						</ol>
					</c:if>


				</div>


			</div>

			<div class="row">

				<div class="col-xs-12">

					<table class="table table-striped table-borderd"
						id="studentFormTable">
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
</div>