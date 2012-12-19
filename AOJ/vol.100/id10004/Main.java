package id10004;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int max = 3;
		int[] n = new int[max];
		int[] m = new int[n.length];
		n[0] = sc.nextInt();
		n[1] = sc.nextInt();
		n[2] = sc.nextInt();
		int min = n[0];
		for(int i=0; i<m.length; i++){
			for(int j=0; j<max; j++){
				if(n[j]<min){
					min = n[j];
					n[j] = n[max - 1];
					--max;
				}
			}
			m[i] = min;
			min = n[0];
		}
		for(int a : m){
			System.out.print(a + " ");
		}
	}

}
