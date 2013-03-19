val days = new scala.collection.mutable.LinkedHashMap[String, Int]()
days("Monday") = java.util.Calendar.MONDAY
days("Tuesday") = java.util.Calendar.TUESDAY
days("Wednesday") = java.util.Calendar.WEDNESDAY
days("Thursday") = java.util.Calendar.THURSDAY
days("Friday") = java.util.Calendar.FRIDAY
days("Saturday") = java.util.Calendar.SATURDAY
days("Sunday") = java.util.Calendar.SUNDAY

for ((day, num) <- days) {
	printf("%s = %d\n", day, num)
}
	