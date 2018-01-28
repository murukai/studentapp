<div class="container">
	<div class="jumbotron">    
                  <div class="row">
					<div class="col-md-3 col-xs-12 col-sm-6 col-lg-3">
                        <div class="thumbnail text-center photo_view_postion_b" >
							<img src="${images }/profile.jpg" alt=""
								class="img-rounded img-responsive" />
						</div>
						<div class="row text-right">
							<small><cite title="San Francisco, USA"><i
									class="glyphicon glyphicon-map-marker">${userModel.fullname} </i>
							</cite></small>
						</div>
					</div>
					<c:if test="${userClickTeacherProfile == true }">
						<div class="col-md-9 col-xs-12 col-sm-6 col-lg-9">
                          <div class="" style="border-bottom:1px solid black">
                            <h2>${userModel.fullname}</h2>
                          </div>
                            <hr>
                          <div class="col-md-8">  
                          <ul class=" details">
                            <li><p><span class="glyphicon glyphicon-earphone one" style="width:50px;"></span>${address.cellPhone}</p></li>
                            <li><p><span class="glyphicon glyphicon-envelope one" style="width:50px;"></span>${teacher.email }</p></li>
                            <li><p><span class="glyphicon glyphicon-map-marker one" style="width:50px;"></span>Hyderabad</p></li>
                            <li><p><span class="glyphicon glyphicon-credit-card one" style="width:50px;"></span>66330007</p></li>
                          </ul>
                          </div>
                          <div class="col-md-4">  
                            <div class="col-sm-5 col-xs-6 tital " >Birthday:</div><div class="col-sm-7 col-xs-6 ">2018/2/15</div>
                            <div class="clearfix"></div><div class="bot-border"></div>
                            <div class="col-sm-5 col-xs-6 tital " >Gender:</div><div class="col-sm-7 col-xs-6 ">Prasad</div>
                            <div class="clearfix"></div><div class="bot-border"></div>
                            <div class="col-sm-5 col-xs-6 tital " >Ethnicity:</div><div class="col-sm-7 col-xs-6 ">sdfsdfsdfsdfsdf</div>
                            <div class="clearfix"></div><div class="bot-border"></div>
                          </div>
                      </div>
                      <div class="row">
                      <div class="form-group row">
                        <div class="col-md-12">
                        <div class="form-group" style="border-bottom:1px solid black">
                            <h2>CONTACT INFO</h2>
                        </div>
                        </div>
                      </div>
                    </div>
                    <div class="row"> 
                     <div class="col-md-6">
                        <div class="col-sm-6 col-xs-6 tital " >Address Line 1 :</div><div class="col-sm-6 col-xs-6 contant_i">Prasad</div>
                        <div class="clearfix"></div><div class="bot-border"></div>
                        <div class="col-sm-6 col-xs-6 tital " >Address Line 2:</div><div class="col-sm-6 col-xs-6 contant_i">Prasad</div>
                        <div class="clearfix"></div><div class="bot-border"></div>
                        <div class="col-sm-6 col-xs-6 tital " >City :</div><div class="col-sm-6 col-xs-6 contant_i">Prasad</div>
                        <div class="clearfix"></div><div class="bot-border"></div>
                        <div class="col-sm-6 col-xs-6 tital " >Province :</div><div class="col-sm-6 col-xs-6 contant_i">Prasad</div>
                        <div class="clearfix"></div><div class="bot-border"></div>
                        <div class="col-sm-6 col-xs-6 tital " >Country :</div><div class="col-sm-6 col-xs-6 contant_i">Prasad</div>
                        <div class="clearfix"></div><div class="bot-border"></div>
                     </div>
                     <div class="col-md-6">
                        <div class="col-sm-6 col-xs-6 tital " >Phone :</div><div class="col-sm-6 col-xs-6 contant_i">Prasad</div>
                        <div class="clearfix"></div><div class="bot-border"></div>
                        <div class="col-sm-6 col-xs-6 tital " >E-mail :</div><div class="col-sm-6 col-xs-6 contant_i">Prasad</div>
                        <div class="clearfix"></div><div class="bot-border"></div>
                        <div class="col-sm-6 col-xs-6 tital " >Bust:</div><div class="col-sm-6 col-xs-6 contant_i">Prasad</div>
                        <div class="clearfix"></div><div class="bot-border"></div>
                        <div class="col-sm-6 col-xs-6 tital " >Waist:</div><div class="col-sm-6 col-xs-6 contant_i">Prasad</div>
                        <div class="clearfix"></div><div class="bot-border"></div>
                        <div class="col-sm-6 col-xs-6 tital " >Inseam:</div><div class="col-sm-6 col-xs-6 contant_i">Prasad</div>
                        <div class="clearfix"></div><div class="bot-border"></div>
                     </div>
                    
                    </div>
                    </c:if>
				</div>
				<div>
					<a class="btn btn-primary" href="${contextRoot }/${user.id}/personal-details">Edit Profile</a>
				</div>
			</div>
		</div>




