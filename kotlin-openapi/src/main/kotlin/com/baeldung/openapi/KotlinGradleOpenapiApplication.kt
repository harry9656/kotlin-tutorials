package com.baeldung.openapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinGradleOpenapiApplication

fun main(args: Array<String>) {
	runApplication<KotlinGradleOpenapiApplication>(*args)
}