<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> Login Amministratore </h3>
	<h4> inserire codice e password dell'amministratore </h4>
	<form action='/controller/amministratore.verifica' method='post'>
		<div>${idError} Id: <input type='text' name='id' value='${param["codice"]}' 
			placeholder="inserisci id"></div>
		<div>${pswError} Password: <input type="password" name='password' 
			placeholder="password"></div>
		<div>${autenticazioneError}</div>
		<div><input type="submit" name="submit" value="invia"></div>
	</form>
</body>
</html>