package GroovyUdemy

@groovy.transform.ToString()
class Persona {
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
Persona pepa = new Persona(first:"Josef", last:"Novák", pozdrav:"Čau")
pepa.zdravi()
pepa.last = "Sommer"
pepa




