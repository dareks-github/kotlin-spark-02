package main.kotlin.sparkapp

import spark.Spark.*

fun main () {
    println("1")
    port(getHerokuPort())
    //
    println("2")
    get("/") { req, res -> "MS, MS hej hej hej!" }
    println("3")
    get("/2") { req, res -> "MS 2" }
    println("4")
}

fun getHerokuPort(): Int {
    val processBuilder = ProcessBuilder()
    return if (processBuilder.environment()["PORT"] != null) {
        processBuilder.environment()["PORT"]!!.toInt()
    } else 5000
}