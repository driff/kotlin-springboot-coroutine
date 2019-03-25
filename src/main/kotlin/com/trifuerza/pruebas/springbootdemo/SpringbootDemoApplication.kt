package com.trifuerza.pruebas.springbootdemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootDemoApplication

fun main(args: Array<String>) {
	SpringApplication.run(SpringbootDemoApplication::class.java, *args)
}
