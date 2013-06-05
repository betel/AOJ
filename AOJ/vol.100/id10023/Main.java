package id10023;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	void shuffle() throws FileNotFoundException{
		BufferedReader br = new BufferedReader(new FileReader("sampleData/id10023D.txt"));
		ArrayList<String> list = new ArrayList<String>();
		String str;
		try {
			while((str=br.readLine())!=null){
				list.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
