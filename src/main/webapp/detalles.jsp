<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title><s:text name="details.title"/></title>
    </head>
<body>
    <hr/>
    <h1><s:text name="details.message" /></h1>
    <table border="1">
    <tr>
        <td class="evenRow">
            <strong><s:text name="form.message.fname" /></strong>
            <s:property value="detalles.nombre" />
        </td>
    </tr>
    <tr>
        <td class="evenRow">
            <strong><s:text name="form.message.lname" /></strong>
            <s:property value="detalles.apellidos" />
        </td>
    </tr>
    <tr>
        <td class="evenRow">
            <strong><s:text name="form.message.id" /></strong>
            <s:property value="detalles.dni" />
        </td>
    </tr>
    <tr>
        <td class="evenRow">
            <strong><s:text name="form.message.adress" /></strong>
            <s:property value="detalles.direccion" />
        </td>
    </tr>
    <tr>
        <td class="evenRow">
            <strong><s:text name="form.message.email" /></strong>
            <s:property value="detalles.email" />
        </td>
    </tr>
    <tr>
        <td class="evenRow">
            <strong><s:text name="form.message.age" /></strong>
            <s:property value="detalles.edad" />
        </td>
    </tr>
    <tr>
        <td class="evenRow">
            <strong><s:text name="form.message.languages" /></strong>
            <s:iterator value="detalles.idiomas">
                [<s:property/>]
            </s:iterator>
        </td>
    </tr>
    <tr>
        <td class="evenRow">
            <strong><s:text name="form.message.course" /></strong>
            <s:property value="detalles.curso" />
        </td>
    </tr>
    <tr>
        <td class="evenRow">
            <strong><s:text name="form.message.startdate" /></strong>
            <s:property value="detalles.fechaInicio" />
        </td>
    </tr>
    <tr>
        <td class="evenRow">
            <strong><s:text name="form.message.enddate" /></strong>
            <s:property value="detalles.fechaFin" />
        </td>
    </tr>
    </table>
</body>
</html>