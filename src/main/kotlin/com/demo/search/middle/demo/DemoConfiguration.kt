package com.demo.search.middle.demo

import jakarta.validation.constraints.Pattern
import org.springframework.aot.hint.annotation.RegisterReflectionForBinding
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@EnableConfigurationProperties(DemoContext::class)
//@RegisterReflectionForBinding(Pattern::class, Pattern.Flag::class)
@Configuration
class DemoConfiguration(private val demoContext: DemoContext) {


}