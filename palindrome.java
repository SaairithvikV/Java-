package palindrome.java;

public class palindrome {
   public static void main(String[] args) {
	int[] arr= {1,2,3,2,1};
	int i=0,j=4,flag=0;
	while(i<=j) {
		if(arr[i]!=arr[j]) {
			//System.out.println("Palindrome");
			flag=1;
		}
		i++;
		j--;
	}
	if(flag==0) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a palindrome");
	}
	//obj.close();
}
}
 