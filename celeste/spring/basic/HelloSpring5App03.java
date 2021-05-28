package celeste.spring.basic;

import celeste.spring.beans.HelloSpring5Bean03;
import celeste.spring.beans.HelloSpring5Bean03Eng;
import celeste.spring.beans.HelloSpring5Bean03Kor;

public class HelloSpring5App03 {
	
	// 네 번째 사례
    // 인삿말을 한국어, 영어, 일본어로 출력하도록 기능 추가

	// 인터페이스를 도입하면
    // 확장성이 높고 유연한 코드를 작성할 수 있음
    // 또한 객체 간의 tightly coupled를 피할 수 있고,
    // 객체 간의 의존성을 낮출 수도 있음
	
	// 하지만, new 연산자로 객체를 생성하는 코드가 노출됨
    // 다시 말해, HelloSpringBean03은
    // HelloSpring5Bean03Kor03, HelloSpring5Bean03Eng03,
    // HelloSpring5Bean03Jpn03에 의존적이라는 의미
	
	// 해결 : factory 패턴을 이용해서
    // 객체 생성을 전담하는 클래스를 만들어
    // 객체 생성 과정을 캡슐화함

	public static void main(String[] args) {
		// 인터페이스를 사용하지 않은 경우
		// HelloSpring5Bean03 bean = new HelloSpring5Bean03Kor();
		// bean.sayHello("스프링5!");
		
		// HelloSpring5Bean03 bean2 = new HelloSpring5Bean03Eng();
		// bean2.sayHello("Spring5!");
	
		// 인터페이스를 사용한 경우
		HelloSpring5Bean03 bean = new HelloSpring5Bean03Kor();
		bean.sayHello("스프링5!");
		
		bean = new HelloSpring5Bean03Eng();
		bean.sayHello("Spring 5!");
	}

}
