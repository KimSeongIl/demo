package com.demo.search.middle.demo

import jakarta.validation.constraints.Pattern
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.http.HttpMethod
import org.springframework.validation.annotation.Validated




@ConfigurationProperties(prefix = "demo.context")
@Validated
class DemoContext {

    var exclude: List<Exclude> = mutableListOf()

    data class Exclude(

        var url: List<String>? = null,

        var httpMethod: List<HttpMethod>? = null,

        var httpStatus: List<@Pattern(regexp="^([1-5][x|X]{2}|[1-5][0-9]{2})\$") String>? = null,

        var elapsedTime: Long? = null
    )


}