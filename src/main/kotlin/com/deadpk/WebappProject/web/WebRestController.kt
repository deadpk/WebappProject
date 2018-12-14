package com.deadpk.WebappProject.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WebRestController() {
    @GetMapping("/hello")
    fun hello_get(): String {
        return "hello"
    }
}