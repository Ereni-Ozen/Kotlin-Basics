open class BankAccountInfo(
        val accountNumber: Int,
        private var balance: Double,
        val ownerName: String
    ) {

        private fun calculateInterest(): Double {
            return balance * 0.10
        }

       public fun deposit(amount: Double) {
            if(amount > 0.0) {
                balance += amount
                println("Deposited $amount , newbalance = $balance"    )
            }else {
                println("Invalid deposit amount")
            }
        }

        fun withdraw(amount: Double) {
            if(amount > 0.0 && amount <= balance) {
                balance -= amount
                println("Withdrawed $amount, new balance = $balance")
            }else if (amount > 0.0) {
                println("Insufficant funds.")
            }else {
                println("Invalid withdraw amount.")
            }
        }
}