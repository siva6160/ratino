package siva6;
import java.util.Scanner;
public class telusko1 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0){
			if (n%2==0){
				n=n/2;
				System.out.println(n);
				
			}
			else if (n%2!=0){
				n=3*n+1;
				System.out.println(n);
			}
			if (n==1){

				break;
			}
				
		}

	}

}
