def lteqgt(values: Array[Int], v: Int) = {
	var lt, eq, gt = 0
	for(i <- values) {
		if (i < v) {
			lt += 1
		} else if (i == v) {
			eq += 1
		} else {
			gt += 1
		}	
	}
	(lt, eq, gt)
}

val a = Array(1,2,2,3,2,12,12,23,4)
println(lteqgt(a, 12))