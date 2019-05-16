<%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2019/5/15
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%
      if(request.getAttribute("list") == null){
          response.sendRedirect(request.getContextPath()+"/dubbo/list");
      }
%>

<jsp:include page="header.jsp"/>


<div class="container">
      <div class="col-md-12 col-sm-12 col-xs-12">
            <table class="table table-hover table-bordered">
                    <tr class="text-center">
                        <td>员工ID</td>
                        <td>员工姓名</td>
                        <td>员工年龄</td>
                        <td>入职时间</td>
                        <td>部门</td>
                        <td>性别</td>
                        <td>操作</td>
                    </tr>
                    <c:forEach items="${list}" var="item" varStatus="status">
                        <tr class="text-center">
                            <td>${item.pkId}</td>
                            <td>${item.name}</td>
                            <td>${item.age}</td>
                            <td>
                              <fmt:formatDate type="date" pattern="yyyy-MM-dd" value="${item.inDate}"/>
                            </td>
                            <td>
                                ${item.ment.bName}
                            </td>
                            <td>
                                <c:if test="${item.gender == 1}">
                                    女
                                </c:if>
                                <c:if test="${item.gender == 0}">
                                    男
                                </c:if>
                            </td>
                            <td>
                                <button class="btn-sm btn btn-default" data-toggle="modal" data-target="#myModal">删除</button>
                                <button class="btn-sm btn btn-default" data-toggle="modal" data-target="#myModal">添加</button>
                            </td>
                        </tr>
                    </c:forEach>
            </table>
      </div>
</div>


<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">提示</h4>
            </div>
            <div class="modal-body">
                 删除和添加的方法已经在provider中定义好了 感兴趣的可以写写测试一下~~~~~
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
            </div>
        </div>
    </div>
</div>


</body>
</html>
