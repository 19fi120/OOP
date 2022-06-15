package sevendays.File;

import java.io.File;

//ファイル・フォルダの一覧の取得
public class ClassSample02 {
	public static void main(String[] args){
        File fi = new File("c:¥¥test");
        File[] fiList = fi.listFiles();	//listFiles(): そこにあるファイルおよびフォルダの一覧を、Fileクラスのインスタンスの配列として取得
        System.out.println("指定したディレクトリは、" + fi.getAbsolutePath() + "です。");	//getAbsolutePath(): 絶対パスを得る
        for(int i = 0; i < fiList.length; i++){
            if(fiList[i].isFile() == true){	//isFile(): あるかないか
                System.out.println("ファイル名は、" + fiList[i].getName() + "です。");
            }else if(fiList[i].isDirectory() == true){	//isDirectory(): あるかないか
                System.out.println("ディレクトリ名は、" + fiList[i].getName() + "です。");
            }
        }
 
    }
}
