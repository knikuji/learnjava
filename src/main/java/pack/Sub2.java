package pack;

import java.util.Scanner;

public class Sub2 {
    public void execute(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("任意の文章を入力していただければ、単語数をカウントします: ");
            String insert = scanner.nextLine();
            if (insert.isEmpty()) {
                System.out.println("文章を入力してください\n");
            } else {
                int wordCount = insert.split("\\s+").length;
                System.out.println("\"" + insert + "\"に含まれる単語数は " + wordCount + " 個になります");
                break;
            }
        }
        scanner.close();
    }
}
