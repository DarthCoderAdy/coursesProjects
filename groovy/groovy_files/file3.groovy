def map = [1:"one", 2:"two", 3:"three"]
println map
map << [4:"four"]
println map
//println map.flatten()

def list = [1,2,3,4,5]
list << [6]

println list
println list.flatten()

def nestedList = [[1, 2], [3, 4, 5], [6]]
def doubledList = nestedList.flatten { it * 2 }

println(doubledList) // Output: [2, 4, 6, 8, 10, 12]

class Account {
    BigDecimal balance = 0.0
    def deposit(BigDecimal amount) {
        try {
          if (amount <= 0){
              throw new IllegalArgumentException("Deposit cannot be negative")
          } 
          balance += amount
          
        } catch (IllegalArgumentException e) {
            println "Error: $e.message"
            return balance
        } 
    }
    def depositMulti(List list) {
        for (amount in list){
        deposit(amount)
        }
        return balance
     
    }
}
Account account = new Account()

account.deposit(100)
println account.balance

account.depositMulti([200, 150, -300, 895])
println account.balance