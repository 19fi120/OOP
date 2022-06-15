package chap16_Thread;

public class OneBank {
    // 預金残高
    private static int value = 0;
    // 預け入れ・引き出し
    public static synchronized void addMoney(int money) {
        int currentValue = value;
        System.out.println(Thread.currentThread() + "が addMoney に入りました");
        value += money;
        if (currentValue + money != value) {
            System.out.println(Thread.currentThread() + "で矛盾が生じました");
            System.exit(-1);
        }
        System.out.println(Thread.currentThread() + "が addMoney から出ました");
    }
}
