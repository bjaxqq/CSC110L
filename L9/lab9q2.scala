import scala.io.StdIn._

println("Enter the value of a dice roll:")
var userValue = readInt()

while(userValue > 6 || userValue < 1) {
    println(userValue + " is not legal. Enter another value:")
    userValue = readInt()
}
println(userValue + " END!")