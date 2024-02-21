package groovyBuilders

import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()

builder.sports {
    sport(id:1) {
        name 'Baseball'
    }
    sport(id:2) {
        name 'Football'
    }
    sport(id:3) {
        name 'Basketball'
    }
    sport(id:4) {
        name 'Hockey'
    }
}

