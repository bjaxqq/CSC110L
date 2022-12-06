import scala.io.StdIn._

println("Welcome to the Scala Calculator!")
println("--------------------------------")
println("Here are your options: ")
println("+ (addition)")
println("- (subtraction)")
println("* (multiplication)")
println("/ (division)")
println("% (modulus ")
println("i (increment)")
println("| (absoulute value)")
println("^ (exponent)")
println
println("Please select a choice:")
var c = readChar()

if(c == '+') {
    println("Please enter 2 numbers:")
    var num1 = readInt()
    var num2 = readInt()
    println(add(num1,num2))
} else if(c == '-') {
    println("Please enter 2 numbers:")
    var num1 = readInt()
    var num2 = readInt()
    println(sub(num1,num2))
} else if(c == '*') {
    println("Please enter 2 numbers:")
    var num1 = readInt()
    var num2 = readInt()
    println(mult(num1,num2))
} else if(c == '/') {
    println("Please enter 2 numbers:")
    var num1 = readInt()
    var num2 = readInt()
    if (num2 == '0'){
        println("Error: Cannot divide by zero.")
    } else {
        println(div(num1,num2))
    }
} else if(c == '%') {
    println("Please enter 2 numbers:")
    var num1 = readInt()
    var num2 = readInt()
    println(mod(num1,num2))
} else if(c == 'i') {
    println("Please enter 1 number:")
    var num1 = readInt
    println(inc(num1))
} else if(c == '|') {
    println("Please enter 1 number:")
    var num1 = readInt()
    println(abs(num1))
} else if(c == '^') {
    println("Please enter 2 numbers:")
    var num1 = readDouble()
    var num2 = readDouble()
    println(pow(num1,num2))
} else {
    println("Please select a choice:")
}

def add(num1:Int , num2:Int):Int = {
    return num1 + num2
}
def sub(num1:Int , num2:Int):Int = {
    return num1 - num2
}
def mult(num1:Int , num2:Int):Int = {
    return num1 * num2
}
def div(num1:Int , num2:Int):Int = {
    return num1 / num2
}
def mod(num1:Int , num2:Int):Int = {
    return num1 - num2 * (num1/num2)
}
def inc(num1:Int):Int = {
    return num1 + 1
}
def abs(num1:Int):Int = {
    if(num1 >= 0){
        return num1
    } else {
        return num1 * -1
    }
    return num1
}
def pow(num1:Double , num2:Double):Double = {
    return math.pow(num1,num2)
}