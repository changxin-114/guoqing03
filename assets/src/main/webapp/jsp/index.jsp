<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/selectAll">
        资产编号:<input type="text" name="assetid" />
        资产类型:<select name="assettype">
                    <option value="1">电子设备</option>
                    <option value="2">机械设备</option>
                    <option value="3">运输设备</option>
                </select>
        <input type="submit" value="查询" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/jsp/add.jsp"><input type="button" value="自增固定资产" /></a>
    </form>


    <table border="1px" width="600px">
        <tr>
            <td>资产编号</td>
            <td>资产名称</td>
            <td>资产类型</td>
            <td>入库日期</td>
        </tr>
        <c:forEach var="item" items="${assets}">
            <tr>
                <td>${item.assetid}</td>
                <td>${item.assetname}</td>
                <td>
                    <c:if test="${item.assettype==1}"><%out.print("电子设备");%></c:if>
                    <c:if test="${item.assettype==2}"><%out.print("机械设备");%></c:if>
                    <c:if test="${item.assettype==3}"><%out.print("运输设备");%></c:if>
                </td>
                <td>${item.intodate}</td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>
