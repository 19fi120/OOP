package sevendays.day4;

//インターフェース名は、"I"から始まる英単語を用いる
public interface IEmail {
    //  メールを送る
    public void sendMail(String address);
    //  メールを送信する
    public void sendMail();
    //  メールを受信する
    public void recieveMail();
}
