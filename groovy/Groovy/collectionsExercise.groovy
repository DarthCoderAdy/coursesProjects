// LIST IN GROOVY
List days = ["mon", "tue", "wed", "thu", "fri", "sat", "sun"]
println days
println days.size()
days.remove(5)
println days
days << "sat"
println days
println days[2]
days.remove("sat")
println days
days.add(5, "sat")
println days
days.pop()
println days

// MAP IN GROOVY
Map dOw = [1:"Mon", 2:"Tue", 3:"Wed", 4:"Thu", 5:"Fri", 6:"Sat", 7:"Sun"]
println dOw
println dOw.getClass().getName()
println dOw.size()
println dOw.entrySet()


for(day in dOw.keySet()) {
    println"${dOw[day]}"
}
dOw[5] = "RRR"
dOw.get(5)
println dOw
dOw.put(8, "Fri")
println dOw
dOw << [9:"Pot"]
println dOw
println dOw.values()

// ENUM and RANGE
enum DayOfWeek { mon, tue, wed, thu, fri, sat, sun }

println DayOfWeek

def dayRange = DayOfWeek.mon..DayOfWeek.sun

//for in loop
for(day in dayRange){
    println day
}
// using closure
dayRange.each { day -> 
println day 
}
println dayRange.contains(DayOfWeek.mon)
println dayRange.from
println dayRange.to


def range = (DayOfWeek.mon..DayOfWeek.fri).collect { "$it" }
println range
println range.size()
