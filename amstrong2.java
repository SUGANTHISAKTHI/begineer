package amstrong2;

import java.util.Scanner;

public class amstrong2 {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=s.nextInt();
		int i;
		int r,m;
		int t=0;
		int[] a=new int[n];
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		s.close();
	
		for(i=0;i<n;i++){
			int n1=a[i];
			while(a[i]!=0){
				r=a[i]%10;
				m=r*r*r;
				t=t+m;
				a[i]=a[i]/10;
			
			}
	if(n1==t){
				System.out.println("the amstrong value is"+t);
	}
		}
}
}
		
		
	
