package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.TipPretplateDao;
import com.example.demo.domain.TipPretplate;
import com.example.demo.domain.dto.TipPretplateDto;
import com.example.demo.service.implementation.TipPretplateInt;

@Service
public class TipPretplateService implements TipPretplateInt{
	
	@Autowired
	private TipPretplateDao tipPretplateDao;

	@Override
	public String process(TipPretplateDto tipPretplateDto) {
		TipPretplate tp = new TipPretplate(); 
		tp.setTip(tipPretplateDto.getTip());
		tp.setCena(tipPretplateDto.getCena());
		tipPretplateDao.save(tp); 
		return "added";
	}
	
	@Override
	public String process1(TipPretplateDto tipPretplateDto) {
		TipPretplate tp = new TipPretplate(); 
		tp.setId(tipPretplateDto.getId());
		tp.setTip(tipPretplateDto.getTip());
		tp.setCena(tipPretplateDto.getCena());
		tipPretplateDao.save(tp); 
		return "updated";
	}

	
}