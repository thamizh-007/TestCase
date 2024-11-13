package com.testcase.tns;
import java.util.Scanner;

public class testimonal {

	public static void main(String[] args) {
		int n,m,N;
		
		System.out.println("Test Case 2:");
		Scanner P=new Scanner(System.in);
		System.out.print("Enter the n value: ");
		n=P.nextInt();
		System.out.print("Enter the m value: ");
		m=P.nextInt();
		System.out.print("Enter the N value: ");
		N=P.nextInt();
		
		System.out.print("The Results are ");

		for(int i=n;i<=m;i++){
			int temp=i;
			int Sum=0;

			while(temp!=0){
				Sum=Sum+(temp%10);
				temp/=10;
			}
			
			if(Sum==N){				
				System.out.print(i+" ");
			}
		}
		P.close();
		}

}
