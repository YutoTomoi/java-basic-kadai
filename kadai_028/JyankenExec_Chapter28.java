package kadai_028;

public class JyankenExec_Chapter28 {
    public static void main(String[] args) {
        Jyanken_Chapter28 game = new Jyanken_Chapter28();

        String myHand = game.getMyChoice();         // 入力：p と入力
        String rivalHand = "r";                     // 相手の手を固定（グー）

        game.playGame(myHand, rivalHand);           // 勝敗表示
    }
}
