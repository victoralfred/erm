<%@ include file="/WEB-INF/resources/template/header.jsp" %>
<div class="row">
  <ul class="list-group">
     <li class="list-group-item">${student.id}</li>
     <li class="list-group-item">${student.firstname}</li>
     <li class="list-group-item">${student.middlename}</li>
     <li class="list-group-item">${student.lastname}</li>
     <li class="list-group-item">${student.email}</li>
  </ul>
</div>
<a href="details">List Student</a>


</body>
</html>