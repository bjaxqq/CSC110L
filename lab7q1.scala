import scala.io.StdIn._

println("Please input the x-coordinates of the center of circle 1: ") 
var cx1 = readDouble()

println("Please input y-coordinates of the center of circle 1: ") 
var cy1 = readDouble()

println("Please input the radius of the center of circle 1: ") 
var cr1 = readDouble()

println("Please input the x-coordinates of the center of circle 2: ") 
var cx2 = readDouble()

println("Please input the y-coordinates of the center of circle 2: ") 
var cy2 = readDouble()

println("Please input the radius of the center of circle 2: ") 
var cr2 = readDouble()

var xDist = cx1 + cx2
var yDist = cy1 + cy2

var xqDist = xDist * xDist
var yqDist = yDist * yDist
var sumDist = xqDist + yqDist

var dist = Math.sqrt(sumDist)
var sumRad = cr1 + cr2

if(sumRad == sumDist) {
    println("They meet at one point.")
} else if(sumRad < sumDist) {
    println("They meet at 2 points.")
} else {
    println("They don't intersect.")
}