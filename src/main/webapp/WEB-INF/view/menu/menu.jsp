<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<title>メニュー</title>
</head>
<body>
	メニュー画面です<br />
	セッションID: <s:property value="sessionId" /><br />
	ユーザーコード: <s:property value="userInfo.code" /><br />
	ユーザー名: <s:property value="userInfo.name" /><br />
	<a href="login">ログインへ戻る</a>
</body>
</html>
