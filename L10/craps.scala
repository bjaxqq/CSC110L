import scala.io.StdIn._

println("How many times would you like to run the function?")
var plays = readInt()
var totWins = 0
println("The player won " + (initialGame(plays, totWins)) + " out of " + plays + " games.")
    
def initialGame(playLeft:Int, totWins:Int):Unit = {
    if(playLeft != 0) {
        var dice1 = (6 * math.random).toInt + 1
        var dice2 = (6 * math.random).toInt + 1
        var sumDice = dice1 + dice2
        var winStat:Boolean = true

        if(sumDice == 2 || sumDice == 3 || sumDice == 12) {
            winStat = false
        } else if(sumDice == 7 || sumDice == 11) {
            winStat = true
        } else {
            winStat = reGame(sumDice)
        }

        var newTotWins = totWins

        if(winStat == true) {
            newTotWins = totWins + 1
        }
        var newPlayLeft = playLeft - 1

        initialGame(newPlayLeft, newTotWins)
    } else {
        println(totWins)
    }
}


def reGame(winNum:Int):Boolean = {
    var dice1 = (6 * math.random).toInt + 1
    var dice2 = (6 * math.random).toInt + 1
    var sumDice = dice1 + dice2

    var winStat:Boolean = false

    if(sumDice == winNum) {
        winStat = true
    } else if(sumDice == 7) {
        winStat = false
    } else {
        reGame(winNum)
    }
    (winStat)
}