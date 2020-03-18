package jsv
/**  
 *  StudentのDataクラスです。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/18
 *  getterとsetterはKotlin標準のものを使用しています。
 *  toStringのみ上書きしているので既存のものとは違うため注意してください。
 */
data class Student(
	val number: String = "",
	val name:   String = "",
	val kurasu: String = "",
	val age:    Int    = 0,
	val score:  Int    = 0)
{
	override fun toString(): String {
        return "$number,$name,$kurasu,$age,$score"
    }
}
