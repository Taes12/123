package com.springproject.dunk.dao;

import java.util.List;

import com.springproject.dunk.domain.Matching;

public interface MatchingDao {
	
	public abstract List<Matching> matchingList(int startRow, int num);
	
	//모든 메칭 게시글을 반환
	public abstract int getMatchingCount();
	
	public abstract Matching getMatching(int no, boolean isCount);


}
