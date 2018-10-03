package com.jeemyeong.request

import com.jeemyeong.request.job.Job
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class RequestApplication: CommandLineRunner {

    @Autowired
    lateinit var restTemplate: RestTemplate

    override fun run(vararg args: String?) {
        Job(restTemplate).start()
    }
}


fun main(args: Array<String>) {
    runApplication<RequestApplication>(*args)
}

