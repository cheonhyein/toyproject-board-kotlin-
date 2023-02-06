package com.example.toyprojectboard

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
// Jpa Auditing 어노테이션들 활성화하는 어노테이션 추가
@EnableJpaAuditing

class ToyprojectBoardApplication

fun main(args: Array<String>) {
    runApplication<ToyprojectBoardApplication>(*args)
}
