package reverses;
import java.util.Scanner;
public class reverses {
public static void main(String[] args){
	System.out.println("Enter the string:");
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	int i;
	String s3;
	String s2="";
	for(i=s1.length()-1;i>=0;i--){
		s2=s2+s1.charAt(i);
	}
	System.out.println(s2);
	s3=s1.replaceAll("[aeiouAEIOU]","k");
	System.out.print(s3);
}
}
