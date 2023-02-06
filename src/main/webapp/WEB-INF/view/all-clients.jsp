<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<body>


<h2>Все клиенты</h2>
<br>
<table>
    <tr>
        <th>Фамилия</th>
        <th>Имя</th>
        <th>Отчество</th>
        <th>Паспорт</th>
        <th>Семейное положение</th>
        <th>Адрес прописки</th>
        <th>Телефон</th>
    </tr>

    <c:forEach var="loan" items="${allLns}">

        <tr>
            <td>${loan.surname}</td>
            <td>${loan.name}</td>
            <td>${loan.patronymic}</td>
            <td>${loan.passport}</td>
            <td>${loan.status}</td>
            <td>${loan.location}</td>
            <td>${loan.phone}</td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="Добавить новую заявку" onclick="window.location.href='addNewLoan'"/>
<br><br>
<input type="button" value="На главную страницу" onclick="window.location.href='home'"/>


</body>



</html>