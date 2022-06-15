package sevendays.String;

public class ClassSample03 {
	public static void main(String[] args) {
		//compareTo()メソッドは、２つの文字列を辞書的に比較するメソッド
        String str1 = "apple";
        String str2 = "orange";
 
        System.out.println(str1.compareTo(str2));   //負の数が返る
        System.out.println(str1.compareTo(str1));   //0が返ります
        System.out.println(str2.compareTo(str1));   //正の数が返る
    }
}
