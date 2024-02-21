// implicit parameter
def foo = {
    println it
}
foo("baf")

// no parameters
def noParams = { ->
    println "No Params..."
}
// noParams(1) - vyhodi chybu
noParams()

def sayHello = {String first, String last ->
    println "Hello, $first $last"
}

sayHello("Pepo", "Vomáèko")

// default values
def intro = { String firstName = "Jan", String lastName = "Novák" ->
    println "Hi, my name is $firstName $lastName"
}
intro("Adam", "Sommer")
intro("Adam")
intro()


// var-arg
def concat = { String... args ->
    args.join('')
}
println concat('abc', 'def')
println concat('123', '456', '789', '007')

def someMethod(Closure c){
    println c.maximumNumberOfParameters
    println c.parameterTypes
}
def someClosure = { int x, int y -> x + y }

someMethod(someClosure)



