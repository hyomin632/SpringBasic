package celeste.spring.annotation;

import org.springframework.stereotype.Repository;

import celeste.spring.sungjuk.SungJuk;
import celeste.spring.sungjuk.SungJukDAO;

@Repository("sdao")
public class SungJukDAOImpl implements SungJukDAO {

	@Override
	public void insertSungJuk(SungJuk sj) {
		System.out.println("성적 추가됨!");
	}

}
