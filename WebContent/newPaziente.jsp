<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nuovo Paziente</title>
</head>
<body>
	<h2>Creazione nuovo profilo paziente</h2>
	<form action='/controller/paziente.create' method='post'>
		<div>${nomeError}<label>Nome: </label><input type='text' name='nome' value='${param["nome"]}' /></div>
		<div>${cognomeError}<label>Cognome: </label><input type='text' name='cognome' value='${param["cognome"]}' /></div>
		<div>${idError}<label>Id: </label><input type='text' name='id' value='${param["id"]}' /></div>
		<div>${pswError}<label>Password: </label><input type="password" name='password' /></div>
		<input type="submit" name="submit" value="invia">
	</form>
</body>
</html>