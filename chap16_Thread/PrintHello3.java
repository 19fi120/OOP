package chap16_Thread;

class LabelPrinter extends Thread {
    String label = "no label";
    LabelPrinter(String label) {
        this.label = label;
    }
    @Override
    public void run() {
        while (true) {
            System.out.println(label);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class PrintHello3 {
    public static void main(String[] args) {
        new LabelPrinter("���͂悤�I").start();
        new LabelPrinter("����ɂ��́I").start();
        new LabelPrinter("����΂�́I").start();
    }
}
