package sevendays.day4;

//携帯電話クラス
public class CellPhone implements IPhone,IEmail,IComputer{
	//  メールアドレス
	private String mailAddress;
	//  電話番号
	private String number;
	//  コンピュータ
	private String Computer;
	
	//  コンストラクタ（メールアドレスと電話番号を設定
	public CellPhone(String mailAddress,String number){
	    this.mailAddress    = mailAddress;
	    this.number         = number;
	}
	
	public CellPhone() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

//  指定したメールアドレスにメールを送信する
	public void sendMail(String address){
	    System.out.println(address+"に、"+this.mailAddress+"からメールを出します。");
	}
	//  メールを送信する
    public void sendMail(){
        System.out.println("メールを送る");
    }
    //  メールを受信する
    public void recieveMail(){
        System.out.println("メールを受信する");
    }
    //  webを閲覧する
    public void borwseWeb(){
        System.out.println("ウェブを閲覧する");
    }
    //  ゲームをする
    public void playGame(){
        System.out.println("ゲームをする");
    }
    //  指定した番号に電話をかける
	public void call(String number){
	    System.out.println(number+"に、"+this.number+"から電話をかけます。");
	}
    //  電話をかける
    public void callPhone(){
        System.out.println("電話を掛ける");
    }
    //  電話を受ける
    public void recievePhone(){
        System.out.println("電話を受ける");
    }
}
