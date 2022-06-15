package sevendays.Wrap_Buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassSample02 {
 
	/*
	 * ラッパークラスの生成①：newを用いる方法
		Integer i1 = new Integer(10); //int型をコンストラクターの引数にとる
		Integer i2 = new Integer("10"); //Stringで表されたint型を引数にとる
		
		ラッパークラスの生成②：valueOfメソッドを利用する方法
		Double d1 = Double.valueOf(3.14);　　　 //double型を引数に
		Double d2 = Double.valueOf("3.14"); //Stringで表されるdouble型を引数に
		
		文字列を基本データ型へ変換するstaticなメソッドです。以下のように使用します。
		parseメソッド
		int i = Integer.parseInt("10");
		double d = Double.parseDouble("10.0");
		
		Value()メソッドを利用する方法
		Integer i = new Integer(14); //Integerオブジェクトを生成
		double d = i.doubleValue(); //double型に変換
		System.out.print(d); //"14.0"と出力される
		
		ボクシング変換(データ型とラッパークラスの交換)
		基本データ型からラッパークラスへ自動的に変換するAutoboxing
		Autoboxingの例
		int i1 = 5;
		Integer i2 = i1;　　　　　 //int型の値をIntegerへ（Autoboxing）
		
		ラッパークラスから基本データ型へ自動変換する、Unboxing
		Integer i1 = new Integer(10); //int型をコンストラクターの引数にとる
		int i2 = i1; //Integerを、int型へ(Unboxing)
		
		Integer i = new Integer("5"); //ラッパークラスのオブジェクトを生成
		i++;　　　　　　　　　　　　　　　 //インクリメント
		System.out.print("i = " + i); //"i = 6とが出力される
	 */
    public static void main(String[] args) {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            while(true){
                String s;
                System.out.print("InputData（q : finish） ： ");
                s = br.readLine();
                //  qが入力されたら終わり
                if(s.equals("q")){
                    break;
                }
                System.out.println("Input Data:" + s);
                System.out.println();
            }
        }catch(IOException e2){
            System.out.println("IOエラー");
        }finally{
            try{
                if(br != null) br.close();
            }catch(IOException e){
                System.out.println("IOエラー");
            }
        }
    }
 
}