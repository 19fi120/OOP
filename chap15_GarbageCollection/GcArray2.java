package chap15_GarbageCollection;

import java.util.ArrayList;

//ガーベッジになって切れないインスタンス
public class GcArray2 {
    static ArrayList<int[]> list = new ArrayList<int[]>();
    public static void main(String[] args) {
        while (true) {
            int[] a = new int[1000];
            for (int i = 0; i < a.length; i++) {
                a[i] = i;
            }
            list.add(a);
            System.out.println("残りメモリ = " + Runtime.getRuntime().freeMemory());
        }
    }
}
