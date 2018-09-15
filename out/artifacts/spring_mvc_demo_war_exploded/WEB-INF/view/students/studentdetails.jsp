<%@ include file="/WEB-INF/resources/template/header.jsp" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="container">
<table>
<tr>
 <th>First Name</th>
  <th>Middle Name</th>
   <th>Last Name</th>
    <th>Email</th>
     <th>Mobile Number</th>
</tr>
<c:forEach var="tempStudents" items="${studentsdetails}">
<tr>
<td>${tempStudents.firstname }</td>

<td>${tempStudents.middlename }</td>
<td>${tempStudents.lastname }</td>
<td>${tempStudents.email }</td>
<td>${tempStudents.numbervalue}</td>

</tr>

</c:forEach>
</table>
</div>

</body>
</html>