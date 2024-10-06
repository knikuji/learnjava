package pack;
//レベル5: クラスとオブジェクト指向の基礎
//課題5: シンプルな図書管理システム
//内容: 書籍を表すBookクラスを作成し、タイトル、著者、ISBNを属性として持たせます。複数のBookオブジェクトをリストで管理し、それらを一覧表示するプログラムを作成してください。
//目的: クラスの定義、オブジェクトの生成と操作、リストの活用方法を学ぶ。

import java.util.ArrayList;

public class Sub3 {
    public void execute(){

        class Book{
            private String title;
            private String author;
            private String isbn;

            public Book(String title, String author, String isbn) {
                this.title = title;
                this.author = author;
                this.isbn = isbn;
            }
            public String getTitle(){
                return title;
            }
            public String getAuthor(){
                return author;
            }
            public String getIsbn(){
                return isbn;
            }
        }
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("吾輩は猫である", "夏目漱石", "1234567890"));
        bookList.add(new Book("走れメロス", "太宰治", "0987654321"));
        bookList.add(new Book("銀河鉄道の夜", "宮沢賢治", "1122334455"));

        for (Book book : bookList) {
            System.out.println("タイトル: " + book.getTitle());
            System.out.println("著者: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("-------------------------");
        }
    }
}

