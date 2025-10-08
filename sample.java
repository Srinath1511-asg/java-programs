package Slidingwindow;

public class sample {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		
		int k=3;
		int i=0;
		int sum=0;
		int answer =0;
		int n=arr.length;
		
		while(i<k) {
			sum+=arr[i];
			i++;
		}
		answer=Math.max(sum,answer);
		
		System.out.println(answer);
		while(i<n) {
			sum+=arr[i];
			sum-=arr[i-k];
			answer=Math.max(answer, sum);
			i++;
			
		}
		System.out.println(answer);
		
		
	}
	
	

}
