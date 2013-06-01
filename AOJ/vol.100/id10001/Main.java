package id10001;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		int y = (int)(Math.pow(x, 3));
		System.out.println(y);
	}

}
