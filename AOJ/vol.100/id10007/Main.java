package id10007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public void smaller(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true){
				String str = br.readLine();
				String n[] = str.split(" ");
				int x = Integer.parseInt(n[0]);
				int y = Integer.parseInt(n[1]);
				
				if(x==0&&y==0){ break; }
				if(x>y){
					System.out.println(y + " " + x);
				}else{
					System.out.println(x + " " + y);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		new Main().smaller();
	}
}
