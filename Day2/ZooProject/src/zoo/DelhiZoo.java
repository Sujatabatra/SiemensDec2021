package zoo;

import org.animals.*;

public class DelhiZoo {

	public static void main(String[] args) {
//		org.animals.Monkey monkey=new org.animals.Monkey();

		Monkey monkey=new Monkey();
		monkey.setColor("Light Brown");
		monkey.setWeight(5);
		monkey.setAge(2);
		
		monkey.sound();
		
		Lion lion=new Lion();
		lion.setColor("Golden");
		lion.setWeight(250);
		lion.setAge(5);
		lion.sound();
	}

}
