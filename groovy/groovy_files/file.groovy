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
Person pepa = new Person(first:"Josef", last:"Nov�k", pozdrav:"�au")
pepa
pepa.last = "Sommer"
pepa.zdravi()





