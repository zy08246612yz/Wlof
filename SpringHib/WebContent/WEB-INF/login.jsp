<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录界面</title>
<script type="text/javascript">
 function getXhr(){
	 var xhr=null;
	 if(window.XMLHttpRequest){
		 xhr=new XMLHttpRequest();
	 }else{
		 xhr=new ActiveXObject("Microsoft.XMLHttp");
	 }
	 return xhr;
 }
 function checkLogin(){
	 var xhr=getXhr();
	 var text=document.getElementById("user").value;
	 var pass=document.getElementById("pass").value;
	 xhr.open("post","Check.do",true);
	 xhr.setRequestHeader('content-type',                 
	  'application/x-www-form-urlencoded'); 
	 //可以发送过去
	 xhr.send("name="+text+"&pass="+pass);
	 xhr.onreadystatechange=function(){
			if(xhr.status==200&&xhr.readyState==4){
				document.getElementById("user").value=xhr.responseText;
				alert(xhr.responseText);
			} 
		 };
 }
</script>
</head>
<body>
<p>用户名:<input type="text" id="user"/></p>
<p>密    码:<input type="password" id="pass"></p>
<p><input type="button" onclick="checkLogin();" value="登  录"/></p>
</body>
</html>