package Begineer;
import java.util.*;
public class primenumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two number");
		int n=s.nextInt();
		int m=s.nextInt();
		int count=0;
		for(int i=n;i<=m;i++){
			count=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					count=count+1;
					break;
				}
			}
			if(count==0){
				System.out.println(i);
			}
		}

	}

}
