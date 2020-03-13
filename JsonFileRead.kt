package jsv
import java.io.File
import org.json.JSONObject;
import org.json.JSONArray;

fun jsonFileRead(sortNumber: Int, sortOrder: Int) {
	val jsonFile = File("C:\\pleiades\\workspace\\KotlinKensyuJson\\TestJson.json")

	var jsonStringData = ""

	jsonFile.forEachLine {
		if (it.isNotBlank()) {
			jsonStringData += it
		}
	}

	val datas_JsonObject = JSONObject(jsonStringData)

	val datas_JsonArray = datas_JsonObject.getJSONArray("datas")

	var mutableStudentList = mutableListOf<Student>()

	var count = 0
	while(count < datas_JsonArray.length()){
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

	sortList(sortNumber, sortOrder, mutableStudentList)
}