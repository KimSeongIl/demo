package com.demo.search.middle.demo.web

import org.springframework.http.server.reactive.ServerHttpRequest
import org.springframework.http.server.reactive.ServerHttpResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class DemoController() {

    @GetMapping("/hello")
    fun hello(httpRequest: ServerHttpRequest, serverHttpResponse: ServerHttpResponse): Mono<String> {
        return Mono.just("hello")
    }
}