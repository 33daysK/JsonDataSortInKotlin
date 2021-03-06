package jsv
import java.io.File
import org.json.JSONObject;
import org.json.JSONArray;
/**  
 *  JsonFileReadクラスです。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/18
 *  Jsonファイルを読み込んでStudentのリストにします。
 *  その後そのリストとユーザが選んだソート方法をsortList()に渡します。
 */
fun jsonFileRead(sortNumber: Int, sortOrder: Int) {
	val jsonFile = File("TestJson.json")

	// まずJsonファイルをString型に変更します。
	// KotlinはデフォルトでStringBuilderを使用しているためこれでも十分に早いはずです。
	var jsonStringData = ""
	jsonFile.forEachLine {
		if (it.isNotBlank()) {
			jsonStringData += it
		}
	} 
	// Stringを読み取ってJSONObjectの形にします。
	val datas_JsonObject = JSONObject(jsonStringData)

	// JSONObjectの中身をさらに読み取ってJsonArrayの形にします。
	val datas_JsonArray = datas_JsonObject.getJSONArray("datas")

	// Listを用意します。
	var mutableStudentList = mutableListOf<Student>()

	var count = 0
	while(count < datas_JsonArray.length()){

		// JsonArrayの中身を0番から順に取り出して、Student型のリストに格納しています。
		val student_JsonObject = datas_JsonArray.getJSONObject(count)
		val oneStudent = Student(
			student_JsonObject.getString("number"),
			student_JsonObject.getString("name"),
			student_JsonObject.getString("kurasu"),
			student_JsonObject.getInt("age"),
			student_JsonObject.getInt("score")
			)
		mutableStudentList.add(oneStudent)

		count++
	}
	// sortList関数はこの引き渡されたデータをもとに場合わけとソートを行います。
	sortList(sortNumber, sortOrder, mutableStudentList)
}