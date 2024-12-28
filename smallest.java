package smallest.java;

public class smallest {
	public static void main(String[] args) {

		
		int[] arr2 = {1, 2, 6, 1, 9};
		
		int min=arr2[0];
		
	    for(int j=0;j<=4;j++) {
			if(arr2[j]<min) {
				min=arr2[j];
			}
		}
	    System.out.println(min);
		
}
}
