package sevendays.PrintWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClassSample02 {
 
    public static void main(String[] args) {
        PrintWriter pw = null;
        //FileWriterオブジェクトを生成する際にIOExceptionがスローされる可能性がある
        try {
            //PrintWriterクラスでラップしてコマンドライン引数でファイルを指定
            pw = new PrintWriter(new BufferedWriter(new FileWriter("test2.txt")));
            /*
             *  自動的にflush()を行うPrintWriterオブジェクトの生成例
				pw = new PrintWriter(new BufferedWriter(new FileWriter("test.txt")),true);
				ファイルに書き込まれてもメモリー上に残ってしまう
				必ずclose()メソッドの記述を忘れない
             */
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw.println("Line1");
        pw.println("Line2");
        pw.flush();             //  フラッシュ処理
        System.out.println("Data Writing Finished.");
        //pw.close();
    }
 
}