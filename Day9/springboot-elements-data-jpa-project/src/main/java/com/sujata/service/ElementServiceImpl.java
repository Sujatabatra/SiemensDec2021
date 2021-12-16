package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.Element;
import com.sujata.persistence.ElementDao;

@Service
public class ElementServiceImpl implements ElementService {

	@Autowired
	private ElementDao elementDao;
	
	@Override
	public List<Element> getAllElements() {
		return elementDao.findAll();
	}

	@Override
	public Element getElementById(int automicNumber) {
		return elementDao.getById(automicNumber);
	}

	@Override
	public boolean insertElement(Element element) {
		Element ele=elementDao.save(element);
		if(ele!=null)
			return true;
		return false;
	}

	@Override
	public boolean deleteElement(int automicNo) {
		elementDao.deleteById(automicNo);
		return true;
	}

}
