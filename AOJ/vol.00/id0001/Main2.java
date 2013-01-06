package id0001;

import java.util.Scanner;

public class Main2 {
	public void start(){
		Scanner sc = new Scanner(System.in);
		int[] h = new int[10];
		for(int i=0; i<h.length; i++){
			h[i] = sc.nextInt();
		}
		sc.close();

		for(int i=0; i<3; i++){
			for(int j=i; j<h.length; j++){
				if(h[j] > h[i]){
					int max = h[j];
					h[j] = h[i];
					h[i] = max;
				}
			}
			System.out.println(h[i]);
		}
	}
	public static void main(String[] args){
		new Main2().start();
	}
}
