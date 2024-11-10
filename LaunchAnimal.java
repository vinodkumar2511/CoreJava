package com.destination.septemberbatch.sep25;
class Animal {
	void eat1() {
		System.out.println("Animal can eat");
	}
	void sleep() {
		System.out.println("Animal can sleep");
	}
	void breath() {
		System.out.println("Animal can breath");
	}
}
class Elephant extends Animal {
	//@override
	void eat() {
		System.out.println("Elephant eat the vegetables");
	}
	void walkslow() {
		System.out.println("Elephant is walking slowly");
	}
}
class Lion extends Animal {
	//@override
	void eat1() {
		System.out.println("Lion eat at meet");
	}
	void runsfast() {
		System.out.println("Lion can runs fastly");
	}
}
class Monkey extends Animal {
	//@override
	void eat() {
		System.out.println("Monkey eat at bananas");
	}
	void JumpsHighly() {
		System.out.println("Monkey is Jumping highly in the trees");
	}
}
public class LaunchAnimal {

	public static void main(String[] args) {
       Elephant e =new Elephant();
       Lion l = new Lion();
       Monkey m = new Monkey();
       System.out.println("Elephant-------");
       e.eat();
       e.sleep();
       e.breath();
       System.out.println("============");
       System.out.println("Lion-------");
       l.eat1();
       l.sleep();
       l.breath();
       System.out.println("============");
       System.out.println("Monkey-------");
       m.eat();
       m.sleep();
       m.breath();
       System.out.println("============");
	}

}
