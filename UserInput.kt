package jsv

import kotlin.system.exitProcess
/**  
 *  UserInputクラスです。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/18
 *  数値の入力を受け付ける関数です。
 *  ユーザからの入力を受け付ける際はNull許容型変数になってしまうため、
 *  Nullチェックを施した上で非Null型の変数へと整形しています。
 */
fun input_number(sort : Int): Int{
	// readLineでユーザからの入力を受け付けています。
	// 戻り値はString?なのでNullチェックをしてからでないとInt型には直せません。
	var  inputNumber = readLine()
	var return_Number :Int

	// toIntOrNullはString?値を評価してIntにできるならそのIntを、そうでないならNullを返します。
	// なのでelse節にはnullが入ります。
	when(inputNumber?.toIntOrNull()){
		is Int -> 	{
			return_Number = inputNumber.toInt()
			if(return_Number <0 || sort < return_Number ) {
				println("エラー: 不正な値です")
				exitProcess(0)
			}
			return return_Number
		}
		else -> {
			println("エラー: 不正な値です")
			exitProcess(0)
		}
	}
}