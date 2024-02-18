<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="ru.game.Phrases" %>
<%@ page import="java.io.PrintWriter" %>
<% Phrases phrases = (Phrases) session.getAttribute("phrases"); %>
<% boolean stateOfAnswer = (boolean) session.getAttribute("stateOfAnswer"); %>
<% PrintWriter printWriter = response.getWriter(); %>

<html>
<head>
    <title>lastPage</title>
</head>
<body>
<% if (stateOfAnswer) {
    printWriter.println("<h2>");
    printWriter.println(phrases.getPositiveConsequences());
    printWriter.println("</h2>");
    printWriter.println("<b><p><font size=\"5\" color=\"green\">\"Победа!\"</font></p></b>");
} else {
    printWriter.println("<h2>");
    printWriter.println(phrases.getNegativeConsequences());
    printWriter.println("</h2>");
    printWriter.println("<b><p><font size=\"5\" color=\"red\">\"Поражение(\"</font></p></b>");

}%>
<button onclick="window.location='/restart'">Начать снова</button>
</body>
</html>
