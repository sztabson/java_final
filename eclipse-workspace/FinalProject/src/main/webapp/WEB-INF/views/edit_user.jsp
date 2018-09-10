<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- saved from url=(0060)https://getbootstrap.com/docs/4.1/examples/starter-template/ -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="./Signin/bootstrap-solid.jpg">

    <title>IDC work</title>

    <!-- Bootstrap core CSS -->
    <link href="./Signin/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./Signin/starter-template.css" rel="stylesheet">
  </head>

  <body>
	 <h4 class="mb-3">Edit ${user.username}</h4>
        	<form  name="f1" action="/edit_user.do" method="POST">
         	 <div class="mb-3">
              <div class="input-group">
                <div class="input-group-prepend">
                  <span class="input-group-text">ID:</span>
                </div>
                 <input type="text" class="form-control" name="id" id="inputid" placeholder="" value="${user.id}" required="">
                 <div class="invalid-feedback" style="width: 100%;"> 
                   ID is required.
                 </div>
               </div>
             </div>
             <div class="mb-3">
              <div class="input-group">
                <div class="input-group-prepend">
                  <span class="input-group-text">Username:</span>
                </div>
                 <input type="text" class="form-control" name="username"  value="${user.username}"  id="inputusername" placeholder="" required="">
                 <div class="invalid-feedback" style="width: 100%;">
                   Username is required.
                 </div>
               </div>
             </div>
             <div class="mb-3">
              <div class="input-group">
                <div class="input-group-prepend">
                  <span class="input-group-text">Password:</span>
                </div>
                 <input type="text" class="form-control" name="password" id="inputpassword" placeholder="" required="">
                 <div class="invalid-feedback" style="width: 100%;">
                   Password is required.
                 </div>
               </div>
             </div>
             <div class="mb-3">
              <div class="input-group">
                <div class="input-group-prepend">
                  <span class="input-group-text">Firstname:</span>
                </div>
                  <input type="text" class="form-control"  value="${user.firstname}"  name="firstname" id="inputfirstname" placeholder="" required="">
                 <div class="invalid-feedback" style="width: 100%;">
                   Firstname is required.
                 </div>
               </div>
             </div>
             <div class="mb-3">
               <div class="input-group">
                <div class="input-group-prepend">
                  <span class="input-group-text">Lastname:</span>
                </div>
                 <input type="text" class="form-control" name="lastname" id="inputlastname" placeholder="" required="">
                 <div class="invalid-feedback" style="width: 100%;">
                   Lastname is required.
                 </div>
                </div>
               </div>
               <div class="mb-3">
                <div class="input-group">
                 <div class="input-group-prepend">
                  <span class="input-group-text">Address:</span>
                 </div>                
                  <input type="text" class="form-control" name="address" id="inputaddress" placeholder="" value="" required="">
                  <div class="invalid-feedback">
                    Address is required.
                  </div>
               </div>
             </div>
             <div class="mb-3">
              <div class="input-group">
                <div class="input-group-prepend">
                  <span class="input-group-text">Phone:</span>
                </div>
                <input type="text" class="form-control" name="phone" id="inputphone" placeholder=" " required="">
                <div class="invalid-feedback" style="width: 100%;">
                  Phone is required.
                </div>
              </div>
            </div>
           <hr class="mb-4">

<button class="btn btn-primary btn-lg btn-block" value="Submit" type="submit">Submit</button>
           </form>
	</body>
</html>