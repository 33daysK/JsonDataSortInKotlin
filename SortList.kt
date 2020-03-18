package jsv
/**  
 *  sortListクラスです。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/18
 *  引き渡されてきたリストをソートしてソート済みのリストを返却します。
 *  ソートの項目名は以下の通りです。
 *  sortNumber = 0:number 1:kurasu  2:age  3:score
 *  sortOrder  = 0:昇順   1:降順
 *
 *  todo: もっとスマートな書き方に直せるなら直したい
 */
fun sortList(sortNumber: Int, sortOrder: Int, sortList_before: MutableList<Student>){
	// true = 昇順 、false = 降順 のBoolean変数
	val sort_in_ascending_order = (sortOrder == 0)

	// sortNumberでまず場合わけして、その後sort_in_ascending_orderでさらに場合わけしています。
	when(sortNumber){
		0 -> {
			if(sort_in_ascending_order){
				var sortedList = sortList_before.sortedBy{ it.number }
				val fileName = "番号昇順.json"
				jsonFileWrite(fileName,sortedList)
			}else{
				var sortedList = sortList_before.sortedByDescending{ it.number }
				val fileName = "番号降順.json"
				jsonFileWrite(fileName,sortedList)
			}
		}

		1 -> {
			if(sort_in_ascending_order){
				var sortedList = sortList_before.sortedBy{ it.kurasu }
				val fileName = "クラス昇順.json"
				jsonFileWrite(fileName,sortedList)
			}else{
				var sortedList = sortList_before.sortedByDescending{ it.kurasu }
				val fileName = "クラス降順.json"
				jsonFileWrite(fileName,sortedList)
			}
		}

		2 -> {
			if(sort_in_ascending_order){
				var sortedList = sortList_before.sortedBy{ it.age }
				val fileName = "年齢昇順.json"
				jsonFileWrite(fileName,sortedList)
			}else{
				var sortedList = sortList_before.sortedByDescending{ it.age }
				val fileName = "年齢降順.json"
				jsonFileWrite(fileName,sortedList)
			}
		}

		3 -> {
			if(sort_in_ascending_order){
				var sortedList = sortList_before.sortedBy{ it.score }
				val fileName = "点数昇順.json"
				jsonFileWrite(fileName,sortedList)

			}else{
				var sortedList = sortList_before.sortedByDescending{ it.score }
				val fileName = "点数降順.json"
				jsonFileWrite(fileName,sortedList)
			}
		}
		else -> {
			println("予期せぬエラーが発生しました")
		}
	}
}