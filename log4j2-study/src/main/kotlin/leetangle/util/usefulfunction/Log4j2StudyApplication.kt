package leetangle.util.usefulfunction

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Log4j2StudyApplication

val log = KotlinLogging.logger {  }

fun main(args: Array<String>) {

    runApplication<Log4j2StudyApplication>(*args)
}
