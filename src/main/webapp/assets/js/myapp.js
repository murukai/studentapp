

$(function() {

	// for handling CSRF token
	var token = $('meta[name="_csrf"]').attr('content');
	var header = $('meta[name="_csrf_header"]').attr('content');
	
	if((token!=undefined && header !=undefined) && (token.length > 0 && header.length > 0)) {		
		// set the token header for the ajax request
		$(document).ajaxSend(function(e, xhr, options) {			
			xhr.setRequestHeader(header,token);			
		});				
	}
	
	// code for jquery dataTable
	var $levelListTable = $('#levelTable');

	// execute the below code only where we have this table
	if ($levelListTable.length) {
		// console.log('Inside the table!');

		var jsonUrl = '';

		jsonUrl = window.contextRoot + '/json/data/all/levels';

		$table.DataTable({

			lengthMenu : [ [ 3, 5, 10, -1 ],
					[ '3 Records', '5 Records', '10 Records', 'ALL' ] ],
			pageLength : 5,
			ajax : {
				url : jsonUrl,
				dataSrc : ''
			},
			columns : [

			{
				data : 'id'
			}, {
				data : 'name'
			}, {
				data : 'descrption'
			} ]
		});
	}

	// list of all products for admin
	var $studentFormTable = $('#studentFormTable');

	if ($studentFormTable.length) {
		var jsonUrl = '';
		if (window.levelId == '') {
			jsonUrl = window.contextRoot + '/json/data/levels/studentform';
		} else {
			jsonUrl = window.contextRoot + '/json/data/levels/'
					+ window.levelId + '/studentforms';
		}
		console.log(jsonUrl);

		$studentFormTable
				.DataTable({
					lengthMenu : [ [ 10, 30, 50, -1 ],
							[ '10 Records', '30 Records', '50 Records', 'ALL' ] ],
					pageLength : 30,
					ajax : {
						url : jsonUrl,
						dataSrc : ''
					},
					columns : [
							{
								data : 'id'
							},
							{
								data : 'name'
							},
							{
								data : 'description'
							},
							{
								data : 'capacity'
							},
							{
								data : 'id',
								bSortable : false,
								mRender : function(data, type, row) {

									var str = '';
									str += '<a href="'
											+ window.contextRoot
											+ '/manage/show/'
											+ data
											+ '/students" class="btn btn-primary"><span class="glyphicon glyphicon-new-window"></span></a> &#160;';

									str += '<a href="'
											+ window.contextRoot
											+ '/manage/edit/'
											+ data
											+ '/students" class="btn btn-warning"><span class="glyphicon glyphicon-pencil"></span></a>';
                    
									return str;

								}

							} ]
				});
	}

	// list of all products for admin
	var $editStudentFormTable = $('#editStudentFormTable');
	
	if ($editStudentFormTable.length) {
		var jsonUrl = '';
			jsonUrl = window.contextRoot + '/json/data/levels/studentform';
		
		console.log(jsonUrl);
		$editStudentFormTable
				.DataTable({
					lengthMenu : [ [ 10, 30, 50, -1 ],
							[ '10 Records', '30 Records', '50 Records', 'ALL' ] ],
					pageLength : 30,
					ajax : {
						url : jsonUrl,
						dataSrc : ''
					},
					columns : [
							{
								data : 'id'
							},
							{
								data : 'name'
							},
							{
								data : 'description'
							},
							{
								data : 'capacity'
							},
							{
								data : 'id',
								bSortable : false,
								mRender : function(data, type, row) {

									var str = '';
									
									str += '<a href="'
											+ window.contextRoot
											+ '/manage/edit/'
											+ data
											+ '/studentForm" class="btn btn-warning"><span class="glyphicon glyphicon-pencil"></span></a>';

									return str;

								}

							} ]
				});
	}
	
	
var $departmentsTable = $('#departmentsTable');
	
	if ($departmentsTable.length) {
		var jsonUrl = '';
			jsonUrl = window.contextRoot + '/json/data/departments';
		
		console.log(jsonUrl);
		$departmentsTable
				.DataTable({
					lengthMenu : [ [ 10, 30, 50, -1 ],
							[ '10 Records', '30 Records', '50 Records', 'ALL' ] ],
					pageLength : 30,
					ajax : {
						url : jsonUrl,
						dataSrc : ''
					},
					columns : [
							{
								data : 'name'
							},
							{
								data : 'description'
							},
							{
								data : 'numberOfTeacher'
							},
							{
								data : 'id',
								bSortable : false,
								mRender : function(data, type, row) {

									var str = '';
									
									str += '<a href="'
											+ window.contextRoot
											+ '/manage/edit/'
											+ data
											+ '/department" class="btn btn-warning"><span class="glyphicon glyphicon-pencil"></span></a>';

									return str;

								}

							} ]
				});
	}

	var $studentTable = $('#studentTable');

	if ($studentTable.length) {
		var jsonUrl = '';
		if (window.studentFormId == '') {
			jsonUrl = window.contextRoot + '/json/data/students';
		} else {
			jsonUrl = window.contextRoot + '/json/data/students/'
					+ window.studentFormId;
		}

		console.log(jsonUrl);

		$studentTable
				.DataTable({
					lengthMenu : [ [ 10, 30, 50, -1 ],
							[ '10 Records', '30 Records', '50 Records', 'ALL' ] ],
					pageLength : 10,
					ajax : {
						url : jsonUrl,
						dataSrc : ''
					},
					columns : [
							{
								data : 'id'
							},
							{
								data : 'firstname'
							},
							{
								data : 'lastname'
							},
							{
								data : 'gender'
							},
							{
								data : 'dateOfBirth'
							},
							{
								data : 'enrollmentDate'
							},
							{
								data : 'registrationNumber'
							},
							{
								data : 'id',
								bSortable : false,
								mRender : function(data, type, row) {

									var str = '';
									str += '<a href="'
											+ window.contextRoot
											+ '/manage/show/'
											+ data
											+ '/student" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> &#160;';

									str += '<a href="'
											+ window.contextRoot
											+ '/manage/edit/'
											+ data
											+ '/student" class="btn btn-warning"><span class="glyphicon glyphicon-pencil"></span></a>';

									return str;

								}

							} ]
				});
	}

	var $sportsTable = $('#sportsTable');

	if ($sportsTable.length) {
		var jsonUrl = '';

		jsonUrl = window.contextRoot + '/json/data/sports';

		console.log(jsonUrl);

		$sportsTable
				.DataTable({
					lengthMenu : [ [ 10, 30, 50, -1 ],
							[ '10 Records', '30 Records', '50 Records', 'ALL' ] ],
					pageLength : 10,
					ajax : {
						url : jsonUrl,
						dataSrc : ''
					},
					columns : [
							{
								data : 'name'
							},
							{
								data : 'description'
							},
							{
								data : 'venue'
							},
							{
								data : 'contactPersonName'
							},
							{
								data : 'contactPersonPhone'
							},
							{
								data : 'eventTime'
							},
							{
								data : 'id',
								bSortable : false,
								mRender : function(data, type, row) {

									var str = '';
									str += '<a href="'
											+ window.contextRoot
											+ '/manage/show/'
											+ data
											+ '/sport" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> &#160;';

									str += '<a href="'
											+ window.contextRoot
											+ '/manage/edit/'
											+ data
											+ '/sport" class="btn btn-warning"><span class="glyphicon glyphicon-pencil"></span></a>';

									return str;

								}

							} ]
				});
	}

	var $teachersTable = $('#teachersTable');

	if ($teachersTable.length) {
		var jsonUrl = '';

		jsonUrl = window.contextRoot + '/json/data/teachers';

		console.log(jsonUrl);

		$teachersTable
				.DataTable({
					lengthMenu : [ [ 10, 30, 50, -1 ],
							[ '10 Records', '30 Records', '50 Records', 'ALL' ] ],
					pageLength : 10,
					ajax : {
						url : jsonUrl,
						dataSrc : ''
					},
					columns : [
							{
								data : 'id'
							},
							{
								data : 'firstname'
							},
							{
								data : 'lastname'
							},
							{
								data : 'gender'
							},
							{
								data : 'enrollmentDate'
							},
							{
								data : 'id',
								bSortable : false,
								mRender : function(data, type, row) {

									var str = '';
									str += '<a href="'
											+ window.contextRoot
											+ '/manage/show/'
											+ data
											+ '/teacher" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> &#160;';

									str += '<a href="'
											+ window.contextRoot
											+ '/manage/edit/'
											+ data
											+ '/teacher" class="btn btn-warning"><span class="glyphicon glyphicon-pencil"></span></a>';

									return str;

								}

							} ]
				});
	}

	// jQuery Validation Code

	// methods required for validation

	function errorPlacement(error, element) {
		// Add the 'help-block' class to the error element
		error.addClass("help-block");

		// add the error label after the input element
		error.insertAfter(element);

		// add the has-feedback class to the
		// parent div.validate in order to add icons to inputs
		element.parents(".validate").addClass("has-feedback");

	}

	// validating the product form element
	// fetch the form element
	$categoryForm = $('#categoryForm');

	if ($categoryForm.length) {

		$categoryForm.validate({
			rules : {
				name : {
					required : true,
					minlength : 3
				},
				description : {
					required : true,
					minlength : 3
				}
			},
			messages : {
				name : {
					required : 'Please enter product name!',
					minlength : 'Please enter atleast five characters'
				},
				description : {
					required : 'Please enter product name!',
					minlength : 'Please enter atleast five characters'
				}
			},
			errorElement : "em",
			errorPlacement : function(error, element) {
				errorPlacement(error, element);
			}
		}

		);

	}

	/* validating the loginform */

	// validating the product form element
	// fetch the form element
	$loginForm = $('#loginForm');

	if ($loginForm.length) {

		$loginForm.validate({
			rules : {
				username : {
					required : true

				},
				password : {
					required : true
				}
			},
			messages : {
				username : {
					required : 'Please enter your email!'
				},
				password : {
					required : 'Please enter your password!'
				}
			},
			errorElement : "em",
			errorPlacement : function(error, element) {
				// Add the 'help-block' class to the error element
				error.addClass("help-block");

				// add the error label after the input element
				error.insertAfter(element);
			}
		}

		);

	}

	/*------*/
	/* for fading out the alert message after 3 seconds */
	$alert = $('.alert');
	if ($alert.length) {
		setTimeout(function() {
			$alert.fadeOut('slow');
		}, 3000);
	}

	/*------*/
	/* handle refresh cart */
	$('button[name="refreshCart"]')
			.click(
					function() {
						var cartLineId = $(this).attr('value');
						var countField = $('#count_' + cartLineId);
						var originalCount = countField.attr('value');
						// do the checking only the count has changed
						if (countField.val() !== originalCount) {
							// check if the quantity is within the specified
							// range
							if (countField.val() < 1 || countField.val() > 3) {
								// set the field back to the original field
								countField.val(originalCount);
								bootbox
										.alert({
											size : 'medium',
											title : 'Error',
											message : 'Product Count should be minimum 1 and maximum 3!'
										});
							} else {
								// use the window.location.href property to send
								// the request to the server
								var updateUrl = window.contextRoot + '/cart/'
										+ cartLineId + '/update?count='
										+ countField.val();
								window.location.href = updateUrl;
							}
						}
					});
});