package id10030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	ArrayList<String>	list = new ArrayList<String>();
	int[] numList1,numList2;

	public void start(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		try {
			while((str=br.readLine())!=null){
				list.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		numList1 = new int[Integer.parseInt(list.get(0))];
		numList2 = new int[Integer.parseInt(list.get(2))];

		for(int i=0; i<numList1.length; i++){
			String[] s1	=	list.get(1).split(" ");
			String[] s2 =	list.get(3).split(" ");
			numList1[i] = Integer.parseInt(s1[i]);
			numList2[i] = Integer.parseInt(s2[i]);
		}
	}
	public static void main(String[] args){
		new Main().start();
	}
}
