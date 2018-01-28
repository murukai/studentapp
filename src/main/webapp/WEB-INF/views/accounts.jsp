<div class="container">
    <h3>Welcome to ${title } - Click the filter icon <small>(<i class="glyphicon glyphicon-filter"></i>)</small></h3>
    	<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="panel-title">${title }</h3>
						<div class="pull-right">
							<span class="clickable filter" data-toggle="tooltip" title="Toggle table filter" data-container="body">
								<i class="glyphicon glyphicon-filter"></i>
							</span>
						</div>
					</div>
					<div class="panel-body">
						<input type="text" class="form-control" id="dev-table-filter" data-action="filter" data-filters="#dev-table" placeholder="Filter Developers" />
					</div>
					<table class="table table-hover" id="dev-table">
						<thead>
							<tr>
								<th>#</th>
								<th>First Name</th>
								<th>Last Name</th>
								<th>Username</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1</td>
								<td>Kilgore</td>
								<td>Trout</td>
								<td>kilgore</td>
								<td>  <button class="btn btn-success"><span class="glyphicon glyphicon-info-sign"></span></button></td>
							</tr>
							<tr>
								<td>2</td>
								<td>Bob</td>
								<td>Loblaw</td>
								<td>boblahblah</td>
								<td>  <button class="btn btn-success"><span class="glyphicon glyphicon-info-sign"></span></button></td>
							</tr>
							<tr>
								<td>3</td>
								<td>Holden</td>
								<td>Caulfield</td>
								<td>penceyreject</td>
								<td>  <button class='btn btn-success glyphicon glyphicon-info-sign'></button></td>
							</tr>
							<tr>
								<td>1</td>
								<td>Site Wireframes</td>
								<td>John Smith</td>
								<td>in progress</td>
								<td>  <button class="btn btn-success"><span class="glyphicon glyphicon-info-sign"></span></button></td>
							</tr>
							<tr>
								<td>2</td>
								<td>Mobile Landing Page</td>
								<td>Kilgore Trout</td>
								<td>completed</td>
								<td>  <button class="btn btn-success"><span class="glyphicon glyphicon-info-sign"></span></button></td>
							</tr>
							<tr>
								<td>3</td>
								<td>Add SEO tags</td>
								<td>Bob Loblaw</td>
								<td>failed qa</td>
								<td>  <button class="btn btn-success"><span class="glyphicon glyphicon-info-sign"></span></button></td>
							</tr>
							<tr>
								<td>4</td>
								<td>Migrate to Bootstrap 3</td>
								<td>Emily Hoenikker</td>
								<td>in progress</td>
								<td>  <button class="btn btn-success"><span class="glyphicon glyphicon-info-sign"></span></button></td>
							</tr>
							<tr>
								<td>5</td>
								<td>Update jQuery library</td>
								<td>Holden Caulfield</td>
								<td>deployed</td>
								<td>  <button class="btn btn-success"><span class="glyphicon glyphicon-info-sign"></span></button></td>
							</tr>
							<tr>
								<td>6</td>
								<td>Issues in IE7</td>
								<td>Jane Doe</td>
								<td>failed qa</td>
								<td>  <button class="btn btn-success"><span class="glyphicon glyphicon-info-sign"></span></button></td>
							</tr>
							<tr>
								<td>7</td>
								<td>Bugs from Sprint 14</td>
								<td>Kilgore Trout</td>
								<td>completed</td>
								<td>  <button class="btn btn-success"><span class="glyphicon glyphicon-info-sign"></span></button></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			
		</div>
	</div>