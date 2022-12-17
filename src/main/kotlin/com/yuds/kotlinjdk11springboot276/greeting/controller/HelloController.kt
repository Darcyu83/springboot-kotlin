package com.yuds.kotlinjdk11springboot276.greeting.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/")
class HelloController {

    @GetMapping("/greeting") // or @GetMapping("greeting")
    fun helloWorld(): String{
        return "Hello, this is a Rest endpoint"
    }

    @GetMapping("/greeting/darcy") // or @GetMapping("greeting/darcy")
    fun helloDarcy():String= "Hello Darcy, this is a Rest endpoint"

}