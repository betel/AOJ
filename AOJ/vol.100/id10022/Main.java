package id10022;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws FileNotFoundException{
		ArrayList<String> list,words;
		String str;
		String[] w;
		int count = 0;
		BufferedReader br;
		br = new BufferedReader(new FileReader("id10022data.txt"));
		try {
			list = new ArrayList<String>();
			while((str=br.readLine())!="END_OF_TEXT"){
				list.add(str);		//1行ごとにlistに追加
			}

			words = new ArrayList<String>();
			for(int i=0; i<list.size(); i++){
				w = list.get(i).split(" ");
				for(String s : w){
					words.add(s);
				}
			}
			//判別
			String sample = words.get(0);
			for(String s : words){
				if(sample.equals(s)){
					count++;
				}
			}
			System.out.println(count-1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
