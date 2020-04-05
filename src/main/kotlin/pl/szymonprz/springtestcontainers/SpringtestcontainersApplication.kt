package pl.szymonprz.springtestcontainers

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringtestcontainersApplication

fun main(args: Array<String>) {
	runApplication<SpringtestcontainersApplication>(*args)
}
