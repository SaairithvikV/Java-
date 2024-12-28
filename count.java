package count.java;

public class count {
	public static void main(String[] args) {
	int a=325345,count=0,idigit=0;
	while(a>0) {
		idigit=a%10;
		count++;
		a=a/10;
	}
	System.out.println(count);
	}

}
