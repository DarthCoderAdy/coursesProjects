// Inject()
//It is used to accumulate a result by iteratively applying a binary operation to each element of a collection and an accumulated value.
def digits = [1, 5, 6, 8, 8]

def multiplyList(list) {
list.inject(1) { result, element -> result * element }
}

println multiplyList(digits) // Output: 1920

// toList()
//Lists: You can use toList() on a list to create a new list with the same elements:
def originalList = [1, 2, 3, 4, 5]
def newList = originalList.toList()
println(newList) // Output: [1, 2, 3, 4, 5]

//Ranges: You can use toList() on a range to create a list of all the values in that range:
def range = (1..5)
def listFromRange = range.toList()
println(listFromRange) // Output: [1, 2, 3, 4, 5]

//Sets: You can use toList() on a set to convert it into a list. Note that the order of elements in a set is not guaranteed, so the resulting list may not preserve the original order:
def originalSet = [1, 2, 3, 4, 5] as Set
def listFromSet = originalSet.toList()
println(listFromSet) // Output: [1, 2, 3, 4, 5] or a different order

//Maps: You can use toList() on a map to convert it into a list of entries (key-value pairs) represented as maps:
//def originalMap = [a: 1, b: 2, c: 3]
//def listFromMap = originalMap.toList()
//println(listFromMap) // Output: [[a=1], [b=2], [c=3]]

def inputStr = "hello"
def characterCounts = inputStr.toList().countBy { it }

println(characterCounts) // Output: [h:1, e:1, l:2, o:1]


/* countBy { closure }
Return a Map where:
Keys are the unique values returned by the closure for each element.
Values are the count of elements in the collection that belong to that key (group).
*/

def words = ["apple", "banana", "orange", "grapes", "mango"]
def lengthCounts = words.countBy { it.length() }

println(lengthCounts) // [5:2, 6:3]


def numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9]
def divisibilityCounts = numbers.countBy { it % 3 }

println(divisibilityCounts) // [1:3, 2:3, 0:3]


class Person {
  String name
  int age
}

def people = [
  new Person(name: "John", age: 30),
  new Person(name: "Jane", age: 25),
  new Person(name: "Alice", age: 30),
]

def ageGroups = people.countBy { it.age }

println(ageGroups) // [25:1, 30:2]

def originalMap = [a: 1, b: 2, c: 3]
def collectMap = originalMap.collect { it }
def listFromMap = collectMap.toList()
println(listFromMap) // Output: [[a=1], [b=2], [c=3]]

println listFromMap.class
println collectMap.class
println originalMap.getClass().getName()