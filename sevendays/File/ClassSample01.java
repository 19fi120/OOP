package sevendays.File;

import java.io.File;
import java.io.IOException;

//ファイルの生成・存在の確認
public class ClassSample01 {
    public static void main(String[] args){
        try{
            File file = new File("c:¥¥test¥¥filesample.txt");   // Fileクラスのインスタンスを作成
            System.out.println(file.exists());                  // ファイルの有無を調べる
            System.out.println(file.createNewFile());           // ファイルの生成 成功したらtrue
        }catch(IOException e){
            System.out.println("処理に失敗しました。");
        }
    }
 
}