package fbcmj4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;
import facebook4j.auth.AccessToken;

public class FbAdapter {
	String appId;
	String appSecret;
	String userToken;
	Facebook conn;
	static final Logger log = LogManager.getLogger(FbAdapter.class);
	
	public FbAdapter() throws GenericError {
		super();
		this.appId = SettingsManager.getAppId();
		this.appSecret = SettingsManager.getAppSecret();
		this.userToken = SettingsManager.getAccessToken();
		
		try {
			conn = new FacebookFactory().getInstance();
			conn.setOAuthAppId(appId, appSecret);
			conn.setOAuthPermissions(SettingsManager.getPermissions());
			conn.setOAuthAccessToken(new AccessToken(userToken));
		} catch(Exception e) {
			log.error("Error de conectividad con facebook");
			throw new GenericError("Error de conectividad con facebook");
		}
	}
	
	public FbAdapter(String appId, String appSecret, String userToken) throws GenericError {
		super();
		this.appId = appId;
		this.appSecret = appSecret;
		this.userToken = userToken;
		
		try {
			conn = new FacebookFactory().getInstance();
			conn.setOAuthAppId(appId, appSecret);
			conn.setOAuthPermissions(SettingsManager.getPermissions());
			conn.setOAuthAccessToken(new AccessToken(userToken));
		} catch(Exception e) {
			log.error("Error de conectividad con facebook");
			throw new GenericError("Error de conectividad con facebook");
		}
	}
	
	public void changeUser(String newToken) {
		conn.setOAuthAccessToken(new AccessToken(userToken));
	}
}
