package fbcmj4;

import java.util.Scanner;

public class SettingsManager {

	
	public static String getAppSecret() {
		return "0b7ca36593f57cdc82392d370e86fbea";
	}
	
	public static String getAccessToken() {
		return "EAAB4hGJUj5kBAOVk7eOKAWhDOBI9d6UmZC0EDbshpTPQu6kj3MzRE0vcEIimPviGa0QUfadpZAcSZA8WPrQS3p6HOJ8jSrHZAvtQimECitsWiyF4qbZBcxL6QRYQtkjAPTNIZCKxZA0NCAxpIz2I1pUe7CyosnRvHBnJtqEJpaFUwZDZD";
	}
	
	public static String getPermissions() {
		return "public_profile,user_actions.news,user_posts,publish_actions";
	}
	
	public static String getAppId() {
		return "132509980725145";
	}
	
	public static String getUrlForToken() {
		return "https://www.facebook.com/v2.10/dialog/oauth?client_id="+getAppId()+"&redirect_uri=https://www.facebook.com/connect/login_success.html";
	}
	
	public static String LoginProccess(Scanner scan) {
		System.out.println("Hola!, para acceder debes entrar a la siguiente liga y a continuacion copiar el parametro code aqui (" + getUrlForToken() + "):");
		String code = scan.nextLine();
		String urlToken = "https://graph.facebook.com/oauth/access_token?client_id=" + getAppId() + "&redirect_uri=https://www.facebook.com/connect/login_success.html" + "&client_secret=" + getAppSecret() + "&code=" + code;
		System.out.println("Ahora accede a la url y del JSON pega el dato de acces_token (" + urlToken + "):" );
		String newToken = scan.nextLine();
		setAppSecret(newToken);
		return newToken;
		
	}
	
	public static void setAppSecret(String newValue) {
		//
	}
	
	public static void setAccessToken(String newValue) {
		//
	}
	
	public static void setPermissions(String newValue) {
		// 
	}
	
	public static void setAppId(String newValue) {
		//
	}
}
