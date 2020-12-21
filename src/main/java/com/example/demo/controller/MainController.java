package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.IssueDb;
import com.example.demo.repoService.IssueDbService;

@RestController
@CrossOrigin(origins="*")
public class MainController {

	@Autowired
	IssueDbService service;
	
	@GetMapping("/api/rest/issues/{issue_id}/")
	public IssueDb getIssueById(@PathVariable int issue_id){
		
		IssueDb result = service.findByIssueId(issue_id);
		return result;
	}
	
	@GetMapping("/api/rest/issues")
	public List<IssueDb> getIssueByPage(@RequestParam(value = "page_size") int pageSize,@RequestParam int page){
		
		List<IssueDb> result = service.findPaginated(page, pageSize);
		return result;
	}
	
	@PostMapping("/api/rest/issues")
	public IssueDb addIssues(@ModelAttribute("command") IssueDb issue, BindingResult result){
		
		IssueDb addEntity = service.add(issue);
		return addEntity;
	}
}
