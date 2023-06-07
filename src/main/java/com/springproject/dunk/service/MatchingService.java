package com.springproject.dunk.service;

import java.util.Map;

import com.springproject.dunk.domain.Matching;

public interface MatchingService {
	
	public abstract Map<String, Object> matchingList(int pageNum);
	
	public abstract Matching getMatching(int no,boolean isCount);
	
	//public abstract void insertMatching(Matching matching);
	
	//public boolean isPassCheck(int no,String pass);
	
	//public abstract void updateMatching(Matching matching);
	
	//public abstract void deleteMatching(int no);

}
