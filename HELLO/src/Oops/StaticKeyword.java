package Oops;

import Oops.S.X;
import Oops.S.Y;

public class StaticKeyword {
	static {
		System.out.println("first static block");
	}
	static {
		System.out.println("second static block");
	}

	public StaticKeyword() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// S obj = new S();
		// X objX = obj.new X();
		// Y objY=new S.Y();
		System.out.println("main");
	}

	static {
		System.out.println("abc");
	}
}
