package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Element {

	@Id
	private int automicNo;
	private String elementName;
	private String chemicalSymbol;
	private double atomicWeight;

	public Element() {

	}

	public Element(int automicNo, String elementName, String chemicalSymbol, double atomicWeight) {
		super();
		this.automicNo = automicNo;
		this.elementName = elementName;
		this.chemicalSymbol = chemicalSymbol;
		this.atomicWeight = atomicWeight;
	}

	public int getAutomicNo() {
		return automicNo;
	}

	public void setAutomicNo(int automicNo) {
		this.automicNo = automicNo;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public String getChemicalSymbol() {
		return chemicalSymbol;
	}

	public void setChemicalSymbol(String chemicalSymbol) {
		this.chemicalSymbol = chemicalSymbol;
	}

	public double getAtomicWeight() {
		return atomicWeight;
	}

	public void setAtomicWeight(double atomicWeight) {
		this.atomicWeight = atomicWeight;
	}

	@Override
	public String toString() {
		return "Element [automicNo=" + automicNo + ", elementName=" + elementName + ", chemicalSymbol=" + chemicalSymbol
				+ ", atomicWeight=" + atomicWeight + "]";
	}
	
	

}
