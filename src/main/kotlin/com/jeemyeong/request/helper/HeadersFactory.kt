package com.jeemyeong.request.helper

import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType

class HeadersFactory {
    companion object {

        private var httpHeaders: HttpHeaders? = null
        var token: String? = null

        fun getInstance() = httpHeaders ?: HttpHeaders()
            .also { it.accept = listOf(element = MediaType.APPLICATION_JSON) }
            .also { it.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36") }
            .also { headers -> token?.also { token -> headers.add("token", token) } }
            .also { httpHeaders = it }
    }
}
