package pattern9.java;

public class pattern9 {
	public static void main(String[] args) {
                int n=5;
                for(int i=1,p=5;i<=n;i++,p--) {
                	int k =p;
                	for(int j=i;j<=n;j++) {
                		System.out.print(k-- + " ");
                	}
                	System.out.println();
                }
}
}