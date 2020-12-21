package com.example.demo.repoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.IssueDb;

@Repository
public interface IssueDbRepoImpl extends JpaRepository<IssueDb,Integer>{
	
	public IssueDb findById(int id);
}
