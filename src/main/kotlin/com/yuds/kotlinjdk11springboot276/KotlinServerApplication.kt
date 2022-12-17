package com.yuds.kotlinjdk11springboot276

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinServerApplication

fun main(args: Array<String>) {
	runApplication<KotlinServerApplication>(*args)
}
