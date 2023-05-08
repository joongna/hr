package com.joongna.hr

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class HrApplication

fun main(args: Array<String>) {
	runApplication<HrApplication>(*args)
}
