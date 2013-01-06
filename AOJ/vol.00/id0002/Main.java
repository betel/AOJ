package id0002;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a<0 || b<0){break;}
			int c = a + b;
			int k = 0;
			while(c!=0){
				c /= 10;
				k++;
			}
			System.out.println(k);
		}
		sc.close();
	}

}
