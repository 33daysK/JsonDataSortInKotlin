package jsv
/*
 * スクリーンに表示するときの整形用の関数です。
 * ${}内で計算しているのは日本語の文字が混ざると表記が崩れるのを補正しています。
 *
 */
fun printScreen(sorted_studentList: List<Student>){
	println("%3s%8s%21s%4s%3s".format("番号","名前","クラス","年齢","点数"))
	sorted_studentList.forEach{
		println("%-8s%-${25-it.name.length}s%5s%6d%5d".format(it.number,it.name,it.kurasu,it.age,it.score))}
}
