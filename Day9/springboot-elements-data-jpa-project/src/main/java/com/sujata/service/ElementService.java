package com.sujata.service;

import java.util.List;

import com.sujata.bean.Element;

public interface ElementService {

	List<Element> getAllElements();
	Element getElementById(int automicNumber);
	boolean insertElement(Element element);
	boolean deleteElement(int automicNo);
}
