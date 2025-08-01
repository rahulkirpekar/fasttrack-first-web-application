<?xml version="1.0" encoding="UTF-8" ?>

<%@page import="com.royal.bean.StudentBean"%>
<%@page import="java.util.ArrayList"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
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

        /* Buttons */
        .btn {
            padding: 6px 12px;
            border-radius: 5px;
            font-size: 14px;
            text-decoration: none;
            font-weight: bold;
        }

        .btn-edit {
            background-color: #2196F3;
            color: white;
        }

        .btn-edit:hover {
            background-color: #0b7dda;
        }

        .btn-delete {
            background-color: #f44336;
            color: white;
        }

        .btn-delete:hover {
            background-color: #d32f2f;
        }
    </style>
</head>
<body>

    <h1>Student Records</h1>

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
                <a href="EditStudent?id=<%=s.getId()%>" class="btn btn-edit">Edit</a>
                <a href="DeleteStudent?id=<%=s.getId()%>" class="btn btn-delete" onclick="return confirm('Are you sure you want to delete this record?');">Delete</a>
            </td>
        </tr>
        <% } %>
    </table>

</body>
</html>
