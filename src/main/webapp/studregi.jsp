<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Student Registration Form</title>
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
    .gender {
      display: flex;
      gap: 10px;
    }
    .gender label {
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
  <form action="insertStudent" method="post">
    <label for="fname">Full Name</label> ${fullnameErr}
    <input type="text" id="fname" value="${sbean.fullname}" name="fullname" >

    <label for="email">Email Address</label> ${emailErr}
    <input type="email" id="email" value="${sbean.email}" name="email">

    <label for="phone">Phone Number</label>${phoneErr}
    <input type="tel" id="phone" value="${sbean.phone}" name="phone">

    <label>Gender</label> ${genderErr}
    <div class="gender">
      <label><input type="radio" name="gender" value="Male" > Male</label>
      <label><input type="radio" name="gender" value="Female"> Female</label>
      <label><input type="radio" name="gender" value="Other"> Other</label>
    </div>

    <label for="course">Course</label>${courseErr}
    <select id="course" name="course" >
      <option value="">--Select Course--</option>
      <option value="BCA">BCA</option>
      <option value="MCA">MCA</option>
      <option value="BSc IT">BSc IT</option>
      <option value="MSc IT">MSc IT</option>
    </select>

    <label for="dob">Date of Birth</label>${dobErr}
    <input type="date" id="dob" value="${sbean.dob}" name="dob">

    <button type="submit">Register</button>
  </form>
</div>

</body>
</html>
