package sevendays.StringBuilder;

public class ClassSample01 {
	//可変長文字列
	//StringBufferクラス、およびStringBuilderクラス。2つのちがいは、StringBufferクラスがスレッドセーフ、StringBuilderクラスに比べて処理が低速
	public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Apple ");       //オブジェクトを生成
        sb.append("Banana ");       //  文字列を末尾に追加
        sb.append("Piniapple");     //  文字列を末尾に追加
        System.out.println(sb);     //  内容を表示
    }
}
