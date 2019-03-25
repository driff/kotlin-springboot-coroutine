package com.trifuerza.pruebas.springbootdemo.controllers

import com.trifuerza.pruebas.springbootdemo.models.Message
import kotlinx.coroutines.*
import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingsController {

    private final val counter: AtomicLong = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value="name", defaultValue="World") name: String): Message = runBlocking{
        val msg = GlobalScope.async {
            delay(5000)
            return@async Message(counter.incrementAndGet(), "Hello, $name")
        }
        return@runBlocking msg.await()
    }

}