<%@page import="org.omg.CORBA.Request"%>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
      request.setCharacterEncoding("utf-8");
    %>
    
    <jsp:useBean id="user" scope="session" class="web.UserBean">  
    </jsp:useBean>
    <jsp:setProperty property="*" name="user"/>
        <jsp:setProperty property="name" name="user"  param="user"/>
        注册成功!