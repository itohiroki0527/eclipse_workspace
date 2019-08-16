package first;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Dentaku2 {

  public static void main(String[] args) {


 try {
    //スキャナークラスを使用する定義部
    Scanner sc = new Scanner(System.in);

    System.out.println("ログイン認証");
    System.out.println("数値を入力してください。");

    //ログイン認証を行うための変数strを定義
    //変数の値はコンソールから入力された値
    int str = sc.nextInt();


    //コンソールから入力された値とパスワードが一致しているかのロジック
    if(str==1111) {
        //TRUEの場合は以下ロジックを実行
        System.out.println("パスワードを認証しました");

    //計算1つ目の変数をnum1としてコンソールから入力された値を格納
    System.out.println("計算値を入力してください。(1)");
    int num1 = sc.nextInt();

    //計算2つ目の変数をnum1としてコンソールから入力された値を格納
    System.out.println("計算値を入力してください。(2)");
    int num2 = sc.nextInt();

    //演算子を入力する
    System.out.println("演算子を入力してください。+ - * /");
    String ope =sc.next();

    //入力された演算子によって計算式を変える
    //該当する箇所の計算結果が実行される。
    if(ope.equals("+")) {
        System.out.println((num1+num2));
    }else if(ope.equals("-")) {
        System.out.println((num1-num2));
    }else if(ope.equals("*")) {
        System.out.println((num1*num2));
    }else if(ope.equals("/")) {
        System.out.println((num1/num2));

    }else{
        //演算子が間違えている場合は下記メッセージを出力
          System.out.println("Usage : java dentaku 数値 演算子 数値");
          System.out.println("演算子は + - * / の4つです");
          System.exit(0);  //プログラムを終了する
    }

    //計算式を出力
    System.out.println("入力された式は " + num1 + " " + ope + " " + num2 + " です");

    }else {
        //ログインパスワードが違う場合は以下メッセージ出力
        System.out.println("パスワードが違います。");
    }
    //コンソールに入力した値が不正な場合
    }catch(InputMismatchException e){
        System.out.println("適切な値を入力してください。もう一度実行してください。");
    }

  }
}

