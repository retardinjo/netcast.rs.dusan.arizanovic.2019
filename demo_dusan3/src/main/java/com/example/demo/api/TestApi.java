package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ClanDao;
import com.example.demo.domain.Clan;

@RestController
@RequestMapping("/test")
public class TestApi {

	
	@Autowired
	ClanDao clanDao;
	
	
	@GetMapping("/t1")
	public List<Clan> test() {
		
		return (List<Clan>)clanDao.findAll();
	}
	
}