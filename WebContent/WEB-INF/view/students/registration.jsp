<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form action="formprocess" method="post" modelAttribute="student">
 <div class="form-row">
    <div class="form-group col-md-3">
         <label for="jsId">User Id</label>
          <form:input path="id" class="form-control mx-sm-3 mb-2" type="text" id="jsId" aria-describedby="jsId" placeholder="User ID"/>
       </div>
   </div>
    <div class="form-row">
       <div class="form-group col-md-3">
         <label for="firstname">First Name</label><span class="text-danger">*</span>
          <form:input path="firstname" class="form-control mx-sm-3 mb-2" type="text" id="jsfirstname" aria-describedby="jsfirstname" placeholder="First Name"/>
          <form:errors path="firstname" class="alert alert-danger"/>
        </div>
   </div>
   <div class="form-row">
       <div class="form-group col-md-3">
         <label for="middle">Middle Name</label>
          <form:input path="middlename" class="form-control mx-sm-3 mb-2" type="text" id="middle" aria-describedby="middle" placeholder="Middle Name"/>
        </div>
   </div>
   <div class="form-row">
       <div class="form-group col-md-3">
         <label for="lastname">Last Name</label>
          <form:input path="lastname" class="form-control mx-sm-3 mb-2" type="text" id="lastname" aria-describedby="lastname" placeholder="Last Name"/>
        </div>
   </div>
   <div class="form-row">
       <div class="form-group col-md-3">
         <label for="email">Email</label>
          <form:input path="email" class="form-control mx-sm-3 mb-2" type="text" id="email" aria-describedby="email" placeholder="Email"/>
        </div>
   </div>


     <button type="submit" class="btn btn-primary">Sign in</button>


</form:form>