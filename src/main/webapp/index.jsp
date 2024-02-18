<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="ru.game.Phrases" %>
<% Phrases phrases = (Phrases) session.getAttribute("phrases"); %>
<% String ipAddress = request.getLocalAddr(); %>


<html>
<head>
    <title>Game</title>
</head>
<body>
<b>
    <h2>
        <%= phrases.getQuestion() %>
    </h2>
</b>
<br/>
<form action="/logic">
    <label><input type="radio" name="answer" value="No" ><%=phrases.getNegativeAnswer()%></label><br/>
    <label><input type="radio" name="answer" value="Yes" checked><%=phrases.getPositiveAnswer()%></label><br/>
    <button type="submit">Ответить</button>
</form>
<hr>

    <label>Статистика:</label><br/>
    <label>IP address: <i><%= ipAddress %></i></label><br/>
    <label>Имя в игре: <i>test</i></label><br/>
    <label>Количество игр: <i><%= session.getAttribute("count") %></i></label><br/>

</body>
</html>
