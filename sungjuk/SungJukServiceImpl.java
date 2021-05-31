package celeste.spring.sungjuk;

public class SungJukServiceImpl implements SungJukService {

	private SungJukDAO sdao;
	
	// sjdao에 대한 객체를 불러오기 위해 생성자 정의
	// 스프링 컨테이너가 sdao 변수에 sjdao 객체를 DI해줌
	public void SungJukServiceIimpl(SungJukDAO sdao) {
		this.sdao = sdao;
	}
	
	// sjdao에 대한 객체를 불러오기 위해 setter 메서드 정의
	// 스프링 컨테이너가 sdao 변수에 sjdao 객체를 DI해줌
	public void setSdao(SungJukDAO sdao) {
		this.sdao = sdao;
	}

	@Override
	public void newSungJuk() {
		SungJuk sj = new SungJuk("지현", 99, 97, 95);
		System.out.println("성적 생성됨!");
		
		sdao.insertSungJuk(sj);
		
	}
	
}
