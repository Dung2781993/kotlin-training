fun main() {
    fun getGreeting(greeting: String = "Hello", thingToGreet: String = "World") = "$greeting $thingToGreet";

    println(getGreeting(thingToGreet = "Mama"));
}