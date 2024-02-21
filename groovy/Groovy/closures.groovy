// Closure closure = {}
def closure = {}

println closure instanceof Closure

def sayHello = {
    println "Hello"
}
sayHello()

def sayHi = { name ->
    println "Hi, $name"
}
sayHi('Adam')

List nums = [1,5,2,8,1,5,2,6,8,4]

nums.each {
    println it
}

nums.each { num ->
    println num
}

def timesTen(num, closure) {
    closure(num * 10)
} 
timesTen(10, { println it })

timesTen(2) {
    println it
}

10.times {
    println it
}

import java.util.Random
Random rand = new Random()

3.times {
    println rand.nextInt()
}