package com.destination.septemberbatch.sep25;
class plane {
	void takeOff() {
		System.out.println("plane took off");
	}
	void fly() {
		System.out.println("plane is flying");
	}
	void land() {
		System.out.println("plane has landed");
	}
}
class cargoplane extends plane {
	@Override
	void fly() {
		System.out.println("cargo plane fly at low heights");
	}
	void carryGoods() {
		System.out.println("cargo plane carry goods");
	}
}
class passengerplane extends plane {
	@Override
	void fly() {
		System.out.println("passenger plane fly at medium heights");
	}
	void carrypassenger() {
		System.out.println("passenger plane carry passenger");
	}
}
class Fighterplane extends plane {
	@Override
	void fly() {
		System.out.println("Fighter plane fly at great heights");
	}
	void carryWeapons() {
		System.out.println("Fighter plane carry Weapons");
	}
}
public class LaunchPlane {

	public static void main(String[] args) {
		cargoplane cp = new cargoplane();
		passengerplane pp = new passengerplane();
		Fighterplane fp = new Fighterplane();
		System.out.println("cargo plane----");
		cp.takeOff();
		cp.fly();
		cp.land();
		cp.carryGoods();
		System.out.println("==============");
		System.out.println("passenger plane--------");
		pp.takeOff();
		pp.fly();
		pp.land();
		pp.carrypassenger();
		System.out.println("==============");
        System.out.println("Fighter plane-------");
        fp.takeOff();
		fp.fly();
		fp.land();
		fp.carryWeapons();
		System.out.println("==============");
	}

}
