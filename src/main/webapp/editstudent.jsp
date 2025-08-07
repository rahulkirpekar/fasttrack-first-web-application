<!DOCTYPE html>
<%@page import="com.royal.bean.StudentBean"%>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Student Edit Registration Form</title>
 <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f0f2f5;
    }
    .container {
      width: 400px;
      margin: 50px auto;
      background-color: white;
      padding: 25px;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }
    h2 {
      text-align: center;
      margin-bottom: 20px;
    }
    label {
      display: block;
      margin-top: 10px;
    }
    input, select {
      width: 100%;
      padding: 8px;
      margin-top: 5px;
      border: 1px solid #ccc;
      border-radius: 5px;
    }
    .gender, .hobbies {
      display: flex;
      gap: 10px;
      flex-wrap: wrap;
    }
    .gender label, .hobbies label {
      margin-top: 0;
    }
    button {
      margin-top: 20px;
      width: 100%;
      padding: 10px;
      background-color: #4CAF50;
      color: white;
      border: none;
      font-size: 16px;
      cursor: pointer;
      border-radius: 5px;
    }
    button:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>


<div class="container">
  <h2>Student Registration</h2>
  <form action="updateStudent" method="post">
    <label for="fname">Full Name ${fullnameErr}</label> 
    <input type="text" id="fname" value="${sbean.fullname}" name="fullname" >

    <label for="email">Email Address ${emailErr}</label> 
    <input type="email" id="email" value="${sbean.email}" name="email">

    <label for="phone">Phone Number ${phoneErr}</label>
    <input type="tel" id="phone" value="${sbean.phone}" name="phone">

    <label>Gender ${genderErr}</label> 
    <div class="gender">
    	  <label></label>	
    	  <label></label>	
      <label></label>	
      <label></label>	
    	  <label></label>	
      <label></label>	
      <label><input type="radio" name="gender" value="Male" ${sbean.gender=='Male' ? 'checked' : '' } > Male</label>
      <label><input type="radio" name="gender" value="Female" ${sbean.gender=='Female' ? 'checked' : '' }> Female</label>
      <label><input type="radio" name="gender" value="Other" ${sbean.gender=='Other' ? 'checked' : ''} > Other</label>
    </div>
    
	<label>Hobbies ${hobbiesErr}</label> 
	<div class="hobbies">
		<label></label>	
	    <label></label>	
	    <label></label>	
	    	<label></label>	
	    <label></label>	
	    	<label><input type="checkbox" name="hobbies" value="Reading" 
	    			${sbean.hobbies!=null && sbean.hobbies[0].contains('Reading') ? 'checked' : ''}  
	    			${sbean.hobbies!=null && sbean.hobbies[1].contains('Reading') ? 'checked' : ''} 
	    			${sbean.hobbies!=null && sbean.hobbies[2].contains('Reading') ? 'checked' : ''}  
	    			${sbean.hobbies!=null && sbean.hobbies[3].contains('Reading') ? 'checked' : ''}  >Reading</label>
		<label><input type="checkbox" name="hobbies" value="Sports"  
				${sbean.hobbies!=null && sbean.hobbies[0].contains('Sports') ? 'checked' : '' }   
				${sbean.hobbies!=null && sbean.hobbies[1].contains('Sports') ? 'checked' : ''} 
				${sbean.hobbies!=null && sbean.hobbies[2].contains('Sports') ? 'checked' : ''}  
				${sbean.hobbies!=null && sbean.hobbies[3].contains('Sports') ? 'checked' : ''} >Sports</label>
		<label><input type="checkbox" name="hobbies" value="Music"  
				${sbean.hobbies!=null && sbean.hobbies[0].contains('Music') ? 'checked' : '' } 
				${sbean.hobbies!=null && sbean.hobbies[1].contains('Music') ? 'checked' : ''} 
				${sbean.hobbies!=null && sbean.hobbies[2].contains('Music') ? 'checked' : ''}  
				${sbean.hobbies!=null && sbean.hobbies[3].contains('Music') ? 'checked' : ''} >Music</label>
		<label><input type="checkbox" name="hobbies" value="Travelling" 
				${sbean.hobbies!=null && sbean.hobbies[0].contains('Travelling') ? 'checked' : '' }  
				${sbean.hobbies!=null && sbean.hobbies[1].contains('Travelling') ? 'checked' : ''} 
				${sbean.hobbies!=null && sbean.hobbies[2].contains('Travelling') ? 'checked' : ''}  
				${sbean.hobbies!=null && sbean.hobbies[3].contains('Travelling') ? 'checked' : ''} >Travelling</label>
	</div>


    <label for="course">Course ${courseErr}</label>
    <select id="course" name="course" >
      <option value="">--Select Course--</option>
      <option value="BCA" ${sbean.course == 'BCA' ? 'selected' : ''} >BCA</option>
      <option value="MCA" ${sbean.course == 'MCA' ? 'selected' : ''}>MCA</option>
      <option value="BSc IT" ${sbean.course == 'BSc IT' ? 'selected' : ''}>BSc IT</option>
      <option value="MSc IT" ${sbean.course == 'MSc IT' ? 'selected' : ''}>MSc IT</option>
    </select>

    <label for="dob">Date of Birth ${dobErr}</label>
    <input type="date" id="dob" value="${sbean.dob}" name="dob">

    <button type="submit">Register</button>
  </form>
</div>

</body>
</html>
