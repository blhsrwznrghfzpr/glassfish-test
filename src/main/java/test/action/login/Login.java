package test.action.login;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import test.bean.common.UserInfoBean;
import test.common.Const;

public class Login extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;

	private static final Log log = LogFactory.getLog(Login.class);

	// セッション情報
	private Map<String, Object> session;

	private String userCode = "";
	private String userName = "";

	@Override
	public String execute() throws Exception {
		log.info("ログイン開始");
		return SUCCESS;
	}

	public String doAuth() throws Exception {
		log.info("ログイン処理");
		log.info("ユーザーコード: " + userCode);
		log.info("ユーザー名: " + userName);

		// ユーザー情報
		final UserInfoBean userInfo = new UserInfoBean();
		userInfo.setCode(userCode);
		userInfo.setName(userName);

		// ユーザー情報をセッションに格納
		session.put(Const.USER_INFO, userInfo);

		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
