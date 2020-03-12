package jsv

import kotlin.system.exitProcess


fun stringToInt(stringLikeInt : String):Int{
	var return_Int : Int
		when(stringLikeInt.toIntOrNull()){
		is Int -> 	{
			return_Int = stringLikeInt.toInt()
			return return_Int
		}
		else -> {
			println("エラー: 不正な値です")
			exitProcess(0)
		}
	}
}
