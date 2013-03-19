import scala.collection.JavaConversions.propertiesAsScalaMap

val props: scala.collection.Map[String, String] = java.lang.System.getProperties()
val maxPropNameLength = props.keys.map(_.length).max

for ((name, value) <- props) {
	printf("%-"+ (maxPropNameLength + 1) +"s| %s\n", name, value);
}

