<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<body>
<h2> Заполните информацию</h2>
<br>
<form:form action="saveLoan" modelAttribute="loan">

    Фамилия <form:input path="surname"/><form:errors path="surname"/> <br><br>
    Имя <form:input path="name"/><form:errors path="name"/> <br><br>
    Отчество <form:input path="patronymic"/><form:errors path="patronymic"/><br><br>
    Паспорт <form:input path="passport"/><form:errors path="passport"/><br><br>
    Семейное положение <form:select path="status">
    <form:option value="Холост/Не замужем" label="Холост/Не замужем"/>
    <form:option value="Женат/Замужем" label="Женат/Замужем"/>
    </form:select><br><br>
    Адрес прописки <form:input path="location"/><form:errors path="location"/><br><br>
    Контактный телефон <form:input path="phone"/><form:errors path="phone"/><br><br>
    Место работы <form:input path="work_name"/><form:errors path="work_name"/><br><br>
    Срок работы <form:input path="work_time"/><form:errors path="work_time"/><br><br>
    Должность <form:input path="work_position"/><form:errors path="work_position"/><br><br>
    Сумма кредита <form:input path="sum"/><form:errors path="sum"/><br><br>
    <input type="submit" value="OK">


</form:form>

<br><br>
<input type="button" value="На главную страницу" onclick="window.location.href='home'"/>



</body>
</html>
