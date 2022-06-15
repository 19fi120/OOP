package sevendays.day4;

public class SampleClassEx401 {
	public static void main(String[] args) {
        //  携帯電話クラスのインスタンスを生成
        CellPhone cp = new CellPhone("hoge@email.com","090-1234-5678");
        //  携帯電話クラスで、電話とメールを送る
        cp.call("011-123-4567");
        cp.sendMail("fuga@email.com");
        
        //CellPhoneクラスは、IPhone、および、IEmailという、架空の「クラス」としてふるまうことができる
        //  電話インターフェースでインスタンスにアクセス。
        IPhone phone = (IPhone)cp;
        phone.call("011-987-6543");     //  電話をかける
        //  phone.sendMail("foo@email.com");        //  メールの送信メソッドは利用できない。
        //  メールインターフェースでインスタンスにアクセス。
        IEmail mail = (IEmail)cp;
        mail.sendMail("bar@email.com"); //  メールを出す
        //mail.call("011-222-3333");        //  mailインターフェースでは、電話の機能を利用できない。
 
    }
}
