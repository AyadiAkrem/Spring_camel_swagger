package com.itdeep.com.itdeep.eventSearcher.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class EventRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // call the embedded rest service from the PetController
        restConfiguration().host("localhost").port(8080);

        from("timer:hello?period={{timer.period}}")
//            .setHeader("id", simple("${random(1,3)}"))
            .to("rest:get:social/search/event")
            .log("${body}");
    }
    
    public void configure_example1() throws Exception {
        from("timer:hello?period={{timer.period}}").routeId("hello").routeGroup("hello-group")
                .transform().method("myBean", "saySomething")
//                .filter(simple("${body} contains 'foo'"))
//                .to("log:foo")
                .end()
                .to("stream:out");
    }
}
