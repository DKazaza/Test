<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<body>
<h2>Ваша кредитная заявка одобрена</h2>
<br>
<form:form action="loan-result-good" modelAttribute="loan">
    <form:hidden path="id"></form:hidden>
    Фамилия <form:input path="surname"/><form:errors path="surname"></form:errors> <br><br>
    Имя <form:input path="name"/><br><br>
    Отчество <form:input path="patronymic"/><br><br>
    Паспорт <form:input path="passport"/><br><br>
    Семейное положение <form:select path="status">
    <form:option value="Холост/Не замужем" label="Холост/Не замужем"></form:option>
    <form:option value="Женат/Замужем" label="Женат/Замужем"></form:option>
    </form:select><br><br>
    Адрес прописки <form:input path="location"/><br><br>
    Контактный телефон <form:input path="phone"/><br><br>
    Место работы <form:input path="work_name"/><br><br>
    Срок работы <form:input path="work_time"/><br><br>
    Должность <form:input path="work_position"/><br><br>
    В данный момент договор ${loan.signed}<br><br>
    Вам одобрен кредит на суммму ${loan.sum} на срок ${loan.loan_term} дней<br>
    Дата подписания договора <%= (new java.util.Date()).toLocaleString()%> <br>
    Для подписания кредита введите слово "Подписан" <form:input path="signed"/><input type="submit" value="OK">
   <br>

</form:form>
<br><br>
<input type="button" value="Открыть список заявок" onclick="window.location.href='all-loans'"/>
<br><br>
<input type="button" value="На главную страницу" onclick="window.location.href='home'"/>


</body>
</html>
