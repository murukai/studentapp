
<h3 class="my-4">${title}</h3>
<c:if test="${userClickLevels == true or userClickLevelForms == true}">
	<div class="list-group">
		<c:forEach items="${levels}" var="level">
			<a href="${contextRoot}/manage/show/${level.id}/studentforms"
				class="list-group-item" id="a_${level.name}">Form -
				${level.name}</a>
		</c:forEach>
	</div>
</c:if>
<c:if test="${userClickFormStudents == true or userClickManageClassStudents == true}">
	<div class="list-group">
		<c:forEach items="${studentForms}" var="studentForm">
			<a href="${contextRoot}/manage/show/${studentForm.id}/students"
				class="list-group-item" id="a_${studentForm.name}">Form -
				${studentForm.name}</a>
		</c:forEach>
	</div>
</c:if>
