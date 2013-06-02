package id10017;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException{
		new Main().doIt();
	}
	void doIt() throws FileNotFoundException{
		BufferedReader br = new BufferedReader(new FileReader("sampleData/id10017.txt"));
		while(true){
			try {
				String[] str = br.readLine().split(" ");
				int n = Integer.parseInt(str[0]);
				int x = Integer.parseInt(str[1]);
				if(n==0&&x==0) break;
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	void ways(int n, int x){
		
	}
}
