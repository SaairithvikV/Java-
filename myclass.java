package myclass;

import java.util.Scanner;

public class myclass {
	
	public static void main(String[] args) {
	int a,b,c;
	Scanner myobj= new Scanner(System.in);
	a=myobj.nextInt();
	b=myobj.nextInt();
	c=myobj.nextInt();
	if(a+b+c<=180) {
		System.out.print("triangle");
	}
	else {
		System.out.print("Not a triangle");
	}
	}

}
