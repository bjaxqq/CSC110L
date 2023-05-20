import scala.io.StdIn._
 
println("Enter a positive integer:")
var num1 = readInt()
println("Enter another positive integer:")
var num2 = readInt()

var power = math.pow(num1,num2)
println(power)

var x = 3;
while (x > 0)
{
    power = math.pow(power,num2)
    println(power)
    x = x - 1
}