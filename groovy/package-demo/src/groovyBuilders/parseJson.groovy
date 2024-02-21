package groovyBuilders

import groovy.json.JsonSlurper

JsonSlurper slurper = new JsonSlurper()
def json = slurper.parse(new File('books.json'))

println json.books.currentBook
println json.books.currentBook.title
println json.books.currentBook.author
println json.books.currentBook.related
