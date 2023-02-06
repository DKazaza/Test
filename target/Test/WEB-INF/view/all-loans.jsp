<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<body>


<h2>Все заявки</h2>
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
        <th>Место работы</th>
        <th>Время работы</th>
        <th>Должность</th>
        <th>Сумма кредита</th>
        <th>Одобрение</th>
        <th>Статус подписания</th>
        <th> </th>
    </tr>

    <c:forEach var="loan" items="${allLns}">
        <c:url var="deleteButton" value="/deleteLoan">
            <c:param name="loanId" value="${loan.id}"></c:param>
        </c:url>
        <tr>
            <td>${loan.surname}</td>
            <td>${loan.name}</td>
            <td>${loan.patronymic}</td>
            <td>${loan.passport}</td>
            <td>${loan.status}</td>
            <td>${loan.location}</td>
            <td>${loan.phone}</td>
            <td>${loan.work_name}</td>
            <td>${loan.work_time}</td>
            <td>${loan.work_position}</td>
            <td>${loan.sum}</td>
            <td>${loan.approved}</td>
            <td>${loan.signed}</td>
            <td>
                <input type="button" value="Delete"
                    onclick="window.location.href = '${deleteButton}'">
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="Добавить новую заявку" onclick="window.location.href='addNewLoan'"/>
<br><br>
<input type="button" value="На главную страницу" onclick="window.location.href='home'"/>



</body>



</html>