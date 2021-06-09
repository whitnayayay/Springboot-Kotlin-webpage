package com.example.blog

import org.springframework.stereotype.Component
import org.springframework.stereotype.Controller

@Component
class HelperOne {
    fun help(value: String): String {
        println(value)
        return value
    }
}