class Groovy {
    static void main(String[] args) {
        Person johnDoe = new Person()
        johnDoe.setFirstName("Johnny")
        johnDoe.setLastName("Doe")
        johnDoe.setAge(40)

        println johnDoe.getFullName()
        println johnDoe.getAge()

        if (johnDoe.getAge() >= 45 && johnDoe.getAge() <= 60) {
            println johnDoe.getFullName() + " is middle-aged"
        } else {
            println johnDoe.getFullName() + " is " + johnDoe.getAge() + " years old"
        }

        def persons = [johnDoe, new Person(firstName: "Mary", lastName: "Hill", age: 40)]

        for (Person person : persons) {
            println(person.getFullName())
        }
//        persons.each { Person person ->
//            println(person.getFullName())
//        }

        println johnDoe.getFirstName().dropRight(2)

        Calculator calculator = new Calculator()

        println calculator.secti(5, 5)
        assert calculator.nasob(15, 5) == 75
        assert calculator.secti(5, 5) == 10
        assert calculator.vydel(10, 5) == 2
        assert calculator.odecti(8, 4) == 4

        try {
            calculator.vydel(5, 0)
        } catch (RuntimeException e) {
            assert e.getMessage() == "cannot divide by zero"
        }
    }
}
