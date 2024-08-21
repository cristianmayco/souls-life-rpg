package com.souls.boot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SoulsApplication

fun main(args: Array<String>) {
	runApplication<SoulsApplication>(*args)
}
