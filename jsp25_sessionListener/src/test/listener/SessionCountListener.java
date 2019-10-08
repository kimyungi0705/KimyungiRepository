package test.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
 * [ HttpSessionListener ]]
 * - 세션이 생성되거나 종료될때에 대한 이벤트를 처리하는 리스너
 * 
 */
public class SessionCountListener implements HttpSessionListener{
	private static int userCount=0;
	public static int getUserCount() {
		return userCount;
	}
	//세션이 생성되면 자동호출
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("세션이 생성되었습니다..");
		userCount++;
	}
	//세션이 소멸되면 자동 호출
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("세션이 소멸되었습니다..");
		userCount--;
	}
}



