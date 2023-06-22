package com.demo.search.middle.demo

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@EnableConfigurationProperties(DemoContext::class)
@Configuration
class DemoConfiguration(private val demoContext: DemoContext) {


}