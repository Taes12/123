package com.springproject.dunk.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springproject.dunk.domain.Matching;

@Repository
public class MatchingDaoImpl implements MatchingDao {
	
	private final String NAME_SPACE="com.springproject.dunk.mapper.MatchingMapper";
	
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Matching> matchingList(int startRow, int num) {
		
		//페이징처리~
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("startRow", startRow);
		params.put("num", num);
		
		return sqlSession.selectList(NAME_SPACE +".matchingList", params);
	}
	
	//페이징처리에 사용(모든 게시글 수 읽어오기)
	@Override
	public int getMatchingCount() {
		//Map<String, String> params = new HashMap<String, String>();
		
		return sqlSession.selectOne(NAME_SPACE + ".getMatchingCount");
	}
	
	//no에 해당하는 디테일로 넘어가는 부분
	@Override
	public Matching getMatching(int no, boolean isCount) {
		
		return sqlSession.selectOne(NAME_SPACE+".getMatching", no);
	}

	
}
