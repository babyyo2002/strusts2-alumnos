<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
    <s:head />
        <meta charset="UTF-8">
        <title><s:text name="signup.title"/></title>
    </head>
<body>
    <hr/>
    <h1><s:text name="signup.message" /></h1>
    <p><s:text name="signup.message2" /></p>

    <s:form theme="simple" action="registrar" method="post">
        <table>
        <tr>
            <td class="evenRow">
                <s:fielderror fieldName = "alumno.nombre" />
                <s:text name="form.message.fname" />
                <s:textfield name="alumno.nombre" />
            </td>
        </tr>
        <tr>
            <td class="evenRow">
                <s:fielderror fieldName = "alumno.apellidos" />
                <s:text name="form.message.lname" />
                <s:textfield name="alumno.apellidos" />
            </td>
        </tr>
        <tr>
            <td class="evenRow">
                <s:fielderror fieldName = "alumno.dni" />
                <s:text name="form.message.id" />
                <s:textfield name="alumno.dni" />
            </td>
        </tr>
        <tr>
            <td class="evenRow">
                <s:fielderror fieldName = "alumno.direccion" />
                <s:text name="form.message.adress" />
                <s:textfield name="alumno.direccion" />
            </td>
        </tr>
        <tr>
            <td class="evenRow">
                <s:fielderror fieldName = "alumno.email" />
                <s:text name="form.message.email" />
                <s:textfield type="email" name="alumno.email" />
            </td>
        </tr>
        <tr>
            <td class="evenRow">
                <s:fielderror fieldName = "alumno.telefono" />
                <s:text name="form.message.telefono" />
                <s:textfield type="number" name="alumno.telefono" min="0" />
            </td>
        </tr>
        <tr>
            <td class="evenRow">
                <s:fielderror fieldName = "alumno.idiomas" />
                <s:text name="form.message.languages" />
                <s:checkboxlist list="listaIdiomas" name="alumno.idiomas" />
            </td>
        </tr>
        <tr>
            <td class="evenRow">
                <s:fielderror fieldName = "alumno.curso" />
                <s:text name="form.message.course" />
                <s:select list="listaCursos" name="alumno.curso" headerKey="" headerValue="---Seleciona---" />
            </td>
        </tr>
        <tr>
            <td class="evenRow">
                <s:fielderror fieldName = "alumno.fechaInicio" />
                <s:text name="form.message.startdate" />
                <s:textfield type="date" name="alumno.fechaInicio" />
            </td>
        </tr>
        <tr>
            <td class="evenRow">
                <s:fielderror fieldName = "alumno.nota" />
                <s:text name="form.message.nota" />
                <s:textfield type="nota" name="alumno.nota" />
            </td>
        </tr>
        <tr>
            <td class="evenRow">
                <s:submit align="left" value="Enviar"/>
            </td>
        </tr>
        </table>
    </s:form>
    <hr/>
</body>
</html>
