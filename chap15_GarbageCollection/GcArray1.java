package chap15_GarbageCollection;

//配列として確保されたメモリもガーベッジコレクションの対象
public class GcArray1 {
    public static void main(String[] args) {
        while (true) {
            int[] a = new int[1000];    
            for (int i = 0; i < a.length; i++) {
                a[i] = i;
            }
            System.out.println("残りメモリ = " + Runtime.getRuntime().freeMemory());
        }
    }
}
