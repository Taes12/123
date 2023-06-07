package com.springproject.dunk.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.dunk.dao.MatchingDao;
import com.springproject.dunk.domain.Matching;

@Service
public class MatchingServiceImpl implements MatchingService {
	
	//페이지에 보일 게시글 수
	private static final int PAGE_SIZE = 20;
	
	private static final int PAGE_GROUP = 5;
	
	@Autowired
	private MatchingDao matchingDao;
	
	public void setMatchingDao(MatchingDao matchingDao) {
		this.matchingDao = matchingDao;
	}

	@Override
	public Map<String, Object> matchingList(int pageNum)
	{
		
		int currentPage = pageNum;
		int startRow = (currentPage -1) * PAGE_SIZE;
		
		int listCount = matchingDao.getMatchingCount();
		
		List<Matching> matchingList = matchingDao.matchingList(startRow, PAGE_SIZE);
		
		int pageCount =
				listCount / PAGE_SIZE + (listCount % PAGE_SIZE == 0 ? 0 : 1);
		
		int startPage = (currentPage / PAGE_GROUP) * PAGE_GROUP + 1
				- (currentPage % PAGE_GROUP == 0 ? PAGE_GROUP : 0);
		
		int endPage = startPage + PAGE_GROUP - 1;
		
		if(endPage > pageCount) {
			endPage = pageCount;
			}
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("matchingList", matchingList);
		modelMap.put("pageCount", pageCount);
		modelMap.put("startPage", startPage);
		modelMap.put("endPage", endPage);
		modelMap.put("currentPage", currentPage);
		modelMap.put("listCount", listCount);
		modelMap.put("pageGroup", PAGE_GROUP);
		
		
		return modelMap;
	}

	@Override
	public Matching getMatching(int no, boolean isCount) {
		
		return matchingDao.getMatching(no, isCount);
	}


}
