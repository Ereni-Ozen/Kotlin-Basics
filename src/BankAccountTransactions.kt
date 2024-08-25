class BankAccount(
    private var balance: Double = 0.0

) {
    fun checkBalance() {
        println("Current balances: $balance")
    }

    private fun calculateInterest(): Double {
        val gainFromInterest = balance * 0.10
        return gainFromInterest
    }

    fun printCalculatedInterest() {
        println("Your current interest gain per month ${calculateInterest()}")
    }

    fun deposit(amount: Double) {
        if (amount > 0.0) {
            balance += amount
            println("Deposited: $amount")
        }else{
            println("Deposited amount must be positive")
        }
    }
    fun withdraw(amount: Double) {
        if (amount > 0.0 && amount <= balance) {
            balance -= amount
        }else{
            println("Insufficient balance or invalid withdrawal amount.")
        }
    }
}

