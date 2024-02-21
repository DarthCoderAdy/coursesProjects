package groovyBuilders

import groovy.xml.MarkupBuilder

FileWriter writer = new FileWriter('excersise.html')
MarkupBuilder builder = new MarkupBuilder(writer)

def books = [
        [isbn: "978-1935182443", title:'Groovy in Action 2nd Edition', author:'Dierk Koenig', price:'50.58'],
        [isbn: "978-1935182948", title:'Making Java Groovy', author:'Ken Kousen', price:'33.96'],
        [isbn: "978-1937785307", title:'Programming Groovy 2: Dynamic Productivity for the Java Developer', author:'Venkat Subramaniam', price:'28.92']
]

builder.html {
    head {
        title 'Books'
        description 'About books'
        keywords 'book'
    }
    body {
        h1 'Books'
        table {
            tr {
                th 'ISBN'
                th 'TITLE'
                th 'AUTHOR'
                th 'PRICE'
            }
            books.each { book ->
                tr {
                    td book.isbn
                    td book.title
                    td book.author
                    td book.price
                }
            }
        }
    }
}