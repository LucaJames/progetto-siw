<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
	<h3> Login paziente </h3>
	<h4> inserire id e password del paziente </h4>
	<form action='/controller/utente.verifica' method='post'>
		<div>${idError} Id: <input type='text' name='id' value='${param["id"]}' ></div>
		<div>${pswError} Password: <input type="password" name='password' ></div>
		<div>${autenticazioneError}</div>
		<div><input type="submit" name="sumbit" value="invia"/></div>
	</form>
</body>
</html>