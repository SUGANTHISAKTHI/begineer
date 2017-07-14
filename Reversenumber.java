package Begineer;
import java.util.*;
public class Reversenumber {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	int sum=0;
	int r;
	while(n!=0){
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	System.out.println(sum);

}

}
