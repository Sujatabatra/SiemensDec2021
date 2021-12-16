package com.sujata.presentation;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.bean.Element;
import com.sujata.service.ElementService;

@Component
public class ElementPresentationImpl implements ElementPresentation {

	@Autowired
	private ElementService elementService;
	
	@Override
	public void showMenu() {
		System.out.println("1. List All Elements ");
		System.out.println("2. Search Element By Automic Number ");
		System.out.println("3. Insert Element ");
		System.out.println("4. Delete Element By Automic Number ");
		System.out.println("5. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner = new Scanner(System.in);
		switch (choice) {
		case 1:
			List<Element> elementList = elementService.getAllElements();
			for (Element e : elementList) {
				System.out.println(e);
			}
			break;
		case 2:
			System.out.println("Enter Automic Number to be searched for : ");
			int automicNo = scanner.nextInt();
			Element element = elementService.getElementById(automicNo);
			if (element == null)
				System.out.println("Element with automic no " + automicNo + " doesnot exist");
			else
				System.out.println(element);
			break;
		case 3:
			System.out.println("Enter Automic Number : ");
			int automicNumber = scanner.nextInt();
			System.out.println("Enter Element Name : ");
			String name = scanner.next();
			System.out.println("Enter Chemical Symbol  : ");
			String chemicalSymbol = scanner.next();
			System.out.println("Enter Automic Weight : ");
			double automicWeight = scanner.nextDouble();
			
			Element ele = new Element(automicNumber, name, chemicalSymbol, automicWeight);
			if (elementService.insertElement(ele))
				System.out.println("Element Added");
			else
				System.out.println("Element addition failed");
			break;
		case 4:
			System.out.println("Enter automic No to be deleted : ");
			int autoNo = scanner.nextInt();
			if (elementService.deleteElement(autoNo))
				System.out.println("Element Deleted");
			else
				System.out.println("Element Deletion failed");
			break;
		case 5:
			System.out.println("Thanks for using Element Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}
