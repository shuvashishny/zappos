package platform;

public class Session {
	
	private static String sessionVariable;

	public static String getSessionVariable() {
		return sessionVariable;
	}

	public static void setSessionVariable(String sessionVariable) {
		Session.sessionVariable = sessionVariable;
	}

}
