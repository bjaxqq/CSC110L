import scala.io.StdIn._

println("Please insert the number of gallons (in ounces):")
var numGal = readInt()
println("Please insert the number of ounces:")
var numOun = readInt()

var numLit = (numGal + numOun) / 33.814

println("The container can hold " + numLit + " liters.")