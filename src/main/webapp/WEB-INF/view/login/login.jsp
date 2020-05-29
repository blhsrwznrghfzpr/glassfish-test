<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<title>ログイン</title>
</head>
<body>
	ログイン画面です<br />
	ユーザーコード: <input id="user_code" name="userCode" value="test-code" /><br />
	ユーザー名: <input id="user_name" name="userName" value="test-name" /><br />
	<button id="login_auth">ログイン</button>
</body>
</html>
