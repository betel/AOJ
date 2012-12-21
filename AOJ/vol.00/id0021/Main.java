package id0021;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		String lineStr;
		double ex1,ey1,ex2,ey2;
		ArrayList<String> list = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
		while((lineStr=sc.nextLine())!=null){
			list.add(lineStr);
		}
		sc.close();

		int size = list.size();
		double[] num	= new double[size];
		String[] s		= new String[size];
		for(int i=1; i<size; i++){
			s = list.get(i).split(" ");

			for(int j=0; j<s.length; j++){
				num[j] = Double.parseDouble(s[j]);
			}

			ex1 = num[0]-num[2];
			ey1 = num[1]-num[3];
			ex2 = num[4]-num[6];
			ey2 = num[5]-num[7];

			System.out.println(isParallel(ex1,ey1,ex2,ey2));
		}
	}

	public static boolean isParallel(double ex1,double ey1,double ex2,double ey2){
			//2つのベクトルが平行である条件
	}
}
