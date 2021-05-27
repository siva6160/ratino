package siva5;
import java.util.*;
public class telusko {

	public static void main(String[] args) {
		int num;
		int a=0;
		int b=1;
		int c;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.print(a);
		for(int i=0;i<=num;i++){
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
			
		}
		

	}

}
