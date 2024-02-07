<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title><s:text name="Prueba"/></title>
    </head>
<body>
    <hr />
    <h2>Gracias por registrarte, <s:property value="alumno.nombre" /></h2>
    <p>Haz clic <a href="<s:url action="index"/>">aquí</a> para volver al incio.</p>
</body>
</html>
