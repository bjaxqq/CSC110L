import scala.io.StdIn._

println("Please input x-cords of center of circle 1: ") 
var circ1x = readDouble()
println("Please input y-cords of center of circle 1: ") 
var circ1y = readDouble()
println("Please input radius of center of circle 1: ") 
var circ1rad = readDouble()
println("Please input x-cords of center of circle 2: ") 
var circ2x = readDouble()
println("Please input y-cords of center of circle 2: ") 
var circ2y = readDouble()
println("Please input radius of center of circle 2: ") 
var circ2rad = readDouble()

var xdist = circ1x + circ2x
var ydist = circ1y + circ2y

var xdistsq = xdist * xdist
var ydistsq = ydist * ydist

var sumdist = xdistsq + ydistsq
var distance = Math.sqrt(sumdist)
var radsum = circ1rad + circ2rad

if(radsum == sumdist){
    println("They meet at one point")
} else if(radsum < sumdist) {
    println("They meet at 2 points")
} else {
    println("They dont intersect")
}