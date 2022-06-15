package chap15_GarbageCollection;

//残りメモリはだんだん減って突然増えることがわかる。ここでガーべッジコレクションが起こる
public class GcTest1 {
    public static void main(String[] args) {
        while (true) {
            String s = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            System.out.println("残りメモリ = " + Runtime.getRuntime().freeMemory());
        }
    }
}

/* インスタンスの生成と参照
 * Something obj = new Something();
 * objはインスタンスではなく、場所のアドレスを保持
 * 
 * ガーべッジコレクション(garbage collection):誰からも参照されていないインスタンスを集めたもの
 * */
