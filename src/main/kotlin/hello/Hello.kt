package hello

fun main(args: Array<String>) {

    // determine the list of names to greet
    val names = if (args.isNotEmpty()) args else arrayOf("World")

    // instantiate a greeter with a greeting formatter function
    val g = Greeter({ "Hello, $it!"})

    // greet everyone
    names.forEach { g.greet(it) }
}
