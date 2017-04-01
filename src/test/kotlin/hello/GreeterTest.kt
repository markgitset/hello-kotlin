package hello

import org.junit.Test
import org.junit.Assert.*

class GreeterTest {

    @Test fun testAppHasAGreeting() {
        val greeter = Greeter({ "Howdy, $it!!!" })
        assertEquals("Howdy, Mark!!!", greeter.greeting("Mark"))
    }
}
