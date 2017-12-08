
<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<div class="container">
		<a class="navbar-brand" href="${contextRoot }/home">Mufakose Secondary</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link"
					href="${contextRoot }/home">Home <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><div class="dropdown">
						<button class="btn btn-primary dropdown-toggle" type="button"
							id="dropdownMenuButton" data-toggle="dropdown"
							aria-haspopup="true" aria-expanded="false">Manage</button>
						<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
							<a class="dropdown-item" href="${contextRoot }/manage/students">Students</a> 
							<a class="dropdown-item" href="${contextRoot }/manage/sports">Sports</a> 
							<a class="dropdown-item" href="${contextRoot }/manage/accounts">Accounts</a>
							<a class="dropdown-item" href="${contextRoot }/manage/books">Books</a>
						</div>
					</div></li>
				<li class="nav-item"><a class="nav-link"
					href="${contextRoot }/login">Students</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${contextRoot }/sport">Sports</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${contextRoot }/department">Departments</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${contextRoot }/about">About</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Services</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="${contextRoot }/contact">Contact</a></li>
			</ul>
		</div>
	</div>
</nav>