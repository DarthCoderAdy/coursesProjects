package GroovyExercise

import javax.print.attribute.standard.MediaSize.Other
@groovy.transform.ToString
class Account {

    BigDecimal balance = 0.0
    String type


    BigDecimal deposit(BigDecimal sum){
        balance += sum
    }

    BigDecimal withdraw(BigDecimal sum) {
        balance -= sum
    }

    BigDecimal plus(Account other) {
        this.balance + other.balance
    }
}





