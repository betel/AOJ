package id10011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public void reverse(){
		ArrayList<String> list 	= new ArrayList<String>();
		ArrayList<Integer> list2	= new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		try {
			while((str=br.readLine())!=null){
				list.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		int size = Integer.parseInt(list.get(0));
		String[] n = list.get(1).split(" ");
		for(String a : n){
			list2.add(Integer.parseInt(a));
		}
		
		Collections.reverse(list2);
		
		for(int i=0; i<size-1; i++){
			System.out.print(list2.get(i) + " ");
		}
		System.out.println(list2.get(size));
	}
}
