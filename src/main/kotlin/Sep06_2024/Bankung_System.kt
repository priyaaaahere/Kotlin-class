package Sep06_2024

fun main() {
    var accountBalance = 1000
    var shouldWithdraw = "yes"
    while (shouldWithdraw == "yes"){
        println("Enter withdraw amount: ")
        val withdrawAmount = readln().toInt()
        if(withdrawAmount>accountBalance){
            println("Insufficient balance!")
        }else{
            accountBalance -= withdrawAmount
            println("Balance after withdrawal: $accountBalance")

        }
        println("Want to withdraw again? ")
        shouldWithdraw = readln()
        if(shouldWithdraw == "no"){
            println("Thank you for using our banking system.")
            break;
        }
    }
}