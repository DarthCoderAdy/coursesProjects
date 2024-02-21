def nums = [] // List
for (int x = 1; x <= 10; x++) {
    nums.add(x) //nums << x
}
println nums

println nums.class

nums.add(20)
println nums
nums.putAt(0, 50)
println nums
nums[2] = 154 
println nums
println nums + 71
println nums
nums.pop()
println nums
nums.removeAt(0)
println nums
def newNums = nums - 10
println newNums
println nums.getAt(0..5)
println nums.first()
println nums.init()

for(x in nums){
    println x
}

nums <<[3,4,5,6]
println nums
println nums.flatten()
println nums.unique()
println nums.flatten().unique()

// in case of duplicates not wanted I can use a Set

def numbers = [1,2,5,4,1,2,8,23,7,459,6,2,6,4,6,2,159]
println numbers
def numbers2 = [1,2,5,4,1,2,8,23,7,459,6,2,6,4,6,2,159] as Set
println numbers2
def numbers3 = [1,2,5,4,1,2,8,23,7,459,6,2,6,4,6,2,159] as SortedSet
println numbers3

def map = [:]
println map
println map.getClass().getName()

def person = [first:"Adam", last:"Sommer", email:"adam@adam"]
println person 
println person.get("first")
person.phone = "12345"
println person

def emailKey = "Email Address"
def fb = [username:"DarthAdy", emailKey: "adam@mada"]
println fb
def fb1 = [username:"DarthAdy", (emailKey): "adam@mada"]
println fb1

println person.size()
println person.sort()
println person.keySet()
println person.entrySet()

for( entry in person ) {
    println entry
}

for(key in person.keySet()){
    println "$key:${person[key]}"
}

// each 



