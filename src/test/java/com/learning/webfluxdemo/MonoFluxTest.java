package com.learning.webfluxdemo;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

    @Test
    public void testMono(){
        Mono<String> monoString = Mono.just("Hassan").log();
        monoString.subscribe(System.out::println);

    }
}
