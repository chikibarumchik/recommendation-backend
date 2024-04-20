package ru.mityushkin.recommendationbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RecommendationBackendApplication

fun main(args: Array<String>) {
	runApplication<RecommendationBackendApplication>(*args)
}
