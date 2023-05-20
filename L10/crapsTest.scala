import scala.io.StdIn._

println("How many times would you like to run the function?")
var plays = readInt()
var totalWins = 0
println(initialGame(plays, totalWins))
    
def initialGame(playsLeft:Int, totalWins:Int):Unit = {
    if(playsLeft != 0) {
        var roll1 = (6*math.random).toInt + 1
        var roll2 = (6*math.random).toInt + 1
        var sum = roll1 + roll2
        var winOrLose:Boolean = true

        if(sum == 2 || sum == 3 || sum == 12) {
            winOrLose = false
        } else if(sum == 7 || sum == 11) {
            winOrLose = true
        } else {
            winOrLose = gameReplay(sum)
        }

        var newTotalWins = totalWins

        if(winOrLose == true){
            newTotalWins = totalWins + 1
        }
        var newPlaysLeft = playsLeft - 1

        initialGame(newPlaysLeft, newTotalWins)
    }else{
        println(totalWins)
    }


}
def gameReplay(winNumber:Int):Boolean = {
    var roll1 = (6*math.random).toInt + 1
    var roll2 = (6*math.random).toInt + 1
    var sum = roll1 + roll2

    var winOrLose:Boolean = false

    if (sum == winNumber){
        winOrLose = true
    }
    if (sum == 7){
        winOrLose = false
    }
    else{
        gameReplay(winNumber)
    }
    (winOrLose)
}

