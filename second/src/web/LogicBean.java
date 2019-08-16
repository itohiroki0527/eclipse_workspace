package web;

import java.io.Serializable;

public class LogicBean implements Serializable{
//① execute()メソッドを定義。引数は、String name,int year,int month,int dateと定義
	public ResultBean execute(String name,int year,int month,int date) {

		//nameの文字数をlenに代入
		int len = name.length();
		/* 	・金運　　＝　「文字数」×「年」×「月」×「日」を５で割った余り＋１
			・恋愛運　＝　（「文字数」＋「年」）×「月」×「日」を５で割った余り＋１
			・仕事運　＝　（「文字数」＋「年」＋「月」）×「日」を５で割った余り＋１
			・健康運　＝　「文字数」＋「年」＋「月」＋「日」を５で割った余り＋１
			・全体運　＝　上記４つの平均値（小数点以下切捨て） */
		int money_luck = (len*year*month*date)%5+1;
		int love_luck =  ((len+year)*month*date)%5+1;
		int work_luck =  ((len+year+month)*date)%5+1;
		int health_luck =  ((len+year)*month*date)%5+1;
		int total_luck =  (money_luck+love_luck+work_luck+health_luck)/4;
		// ResultBeanのインスタンスを作成
		ResultBean rb =new ResultBean() ;
		String[] ster = {"★","★","★★","★★★","★★★★","★★★★★"};

		/*計算結果を
		 *  ・金運　＝　rd.setMoney()メソッドで格納
			・恋愛運　＝　rd.setLove()メソッドで格納
			・仕事運　＝　rd.setWork()メソッドで格納
			・健康運　＝　rd.setHealth()メソッドで格納
			・全体運　＝　rd.setTotal()メソッドで格納
		*/
		rb.setMoney(ster[money_luck]);
		rb.setLove(ster[love_luck]);
		rb.setWork(ster[work_luck]);
		rb.setHealth(ster[health_luck]);
		rb.setTotal(ster[total_luck]);

		System.out.println(ster[money_luck]);

		return rb;
	}

}
/*
 *
 */
/*
 * 、戻り値は、ResultBean型


④ ResultBeanのインスタンスを作成し、それぞれの運勢の数値を「★」の文字列
　　に変えてプロパティに格納（金運＝４なら、「★★★★」という文字列を格納）
・金運　＝　setMoney()メソッドで格納
・恋愛運　＝　setLove()メソッドで格納
・仕事運　＝　setWork()メソッドで格納
・健康運　＝　setHealth()メソッドで格納
・全体運　＝　setTotal()メソッドで格納
⑤ インスタンスをreturnで戻り値に指定
 */