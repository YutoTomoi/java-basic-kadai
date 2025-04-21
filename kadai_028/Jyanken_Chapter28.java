package kadai_028;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    private Scanner scanner = new Scanner(System.in); // フィールドで保持

    public String getMyChoice() {
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String input = scanner.nextLine();

        return input;
    }

    public String getRandom() {
        String[] hands = { "r", "s", "p" };
        int index = (int) Math.floor(Math.random() * 3);
        return hands[index];
    }

    public void playGame(String myHand, String rivalHand) {
        Map<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        System.out.println("自分の手は" + handMap.get(myHand) + ",対戦相手の手は" + handMap.get(rivalHand));

        if (myHand.equals(rivalHand)) {
            System.out.println("あいこです");
        } else if (
            (myHand.equals("r") && rivalHand.equals("s")) ||
            (myHand.equals("s") && rivalHand.equals("p")) ||
            (myHand.equals("p") && rivalHand.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
