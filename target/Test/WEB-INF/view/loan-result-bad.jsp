<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<body>
<h2>Ваша кредитная заявка не одобрена</h2>
<br>
<form:form action="startView" modelAttribute="loan">
    ${loan.surname}<br>
    ${loan.name}<br>
    ${loan.patronymic}<br>
    ${loan.passport}<br>
    ${loan.status}<br>
    ${loan.location}<br>
    ${loan.phone}<br>
    ${loan.work_name}<br>
    ${loan.work_time}<br>
    ${loan.work_position}<br>
    ${loan.sum}<br>
    ${loan.approved}<br>
    ${loan.signed}<br>

</form:form>
<br><br>
<input type="button" value="Открыть список всех заявок" onclick="window.location.href='all-loans'"/>
<br><br>
<input type="button" value="Добавить новую заявку" onclick="window.location.href='addNewLoan'"/>
<br><br>
<input type="button" value="На главную страницу" onclick="window.location.href='home'"/>


</body>
</html>
