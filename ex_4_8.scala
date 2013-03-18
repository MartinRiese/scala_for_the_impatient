def minmax(values: Array[Int]) = {
	val min = values.min
	val max = values.max
	(min, max)
}

val a = Array(1,2,2,3,2,12,12,23,4)
val (min, max) = minmax(a)

println("Array: " + a.mkString(", "))
println("Min: " + min)
println("Max: " + max)