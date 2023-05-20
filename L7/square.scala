import scala.io.StdIn._

// Get user inputs
println("Please input x-cords of left corner of square 1: ") 
var square1x = readDouble()
println("Please input y-cords of left corner of square 1: ") 
var square1y = readDouble()
println("Please input side legnth ofsquare 1: ") 
var squareSide1 = readDouble()
println("Please input x-cords of left corner of square 2: ") 
var square2x = readDouble()
println("Please input y-cords of left corner of square 2: ") 
var square2y = readDouble()
println("Please input side legnth of square 2: ") 
var squareSide2 = readDouble()

// Find opposite corner
var opSquare1x = square1x + squareSide1
var opSquare1y = square1y + squareSide1
var opSquare2x = square2x + squareSide2
var opSquare2y = square2y + squareSide2

if((square1x <= opSquare2x && square1x >= opSquare2x) || (square2x <= opSquare1x && square2x >= opSquare1x) && (square1y <= opSquare2y && square1y >= opSquare2y) || (square2y <= opSquare1y && square2y >= opSquare1y)){
    println("The Squares intersect")
} else {
    println("The squares dont intersect")
}