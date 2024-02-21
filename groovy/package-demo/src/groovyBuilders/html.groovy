package groovyBuilders

import groovy.xml.MarkupBuilder

FileWriter writer = new FileWriter('create.html')
MarkupBuilder builder = new MarkupBuilder(writer)

List courses = [
        [id:1, name: 'Apache Groovy'],
        [id:2, name: 'Java']
]

builder.html {
    head {
        title 'About blah'
        description 'This is a description'
        keywords 'blah, grooovy, description'
    }
    body {
        h1 'About'
        p 'some text'
        section {
            h2 'courses'
            table {
                tr {
                    th 'id'
                    th 'name'
                }
//                tr {
//                    td '1'
//                    td 'Groovy'
//                }
//                tr {
//                    td '2'
//                    td 'Java'
//                }
                courses.each { course ->
                    tr {
                        td course.id
                        td course.name
                    }
                }
            }
        }
    }
}

