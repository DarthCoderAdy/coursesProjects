def lst = [1,2,3,4];
lst.each {println it}
println("The list will only display those numbers which are divisible by 2")
def newLst = lst.collect{num -> if(num % 2 == 0) num }
println newLst
lst.eachWithIndex{num -> if(num % 2 == 0) println num}
      
      
def list = [1,2,3,4];
def newlst = []
newlst = list.collect {element -> return element * element}
println(newlst)

def toAll = { a, b -> println "$a $b"}
toAll("Hello", "World")

def map = [1:"Adam", 2:"Lucka", 3:"Mauvi"]
map.each { key, value -> println "Ranking: $key $value" }

def names = ['Pepa', 'Adam', 'Aleš', 'Antonín', 'Bedrich']

def aNames = names.findAll { it.startsWith('A') }
println aNames

println names.any { it.endsWith('h')}

def word(str, closure) {
    closure(str + " stinks")
}
word("learning", { println it } )

