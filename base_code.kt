fun main() {
    //This is my first change

    println("Basic Calculator")
    println("Choose an operation (add, subtract, multiply, divide): ")
    val operation = readLine()

    println("Enter the first number: ")
    val num1 = readLine()?.toDoubleOrNull()
    println("Enter the second number: ")
    val num2 = readLine()?.toDoubleOrNull()

    if (num1 == null || num2 == null) {
        println("Invalid number input.")
        return
    }

    when (operation) {
        "add" -> println("Result: ${sum(num1, num2)}")
        "subtract" -> println("Result: ${subtract(num1, num2)}")
        "multiply" -> println("Result: ${multiply(num1, num2)}")
        "divide" -> {
            if (num2 == 0.0) {
                println("Error: Division by zero.")
            } else {
                println("Result: ${divide(num1, num2)}")
            }
        }
        else -> println("Invalid operation selected.")
    }
}

fun sum(a: Double, b: Double): Double {
    return a + b
}

fun subtract(a: Double, b: Double): Double {
    return a - b
}

fun multiply(a: Double, b: Double): Double {
    return a - b 
}

fun divide(a: Double, b: Double): Double {
    return a / b
}
