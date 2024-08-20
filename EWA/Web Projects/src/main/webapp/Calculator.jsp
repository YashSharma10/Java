<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .calculator {
            background-color: #fff;
            width: 300px;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
        }

        .calculator h1 {
            text-align: center;
            color: #007BFF;
        }

        .calculator input, .calculator select {
            width: 90%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .calculator select {
            appearance: none;
            -webkit-appearance: none;
            -moz-appearance: none;
            background: transparent url("arrow.png") no-repeat scroll right center;
        }

        .calculator button {
            width: 90%;
            padding: 10px;
            margin: 10px 0;
            background-color: #007BFF;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .calculator button:hover {
            background-color: #0056b3;
        }

        .result {
            margin-top: 20px;
            text-align: center;
            font-size: 18px;
        }
    </style>
</head>
<body>
    <div class="calculator">
        <h1>Calculator</h1>
        <form name="calculator" method="post">
            Enter First Number:
            <input type="number" name="n1" required><br>
            Enter Second Number:
            <input type="number" name="n2" required><br>
            Select Operation:
            <select name="n3">
                <option value="add">Addition (+)</option>
                <option value="subtract">Subtraction (-)</option>
                <option value="multiply">Multiplication (*)</option>
                <option value="divide">Division (/)</option>
            </select><br>
            <button type="submit">Calculate</button>
        </form>

        <%
            String inp1 = request.getParameter("n1");
            String inp2 = request.getParameter("n2");
            String operation = request.getParameter("n3");

            double result = 0;
            String operator = "";

            if (inp1 != null && inp2 != null && operation != null) {
                if (operation.equals("add")) {
                    result = Double.parseDouble(inp1) + Double.parseDouble(inp2);
                    operator = "+";
                } else if (operation.equals("subtract")) {
                    result = Double.parseDouble(inp1) - Double.parseDouble(inp2);
                    operator = "-";
                } else if (operation.equals("multiply")) {
                    result = Double.parseDouble(inp1) * Double.parseDouble(inp2);
                    operator = "*";
                } else if (operation.equals("divide")) {
                    if (Double.parseDouble(inp2) != 0) {
                        result = Double.parseDouble(inp1) / Double.parseDouble(inp2);
                        operator = "/";
                    } else {
                        out.println("Cannot divide by zero.");
                    }
                }
            }
        %>

        <div class="result">
            Operation: <%= inp1 %> <%= operator %> <%= inp2 %> = <%= result %>
        </div>
    </div>
</body>
</html>
