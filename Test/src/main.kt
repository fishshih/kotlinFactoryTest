fun main(args: Array<String>) {

    // MARK: - Property

    val x = 1



    println("value = $x")
    println("${sayHello()} world!")

    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("else")
        }
    }



}

fun sayHello(): String {

    return "Hello~"

}


