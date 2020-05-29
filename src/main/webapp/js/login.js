"use strict";
$(function() {
	$("#login_auth").on("click", login_auth_click);
})

function login_auth_click() {
	const userCode = $("#user_code").val().trim();
	const userName = $("#user_name").val().trim();

	const param = { userCode, userName };
	$.ajax({
		type : "post",
		url : "loginAuth",
		data : param,
		async : "false",
		success : json_receive,
		timeout : 180000,
		error : ajax_error
	});
}

function json_receive(jsonLike) {
	const result = JSON.parse(jsonLike).UP_JSON;
	for (const obj of result) {
		eval(obj.src);
	}
}

function ajax_error() {
	alert('ホストとの通信でエラーが発生しました。');
}