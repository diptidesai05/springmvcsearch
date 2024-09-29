<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Complex Form</title>
  </head>
  <body class="" style="background: LemonChiffon">
   
   <div class="container mt-4">
     <div class="row">
       <div class="col-md-6 offset-md-3">
        <div class="card">
          <div class="card-body">
             <h3 class="text-center">Complex Form</h3>
              <div class="alert alert-danger" role="alert">
                   <form:errors path="student.*"></form:errors>
              </div>
             <form action="processForm" method="post">
               <div class="form-group">
                  <label for="username">Your Name</label>
                  <input type="text" class="form-control" id="userName" aria-describedby="emailHelp" name="userName" placeholder="Enter Name">
                  <small id="emailHelp" class="form-text text-muted">We'll never share your name with anyone else.</small>
               </div>
               <div class="form-group">
                  <label for="userid">Your Id</label>
                  <input type="text" class="form-control" id="userid" aria-describedby="emailHelp" name="userid" placeholder="Enter Id">
               </div>
               <div class="form-group">
                  <label for="DOB">Your DOB</label>
                  <input type="text" class="form-control" id="date" aria-describedby="emailHelp" name="date" placeholder="Enter DOB(DD/MM/YYYY)">
               </div>
               <div class="form-group">
                  <label for="subjects">Select Courses</label>
                  <select id="courses"" name="courses"" class="form-control" multiple>
                    <option value="Java">Java</option>
                    <option value="Bootstrap">Bootstrap</option>
                    <option value="Photoshop">Photoshop</option>
                    <option value="Premier Pro">Premier Pro</option>
                  </select>
               </div>
               <div class="form-group">
                 <span class="mr-3">Select Gender</span>
                 <div class="form-check form-check-line">
                   <input class="form-check-input" type="radio" name="gender" id="inlineradio1" value="male">
                   <label class="form-check-label" for="inlineradio1">Male</label>
                 </div>
                 <div class="form-check form-check-line">
                   <input class="form-check-input" type="radio" name="gender" id="inlineradio2" value="female">
                   <label class="form-check-label" for="inlineradio2">Female</label>
                 </div>
               </div>
               <div class="form-group">
                  <label for="studentType">Select Student Type</label>
                  <select id="studenttype"" name="studenttype"" class="form-control">
                    <option value="Old Student">Old Student</option>
                    <option value="New Student">New Student</option>
                  </select>
               </div>
               <div class="card">
                 <div class="card body">
                     <div> Your Address </div>
                     <div class="form-group">
                       <label for="streetAddress">Your Street</label>
                       <input type="text" class="form-control" id="address.street" aria-describedby="emailHelp" name="address.street" placeholder="Enter Street">
                     </div>
                     <div class="form-group">
                       <label for="streetCity">Your City</label>
                       <input type="text" class="form-control" id="address.City" aria-describedby="emailHelp" name="address.City" placeholder="Enter City">
                     </div>
                 </div>
               </div>
               <div class="container text-center">
                 <button type="submit" class="btn btn-success">Submit</button>
               </div>
             </form>
          </div>
        </div>
       </div>
     </div>
   </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>