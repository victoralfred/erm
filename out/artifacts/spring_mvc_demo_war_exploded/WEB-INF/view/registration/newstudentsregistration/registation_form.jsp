<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form action="registerStudents" method="post" modelAttribute="registration">
    <div class="form-row">
        <div class="form-group col-md-3">
            <label for="username">First Name</label><span class="text-danger">*</span>
            <form:input path="username" class="form-control mx-sm-3 mb-2" type="text" id="username" aria-describedby="username" placeholder="Username"/>
            <form:errors path="username" cssClass="errorblock"/>
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-3">
            <label for="password">Password</label>
            <form:input path="password" class="form-control mx-sm-3 mb-2" type="text" id="middle" aria-describedby="password" placeholder="********"/>
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