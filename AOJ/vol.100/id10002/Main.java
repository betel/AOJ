package id10002;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int rec = a*b;
		int round = a*2 + b*2;
		System.out.println(rec + " " + round);
	}

}
