package sevendays.String;

public class ClassSample02 {
	//文字列の一部を切りぬくsubstringメソッド
	public static void main(String[] args) {
        String str1 = "ABCDEFGHIJKLMNOP";
        System.out.println(str1.substring(3,8));    //「DEFGH」が出力される
        System.out.println(str1.substring(3));      //「DEFGHIJKLMNOP」が出力される
 
    }
}
