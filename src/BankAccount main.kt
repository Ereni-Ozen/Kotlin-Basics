fun main() {
    val account = BankAccount()
    account.checkBalance()
    account.deposit(100.0)
    account.withdraw(50.0)
    account.checkBalance()
    account.printCalculatedInterest()
}