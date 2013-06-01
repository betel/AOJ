package id10013;

/*
 * 1列目から順番に描いていくやり方
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		new Main().draw();
	}
	public void draw(){
		BufferedReader	br	=	new BufferedReader(new InputStreamReader(System.in));
		String[] str;
		while(true){
			try {
				str = br.readLine().split(" ");
				int h = Integer.parseInt(str[0]);
				int w = Integer.parseInt(str[1]);
				
				if(h==0 && w==0){ break; }
				
				for(int i=0; i<w; i++){ System.out.print("#"); }
				System.out.println("");
				
				for(int i=0; i<h; i++){
					System.out.print("#");
					for(int j=0; j<w-2; j++){
						System.out.print(".");
					}
					System.out.println("#");
				}
				for(int i=0; i<w; i++){ System.out.print("#"); }
				System.out.println("");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
