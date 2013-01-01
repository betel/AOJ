package id10025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	ArrayList<String> list;
	double a,b,c,s;

	public Main(){
		list = new ArrayList<String>();
	}
	public void Read(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str;
			while((str=br.readLine())!=null){
				list.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i=0; i<list.size(); i++){
			String[] strList;
			strList = list.get(i).split(" ");
			a = Double.parseDouble(strList[0]);
			b = Double.parseDouble(strList[1]);
			c = Double.parseDouble(strList[2]);
		}
		
	}
	public void calc(double a, double b, double c){
		s = 1/2 * a * b * Math.sin(c);
	}
	
	public static void main(String[] args){
		new Main().calc();
	}
}
