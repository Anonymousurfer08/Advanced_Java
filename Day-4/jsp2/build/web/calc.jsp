<%-- 
    Document   : jsp2
    Created on : 14-Feb-2024, 2:38:25 pm
    Author     : kayas
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Basic Arithmetic</title>
</head>
<body>
    <h1>Basic Arithmetic Operations</h1>
    <form action="calc.jsp" method="post">
        <label for="num1">Enter Number 1:</label>
        <input type="number" id="num1" name="num1" required><br><br>
        <label for="num2">Enter Number 2:</label>
        <input type="number" id="num2" name="num2" required><br><br>
        <input type="submit" value="Add" name="operation">
        <input type="submit" value="Subtract" name="operation">
        <input type="submit" value="Multiply" name="operation">
        <input type="submit" value="Divide" name="operation">
    </form>

    <%
        if (request.getMethod().equals("POST")) {
            double num1 = Double.parseDouble(request.getParameter("num1"));
            double num2 = Double.parseDouble(request.getParameter("num2"));
            String operation = request.getParameter("operation");
            double result = 0;
            String operator = "";
             if(operation.equals("Add")) {
                result = num1 + num2;
                operator = "+";
            } else if(operation.equals("Subtract")) {
                result = num1 - num2;
                operator = "-";
            } else if(operation.equals("Multiply")) {
                result = num1 * num2;
                operator = "*";
            } else if(operation.equals("Divide")) {
                if(num2 != 0) {
                    result = num1 / num2;
                    operator = "/";
                } else {
                    out.println("<p style='color:red;'>Error: Division by zero!</p>");
                }
            }

            if(!operator.equals("")) {
                out.println("<p>Result: " + num1 + " " + operator + " " + num2 + " = " + result + "</p>");
            }
        }
    %>
</body>
</html>