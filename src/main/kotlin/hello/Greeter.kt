package hello

/**
 * Builds greetings
 *
 * @param format a function that given a name, produces a greeting
 */
class Greeter(val format: (String) -> String) {

    fun greeting(name: String) = format(name)

    fun greet(name: String) {
        println(greeting(name))
    }
}