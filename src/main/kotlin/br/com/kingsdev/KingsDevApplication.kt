package br.com.kingsdev

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KingsDevApplication

fun main(args: Array<String>) {
    runApplication<KingsDevApplication>(*args)
}
