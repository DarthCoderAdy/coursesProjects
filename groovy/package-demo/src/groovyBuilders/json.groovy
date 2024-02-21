package groovyBuilders

import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()

builder.books {

    currentBook {
        title 'sranda'
        isbn '56148944984'
        author(first: 'Adam', last: 'Sauce', fb: '@Darth')
        related 'vtip', 'joke'
    }
    nextBook {
        title 'soup'
        isbn '56142222984'
        author(first: 'Eda', last: 'Noodle', fb: '@diver')
        related 'gaspacho', 'Stock'
    }
}

println builder.toString()
println builder.toPrettyString()

new File('books.json').write(builder.toPrettyString())

