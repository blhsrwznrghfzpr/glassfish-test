package test.action.menu;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import test.action.login.Login;
import test.bean.common.UserInfoBean;
import test.common.Const;

public class Menu extends ActionSupport implements SessionAware, ServletRequestAware {

	private static final Log log = LogFactory.getLog(Login.class);

	private static final long serialVersionUID = 1L;
	// セッション情報
	private Map<String, Object> session;

	private HttpServletRequest request;

	// ユーザー情報
	private UserInfoBean userInfo = null;

	private String sessionId = null;

	@Override
	public String execute() throws Exception {
		log.info("メニュー開始");

		userInfo = (UserInfoBean) session.get(Const.USER_INFO);
		if (userInfo == null) {
			log.info("userInfo is null");
		} else {
			log.info("ユーザーコード1: " + userInfo.getCode());
			log.info("ユーザー名1: " + userInfo.getName());
		}

		final HttpSession session = request.getSession();
		sessionId = session.getId();
		log.info("セッションID: " + sessionId);
		userInfo = (UserInfoBean) session.getAttribute(Const.USER_INFO);
		if (userInfo == null) {
			log.info("userInfo is null");
		} else {
			log.info("ユーザーコード2: " + userInfo.getCode());
			log.info("ユーザー名2: " + userInfo.getName());
		}

		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public UserInfoBean getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfoBean userInfo) {
		this.userInfo = userInfo;
	}

	public String getSessionId() {
		return sessionId;
	}

}