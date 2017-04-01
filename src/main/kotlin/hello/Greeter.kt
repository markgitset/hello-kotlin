package hello

class Greeter(val format: (String) -> String) {

    fun greeting(name: String) = format(name)

    fun greet(name: String) {
        println(greeting(name))
    }
}