package jsv

import kotlin.system.exitProcess

fun option(option_item : String){
	when(option_item){
		"-help" -> println("アプリケーション「XXXX」は、JSON形式のファイル内の情報を入力キーを元に並べ替えて結果を表示します。")
		else -> exitProcess(0)
	}
}