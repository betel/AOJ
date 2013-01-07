package id10030;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	ArrayList<String>	list;
	ArrayList<Integer>	numList1,numList2,blackList;
	int count = 0;

	public Main(){
		list = new ArrayList<String>();
		numList1 = new ArrayList<Integer>();
		numList2 = new ArrayList<Integer>();
		blackList = new ArrayList<Integer>();
	}


	public void start(){
		String str;
		try {
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader br = new BufferedReader(new FileReader("sampleData/id10030D2.txt"));
			while((str=br.readLine())!=null){
				list.add(str.trim());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] s1	=	list.get(1).split(" ");
		String[] s2 =	list.get(3).split(" ");

		for(int i=0; i<s1.length; i++){
			numList1.add(Integer.parseInt(s1[i]));
		}
		for(int i=0; i<s2.length; i++){
			numList2.add(Integer.parseInt(s2[i]));
		}

		for(int i=0; i<numList2.size(); i++){
			int sample = numList2.remove(i);

			for(int j=0; j<numList1.size(); j++){
				if(numList1.remove(j)== sample){
					count++;
				}
			}

		}
		System.out.println("Count: "+ count);
		//test
		for(String s : s1){
			System.out.println(s);
		}
		System.out.println("-----");
		for(String s : s2){
			System.out.println(s);
		}
	}
	public static void main(String[] args){
		new Main().start();
	}
}
