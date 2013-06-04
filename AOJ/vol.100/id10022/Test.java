package id10022;

import java.util.ArrayList;

public class Test {
	void doit(){
		String text = "thisfdfasdf";
		String[] words = text.split(" ");
		ArrayList<String> list = new ArrayList<String>();
		for(String s : words){
			list.add(s);
		}
		for(String s : list){
			System.out.println(s);
		}
	}
	public static void main(String[] args){
		new Test().doit();
	}
}
