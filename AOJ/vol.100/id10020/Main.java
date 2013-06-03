package id10020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	public static void main(String[] args) {
		new Main().count();
	}
	void count() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//文字を整数にして比較する用の変数
		int n;
		//26個の整数要素を持つ配列を作る
		int[] az = new int[26];
		try {
			String str;
			//一行ごとに処理する
			while((str=br.readLine())!=null){
				//１行の文字列の長さ分繰り返す
				for(int i=0; i<str.length(); i++){
					//i番目の文字をchar型として指定して小文字にする
					//'a'を引くことによってアルファベットのaからの文字コード上の相対位置を比較できる
					n = Character.toLowerCase(str.charAt(i)) - 'a';
					//小文字のアルファベットかどうかを判別する
					if(0<=n && n<26){
						//条件に合ったアルファベットに対応する要素の数を１増やす
						az[n]++;
					}
				}
			}
			
			for(int i=0; i<az.length; i++){
				System.out.printf("%c : %d\n",(char)('a'+ i),az[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
