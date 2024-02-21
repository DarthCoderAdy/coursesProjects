package GroovyExercise

import javax.print.attribute.standard.MediaSize

Account checking = new Account(type: "Checking")
checking.deposit(100.00)
Account savings = new Account(type: "Savings")
savings.deposit(50.00)

BigDecimal total = checking + savings
println(total)
println checking
println savings

