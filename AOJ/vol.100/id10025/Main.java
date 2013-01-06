package id10025;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	ArrayList<String> list;
	ArrayList<String[]> strList;

	public Main(){	//コンストラクタ
		list = new ArrayList<String>();
		strList = new ArrayList<String[]>();
		init();
	}
	//
	public void start(){
		for(int i=0; i<strList.size(); i++){
			String[] str = strList.get(i);
			double a = Double.parseDouble(str[0]);
			double b = Double.parseDouble(str[1]);
			double c = Double.parseDouble(str[2]);

			System.out.println(calcS(a,b,c));
			System.out.println(calcL(a,b,c));
			System.out.println(calcH(a,b,c));
		}
	}
	//初期化
	public void init(){
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("sampleData/id10025D.txt"));
			String str;
			while((str=br.readLine())!=null){	//1行毎にlistに追加
				list.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i=0; i<list.size(); i++){		//1行を空白で分けて作成した配列をすべてstrListに入れる
			strList.add(list.get(i).split(" "));
		}
	}
	//計算
	public double calcS(double a, double b, double c){
		return	1/2 * a * b * Math.sin(c);
	}
	public double calcL(double a, double b, double c){
		double cc		= a*a + b*b -2*a*b*Math.cos(c);
		double sideC 	= Math.sqrt(cc);
		return	a + b + sideC;
	}
	public double calcH(double a, double b, double c){
		double s	= calcS(a,b,c);
		return	2*s / a;
	}
	//実行
	public static void main(String[] args){
		Main main = new Main();
		main.start();
	}
}
