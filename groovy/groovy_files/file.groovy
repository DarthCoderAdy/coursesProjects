@groovy.transform.ToString()
class Person {
String first
String last
String pozdrav

void full(){
    println "Full: $first $last"
}    
    
void zdravi(){
    println pozdrav
}


}
Person pepa = new Person(first:"Josef", last:"Novák", pozdrav:"Èau")
pepa
pepa.last = "Sommer"
pepa.zdravi()





