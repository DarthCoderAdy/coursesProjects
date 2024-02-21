package groovyBuilders

import groovy.xml.MarkupBuilder


MarkupBuilder builder = new MarkupBuilder(writer)

builder.books {
    book(isbn: "978-1935182443") {
        title 'Groovy in action'
        author 'Dierk Konig'
        price '50.58'
    }
    book(isbn: "978-1935182948") {
        title 'Making Java Groovy'
        author 'Ken Kousen'
        price '30.69'
    }
    book(isbn: "978-1937785307") {
        title 'Programming Groovy 2: Dynamic Productivity for the Java Developer'
        author 'Venkat Subramaniam'
        price '28.92'
    }
}

