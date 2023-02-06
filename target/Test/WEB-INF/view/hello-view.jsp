<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Окно управления</title>
</head>


<input type="button" value="Добавить новую заявку" onclick="window.location.href='addNewLoan'"/>
<br><br>
<input type="button" value="Открыть список всех клиентов" onclick="window.location.href='all-clients'"/>
<br><br>
<input type="button" value="Открыть список всех заявок" onclick="window.location.href='all-loans'"/>
<br><br>
<input type="button" value="Открыть список подписанных заявок" onclick="window.location.href='all-loansSigned'"/>
<br><br><br>
<form:form action="search-loans" >
<input type="text" name="Surname">
<input type="text" name="Name">
<input type="text" name="Patronymic">
<input type="submit" value="Поиск по ФИО">
</form:form>
<br>
<form:form action="search-loansPhone" >
    <input type="text" name="Phone">
    <input type="submit" value="Поиск по телефону">
</form:form>
<form:form action="search-loansPassport" >
    <input type="text" name="Passport">
    <input type="submit" value="Поиск по паспорту">
</form:form>
<body>

</body>
</html>
