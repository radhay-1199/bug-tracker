package com.example.demo.repoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.IssueDb;
import com.example.demo.repoImpl.IssueDbRepoImpl;

@Service
public class IssueDbService {

	@Autowired
	IssueDbRepoImpl repo;
	
	public IssueDb findByIssueId(int id) {
		try {
			return repo.findById(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public List<IssueDb> findPaginated(int pageNo,int pageSize){
		
		try {
			Pageable paging = PageRequest.of(pageNo, pageSize);
			 Page<IssueDb> pageResult = repo.findAll(paging);
			 return pageResult.toList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return null;
		}
		 
	}
	
	public IssueDb add(IssueDb entity) {
		
		try {
			return this.repo.save(entity);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return null;
		}
	}
}
