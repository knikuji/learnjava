package pack;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Sub {
    public void execute() {
        int collect = (int)Math.ceil(Math.random() * 100);
        int insert = 0;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("数字を入力してください（1〜100）：");
            try {
                insert = scanner.nextInt();

                if(insert < 1 || insert > 100) {
                    System.out.println("1から100の間の数字を入力してください。");
                    continue;
                }

                if(insert < collect){
                    System.out.println("もっと大きい数です。");
                } else if(insert > collect){
                    System.out.println("もっと小さい数です。");
                } else {
                    System.out.println("正解です！");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("整数を入力してください。");
                scanner.next(); // 入力バッファをクリア
            }
        }
        scanner.close();
    }
}
