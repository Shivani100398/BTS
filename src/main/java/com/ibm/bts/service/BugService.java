package com.ibm.bts.service;

import com.ibm.bts.entity.Bug;
import com.ibm.bts.repo.BugRepository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BugService {//Spring Beans
@Autowired
BugRepository bugRepository;
public String createBugs(Bug bug)
{
	Bug bugCreated=bugRepository.save(bug);
	return bugCreated.getId();
}

public List<Bug> getBugs()
{
  return bugRepository.findAll();	
 
}
    public Optional<Bug> getBug(String bugId) {
	 return bugRepository.findById(bugId);
		
	}
public void updateBug(Bug bug) {
      bugRepository.save(bug);
}


public void deleteBug(String bugId) {
	bugRepository.deleteById(bugId);
	
}



}
