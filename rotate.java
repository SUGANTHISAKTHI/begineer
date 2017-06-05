package rotate;

import java.util.Scanner;

public class rotate {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter the n elemets");
	int n=s.nextInt();
	int i,j,temp1;
	int[] a=new int[n];
	int[] b=new int[n];
	//int[] temp=new int[1];
	System.out.println("Enter the number");
	for(i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	System.out.print("Enter the k element");
	int k=s.nextInt();
	for(i=n-k;i<n;i++){
		//System.out.println(a[i]);
		b[i]=a[i];
		System.out.println(b[i]);
	}
	
for(i=0;i<n-k;i++){
	b[i]=a[i];
}
			for(i=0;i<n-k;i++){
				System.out.println(b[i]);
			}
			}
	
	}
	

