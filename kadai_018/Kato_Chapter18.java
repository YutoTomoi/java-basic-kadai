package kadai_018;

public abstract class Kato_Chapter18 {

    public String familyName = "加藤";
    public String givenName;
    public String address = "東京都中野区〇×";

    // 共通の紹介
    public void commonIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address + "です");
    }

    // 抽象メソッド（子で実装）
    public abstract void eachIntroduce();

    // 紹介実行メソッド
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
        System.out.println(); // 改行
    }
}
