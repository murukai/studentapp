<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- Page Content -->
<div class="container">
	<div class="row carousel-holder">

		<div class="col-md-12">
			<div id="carousel-example-generic" class="carousel slide"
				data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#carousel-example-generic" data-slide-to="0"
						class="active"></li>
					<li data-target="#carousel-example-generic" data-slide-to="1"></li>
					<li data-target="#carousel-example-generic" data-slide-to="2"></li>
					<li data-target="#carousel-example-generic" data-slide-to="3"></li>
				</ol>
				<div class="carousel-inner">

					<div class="item active">
						<img class="slide-image" src="${images}/Chicago Bulls Logo Wallpaper HD Cool Sport Wallpapers.jpg" alt="">
					</div>
					<div class="item">
						<img class="slide-image" src="${images}/biking_flying_cycling.jpg" alt="">
					</div>
					<div class="item">
						<img class="slide-image" src="${images}/climber_extreme.jpg" alt="">
					</div>
					<div class="item">
						<img class="slide-image" src="${images}/hand_swimmer.jpg" alt="">
					</div>
				</div>
				<a class="left carousel-control" href="#carousel-example-generic"
					data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left"></span>
				</a> <a class="right carousel-control" href="#carousel-example-generic"
					data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right"></span>
				</a>
			</div>
		</div>

	</div>

	<h1 class="my-4">Welcome to - Mufakose ${title}</h1>
	<h4>
		<u>Up coming Sports</u>
	</h4>
	<c:if test="${futureSportAvailable == true }">
		<!-- Marketing Icons Section -->
		<div class="row">
			<c:forEach var="sportEvent" items="${futureSportEvent}">
				<div class="col-lg-4 mb-4">
					<div class="card h-100">
						<h4 class="card-header">${sportEvent.name}</h4>
						<div class="card-body">
							<p class="card-text">${sportEvent.description}-
								${sportEvent.eventTime}</p>
						</div>
						<div class="card-footer">
							<a href="#" class="btn btn-primary">Learn More</a>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</c:if>
	<c:if test="${futureSportAvailable == false }">
		<hr>
		<h3>Sports - ${sportTitle}</h3>
	</c:if>
	<!-- /.row -->

	<!-- Portfolio Section -->
	<h2>Sport news</h2>

	<div class="row">
		<c:if test="${pastSportAvailable == true}">
			<c:forEach items="${pastSportEvent }" var="sportEvent">
				<div class="col-lg-4 col-sm-6 portfolio-item">
					<div class="card h-100">
						<a href="#"><img class="card-img-top"
							src="http://placehold.it/200x200" alt=""></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href="#">${sportEvent.name }</a>
							</h4>
							<p class="card-text">${sportEvent.description }-
								${sportEvent.eventTime}</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</c:if>
		<c:if test="${pastSportAvailable == false}">
			<hr>
			<h3>Sports - ${sportTitle}</h3>
		</c:if>
	</div>
	<!-- /.row -->

	<!-- Features Section -->
	<div class="row">
		<div class="col-lg-6">
			<h2>Modern Business Features</h2>
			<p>The Modern Business template by Start Bootstrap includes:</p>
			<ul>
				<li><strong>Bootstrap v4</strong></li>
				<li>jQuery</li>
				<li>Font Awesome</li>
				<li>Working contact form with validation</li>
				<li>Unstyled page elements for easy customization</li>
			</ul>
			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
				Corporis, omnis doloremque non cum id reprehenderit, quisquam totam
				aspernatur tempora minima unde aliquid ea culpa sunt. Reiciendis
				quia dolorum ducimus unde.</p>
		</div>
		<div class="col-lg-6">
			<img class="img-fluid rounded" src="http://placehold.it/700x450"
				alt="">
		</div>
	</div>
	<!-- /.row -->

	<hr>

	<!-- Call to Action Section -->
	<div class="row mb-4">
		<div class="col-md-8">
			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
				Molestias, expedita, saepe, vero rerum deleniti beatae veniam harum
				neque nemo praesentium cum alias asperiores commodi.</p>
		</div>
		<div class="col-md-4">
			<a class="btn btn-lg btn-secondary btn-block"
				href="${contextRoot }/manage/add/sport">Add Sport</a>
		</div>
	</div>

</div>
<!-- /.container -->

