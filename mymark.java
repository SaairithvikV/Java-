package mark.java;

import java.util.Scanner;

public class mymark{
	
	public static void main(String[] args) {
		int mark;
		Scanner myobj = new Scanner(System.in);
		mark = myobj.nextInt();
		if(mark<=100 && mark>=90) {
			System.out.println("Grade A");
		}
		else if(mark<90 && mark>=80) {
			System.out.println("Grade B");
		}
		else if(mark<80 && mark>=60) {
			System.out.println("Grade C");
			
		}
		else if(mark<60 && mark>=35) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}
		
		
	}

}
