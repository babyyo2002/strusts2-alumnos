<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
    <s:head />
        <meta charset="UTF-8">
        <title><s:text name="access.title" /></title>
    </head>
<body>
    <hr />
    <h1><s:text name="access.message" /></h1>
    <p><s:text name="access.message2" /></p>
    <s:form theme="simple" action="acceder" method="post">
        <table>
        <tr>
            <td class="evenRow">
                <s:fielderror fieldName = "id" />
                <s:text name="form.message.id" />
                <s:textfield name="id"/>
            </td>
        </tr>
        <tr>
            <td class="evenRow">
                <s:submit align="left" value="Enviar"/>
            </td>
        </tr>
    </table>
    </s:form>
    <div>
        <p><s:text name="access.message3" /><a href="<s:url action="registro" />">regístrate</a>
    </div>
    <hr />
</body>
</html>