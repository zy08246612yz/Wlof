<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
      <jsp:useBean id="user" scope="session" class="web.UserBean">
       </jsp:useBean>
      你的ID: <jsp:getProperty property="id" name="user"/>
      你的名字 :<jsp:getProperty property="name" name="user"/>