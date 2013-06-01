package id10012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public void draw(){
		int h,w;
		
		BufferedReader	br	=	new BufferedReader(new InputStreamReader(System.in));
		while(true){
			try {
				String[] str	= 	br.readLine().split(" ");
				h = Integer.parseInt(str[0]);
				w = Integer.parseInt(str[1]);
				
				if(h==0 && w==0){ break; }
				
				for(int i=0; i<h; i++){
					for(int j=0; j<w; j++){
						System.out.print("#");
					}
					System.out.println("");//改行
				}
				System.out.println("");//改行
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
		new Main().draw();
	}
}
