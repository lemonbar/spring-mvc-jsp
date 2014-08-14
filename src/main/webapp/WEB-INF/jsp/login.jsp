<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form commandName="user">
    <table border="1">
        <tr>
            <td>First Name:</td>
            <td><form:input path="firstName"/></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><form:input path="lastName"/></td>
        </tr>
        <tr>
            <td>Sex:</td>
            <td>
                <%--items support Array, List or Map.--%>
                <form:radiobuttons path="sex" items="${sexOptions}"/>
            </td>
            <%--<td>--%>
                <%--Male: <form:radiobutton path="sex" value="M"/><br/>--%>
                <%--Female: <form:radiobutton path="sex" value="F"/>--%>
            <%--</td>--%>
        </tr>
        <tr>
            <td>Password:</td>
            <%--If you want to show password, please set showPassword="true"--%>
            <td>
                <form:password path="password"/>
            </td>
        </tr>
        <tr>
            <td>Subscribe to newsletter?</td>
            <%--Approach 1: Property is of type java.lang.Property--%>
            <td><form:checkbox path="preferences.receiveNewsletter"/></td>
        </tr>
        <tr>
            <td>Interests:</td>
            <%--Approach 2: Property is of an array or of type java.util.Collection--%>
            <td>
                <%--Property is of an array or of type java.util.Collection--%>
                <form:checkboxes path="preferences.interests" items="${interestList}"/>
            </td>
            <%--<td>--%>
                <%--AAA: <form:checkbox path="preferences.interests" value="AAA"/><br>--%>
                <%--BBB: <form:checkbox path="preferences.interests" value="BBB"/><br>--%>
                <%--CCC: <form:checkbox path="preferences.interests" value="CCC"/><br>--%>
            <%--</td>--%>
        </tr>
        <tr>
            <td>Favourite Words:</td>
            <%--Approach 3: Property is of type java.lang.Object--%>
            <td>
                Magic: <form:checkbox path="preferences.favouriteWord" value="Magic"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="login"/>
            </td>
        </tr>
    </table>
</form:form>