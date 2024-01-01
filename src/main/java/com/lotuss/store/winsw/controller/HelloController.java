package com.lotuss.store.winsw.controller;

import com.lotuss.store.winsw.model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author jittagornp
 */
@RestController
public class HelloController {

    @GetMapping
    public Mono<Response> sayHello() {
        return Mono.just("Hello. This is demo project for building Java Spring Boot as a Windows Service Wrapper")
                .map(Response::ok);
    }

}
