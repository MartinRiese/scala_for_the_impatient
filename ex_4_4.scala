var wordCounter = new scala.collection.immutable.TreeMap[String, Int]

val in = new java.util.Scanner(new java.io.File("paragraphs.txt"))
while (in.hasNext()) {
	val word = in.next()
	val count = wordCounter.getOrElse(word, 0)
	wordCounter += (word -> (count+1))
}
for ((word, count) <- wordCounter) {
	printf("%s: %d\n", word, count)
}