<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/add" method="post">
    <table border="1px">
        <tr>
            <td colspan="2">新增固定资产</td>
        </tr>

        <tr>
            <td>资产编号</td>
            <td><input type="text" name="assetid" /></td>
        </tr>
        <tr>
            <td>资产名称</td>
            <td><input type="text" name="assetname" /></td>
        </tr>

        <tr>
            <td>资产类型</td>
            <td>
                <select name="assettype">
                    <option value="1">电子设备</option>
                    <option value="2">机械设备</option>
                    <option value="3">运输设备</option>
                </select>
            </td>
        </tr>

        <tr>
            <td>入库日期</td>
            <td><input type="text" name="intodate" /></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center"><input type="submit" value="提交" /><input type="reset" value="清空" /></td>
        </tr>
    </table>
</form>

</body>
</html>
