import scala.io.StdIn._

println("Please input the x-coordinates of the left corner of square 1: ") 
var sx1 = readDouble()

println("Please input the y-coordinates of the left corner of square 1: ")  
var sy1 = readDouble()

println("Please input the side legnth of square 1: ") 
var ss1 = readDouble()

println("Please input the x-coordinates of the left corner of square 2: ") 
var sx2 = readDouble()

println("Please input the y-coordinates of the left corner of square 2: ") 
var sy2 = readDouble()

println("Please input the side legnth of square 2: ") 
var ss2 = readDouble()

var osx1 = sx1 + ss1
var osy1 = sy1 + ss1
var osx2 = sx2 + ss2
var osy2 = sy2 + ss2


if(sx1 <= osx2 && osx1 >= osx2) {
    println("The squares intersect.")
} else if(sx2 <= osx1 && osx2 >= osx1) {
    println("The squares intersect.")
} else if(sy1 <= osy2 && osy1 >= osy2 ) {
    println("The squares intersect.")
} else if(sy2 <= osy1 && osy2 >= osy1 ) {
    println("The squares intersect.")
} else {
    println("The squares don't intersect.")
}