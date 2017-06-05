package amstrong;

import java.util.Scanner;

public class amstrong {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int n1=n;
	//int count=0;
	int r;
	int m;
	int t=0;
	s.close();
	//while(n!=0){
		//n=n/10;
		//count=count+1;
		//}
//System.out.print(" "+count);
while(n1!=0){
	r=n1%10;
	m=r*r*r;
	t=t+m;
	n1=n1/10;
	}
System.out.print(t);

if(n==t){
	System.out.println("it is amstrong");
}
else
System.out.println("not amstrong");
	}
}

