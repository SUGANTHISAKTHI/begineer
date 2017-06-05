package mul;
import java.util.Scanner;
public class mul {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,m=0;
		for(i=1;i<=12;i++){
			m=i*n;
		System.out.println(i+"*"+n+"="+ m);
	}
		s.close();}
	

}
