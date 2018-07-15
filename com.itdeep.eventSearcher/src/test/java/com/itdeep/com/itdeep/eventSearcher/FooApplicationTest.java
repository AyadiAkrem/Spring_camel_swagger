package com.itdeep.com.itdeep.eventSearcher;

import java.util.concurrent.TimeUnit;
import org.apache.camel.CamelContext;
import org.apache.camel.EndpointInject;
import org.apache.camel.builder.NotifyBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringBootRunner;
import org.apache.camel.test.spring.EnableRouteCoverage;
import org.apache.camel.test.spring.MockEndpoints;
import static org.junit.Assert.assertTrue;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author EXG503
 */
//@RunWith(CamelSpringBootRunner.class)
//@SpringBootTest(classes = Application.class,
//    properties = "greeting = Hello foo")
//@EnableRouteCoverage
//@MockEndpoints("log:foo") // mock the log:foo endpoint => mock:log:foo which we then use in the testing
//@Ignore // enable me to run this test as well so we can cover testing the route completely
public class FooApplicationTest {

//    @Autowired
//    private CamelContext camelContext;
//
//    @EndpointInject(uri = "mock:log:foo")
//    private MockEndpoint mock;
//
//    @Test
//    public void shouldSayFoo() throws Exception {
//        mock.expectedBodiesReceived("Hello foo");
//
//        // we expect that one or more messages is automatic done by the Camel
//        // route as it uses a timer to trigger
//        NotifyBuilder notify = new NotifyBuilder(camelContext).whenDone(1).create();
//
//        assertTrue(notify.matches(10, TimeUnit.SECONDS));
//
//        mock.assertIsSatisfied();
//    }

}