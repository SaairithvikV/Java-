package minmaxproduct;

public class minmaxproduct {
	
	public static void main(String[] args) {

	int[] arr1 = {5, 7, 9, 3, 6, 2};
	int[] arr2 = {1, 2, 6, 1, 9};
	int max=arr1[0];
	int min=arr2[0];
	for(int i=0;i<=5;i++) {
		if(arr1[i]>max)	{
			max=arr1[i];
		}
}
	for(int j=0;j<=4;j++) {
		if(arr2[j]<min) {
			min=arr2[j];
		}
	}
	
	System.out.print(max*min);
}
	
}
