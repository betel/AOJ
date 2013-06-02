package id10015;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * S:0 H:1 C:2 D:3
 */

public class Main {
	static final int SUIT = 4;
	static final int RANK = 13;
	static final String[]	SS = {"S","H","C","D"};
	static final int[] 		NS = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	boolean[][] cards = new boolean[SUIT][RANK];
	ArrayList<String> list = new ArrayList<String>();
	
	public void search() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader("sampleData/id10015D.txt"));
		String str;
		
		try {
			while((str=br.readLine())!=null){
				list.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i=1; i<list.size(); i++){
			String[] s	= list.get(i).split(" ");
			int suit =0;
			if(s[0].equals("S")) suit = 0;
			if(s[0].equals("H")) suit = 1;
			if(s[0].equals("C")) suit = 2;
			if(s[0].equals("D")) suit = 3;
			int rank	= Integer.parseInt(s[1]);
			cards[suit][rank-1] = true;
		}
		
		for(int i=0; i<SUIT; i++){
			for(int j=0; j<RANK; j++){
				if(cards[i][j]==false){
					System.out.println(SS[i] + " " + NS[j]);
				}
			}
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		new Main().search();
	}
}
