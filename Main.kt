fun main()
{
//    Soal 1
    print("Number: ")
    val number = Integer.valueOf(readln())
    print("Divisor: ")
    val divisor = Integer.valueOf(readln())
    val answer = divideIfWhole(number, divisor)
    if (answer != null)
    {
        println("Yep, it divides $answer times")
    }
    else
    {
        println("Not divisible :[")
    }
    val answer2 = divideIfWhole(number, divisor) ?: 0
    println("It divides $answer2 times")

//    Soal 2
    val state = mapOf("NY" to "New York", "CA" to "California", "IL" to "Illinois", "TX" to "Texas", "GA" to "Georgia", "DC" to "District of Columbia", "PA" to "Pennsylvania", "FL" to "Florida", "AZ" to "Arizona", "MA" to "Massachusetts", "MI" to "Michigan", "WA" to "Washington", "MN" to "Minnesota", "CO" to "Colorado", "MD" to "Maryland")
    printLongStateNames(state)

//    Soal 3
    val answer3 = factorial(5)
    println("Factorial of 5 is $answer3")
}

fun divideIfWhole(number: Int, divisor: Int): Int?
{
    return if (number % divisor == 0)
    {
        number / divisor
    }
    else
    {
        null
    }
}

fun printLongStateNames(state: Map<String, String>)
{
    for ((_, name) in state)
    {
        if (name.length > 8)
        {
            println(name)
        }
    }
}

val factorial: (Int) -> Int = { n ->
    var answer = 1
    for (i in 1..n)
    {
        answer *= i
    }
    answer
}