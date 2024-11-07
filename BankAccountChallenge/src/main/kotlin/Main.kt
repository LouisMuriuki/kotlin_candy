//oop challenge
//bank account- account anme,balance,transaction-mutable list
//fun for deposit, withdarw, calculate bal;nce
//checks for amount if greater than zero
fun main() {

    createAccountDepositWithdraw()
}


fun createAccount() {
    val myAccount = BankAccount("Louis")
}

fun createAccountDepositWithdraw() {
    val myAccount = BankAccount("Louis2")
    myAccount.Depositfunds(100)
    myAccount.Withdrawfunds(50)


}

val initialTransactions: Array<Transactions> = emptyArray<Transactions>()

class BankAccount(
    var accountName: String,
    private var balance: Int = 0,
    var amount: Int = 0,
    var transactions: Array<Transactions>
) {
    constructor(accountName: String) : this(accountName, 0, 0, initialTransactions) {

    }

    fun Depositfunds(depositAmount: Int) {
        if (depositAmount > 0) {
            balance += depositAmount
            println("Deposit is successful, balance now at $balance")
            return addTransactions(Transactions.DEPOSIT)
        }
        println("Deposit is unsuccessful please try again, check amount")

    }

    fun Withdrawfunds(withdrawAmount: Int) {
        if (withdrawAmount <= balance) {
            balance -= amount
            println("Withdraw is successful, balance now at $balance")
            return addTransactions(Transactions.WITHDRAW)


        }
        println("Withdraw Amount is greater than the balance")

    }

    private fun addTransactions(transaction: Transactions) {
        val existingTransactions = transactions.toMutableList()
        existingTransactions.add(transaction)
        println("Transaction added successfully, here are the transactions, $transactions")
    }

}


enum class Transactions {
    DEPOSIT,
    WITHDRAW
}