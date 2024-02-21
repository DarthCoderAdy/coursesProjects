package GroovyUdemy

import java.time.LocalDate
import java.time.LocalDateTime
@groovy.transform.ToString()
class Tweet {
    String author
    String content
    Date insert

    Tweet(String name, String text){
        author = name
        content = text
        insert = new Date()
    }

    void dispalyTweet(){
        println "Tweet: $author $content $insert"
    }

}


