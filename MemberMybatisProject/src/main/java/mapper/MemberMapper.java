package mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import config.DBManager;
import dto.MemberDTO;

public class MemberMapper {
	private static MemberMapper instance = new MemberMapper();
	private SqlSession session;
	private MemberMapper() {
		session = DBManager.getInstance().getSession();
	}

	public static MemberMapper getInstance() {
		if(instance == null)
			instance = new MemberMapper();
		return instance;
	}

	public MemberDTO login(HashMap<String, String> map) {
		return session.selectOne("login", map);
	}

	public List<MemberDTO> selectTopAge3() {
		return session.selectList("selectTopAge3");
	}

	
	
}
