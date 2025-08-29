<?xml version="1.0" encoding="UTF-8" ?>
<%@page errorPage="error.jsp" %>
<%@page import="com.royal.bean.StudentBean"%>
<%@page import="java.util.ArrayList"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">

    <title>Student Record Page</title> 
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f6f8;
            margin: 0;
            padding: 20px;
        }

        h1 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }

        table {
            width: 90%;
            margin: auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
            border-radius: 8px;
            overflow: hidden;
        }

        th, td {
            padding: 12px 15px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #4CAF50;
            color: white;
            text-transform: uppercase;
            letter-spacing: 1px;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        /* Icon Buttons */
        .icon-btn {
            font-size: 18px;
            cursor: pointer;
            padding: 6px;
            border-radius: 5px;
            text-decoration: none;
            display: inline-block;
        }

        .edit-icon {
            color: #2196F3;
        }

        .edit-icon:hover {
            color: #0b7dda;
            background-color: rgba(33, 150, 243, 0.1);
        }

        .delete-icon {
            color: #f44336;
            margin-left: 8px;
        }

        .delete-icon:hover {
            color: #d32f2f;
            background-color: rgba(244, 67, 54, 0.1);
        }
    </style>
</head>
<body>
	<%
			String name = (String)session.getAttribute("userName");

			if(name == null)
			{
				response.sendRedirect("login.jsp");
			}
	%>


    <h1>Student Records</h1>${dbError}	${userName}  <a href="LogoutServlet"> Logout</a>
    <%
        ArrayList<StudentBean> list = (ArrayList<StudentBean>)request.getAttribute("list");    
    %>

    <table>
        <tr>
            <th>ID</th>
            <th>Full Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Gender</th>
            <th>Hobbies</th>
            <th>Course</th>
            <th>DOB</th>
            <th>Action</th>
        </tr>

        <%
            for(int i = 0 ; i< list.size() ; i++) {
                StudentBean s = list.get(i);
                String hobbies = String.join(", ", s.getHobbies());
        %>
        <tr>
            <td><%=s.getId()%></td>
            <td><%=s.getFullname()%></td>
            <td><%=s.getEmail()%></td>
            <td><%=s.getPhone()%></td>
            <td><%=s.getGender()%></td>
            <td><%=hobbies%></td>
            <td><%=s.getCourse()%></td>
            <td><%=s.getDob()%></td>
            <td>
	            <a href="EditStudentServlet?id=<%=s.getId()%>" class="icon-btn edit-icon" title="Edit"><i class="fas fa-edit"></i></a>
				<a href="DeleteStudentServlet?id=<%=s.getId()%>" class="icon-btn delete-icon" title="Delete"
				   onclick="return confirm('Are you sure you want to delete this record?');"> <i class="fas fa-trash-alt"></i>
				   </a>
            </td>
            
            
            
            
        </tr>
        <% } %>
    </table>
</body>
</html>
