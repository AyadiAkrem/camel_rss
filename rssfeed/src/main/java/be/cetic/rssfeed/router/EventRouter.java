package be.cetic.rssfeed.router;

import org.apache.camel.Endpoint;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.stream.StreamEndpoint;
import org.springframework.stereotype.Component;

//@Component
public class EventRouter extends RouteBuilder {

   
    
    @Override
    public void configure() throws Exception {
        Endpoint stream = (StreamEndpoint) endpoint("stream:out");
            from("rss:http://trafiroutes.wallonie.be/trafiroutes/Evenements_FR.rss?alt=rss&splitEntries=false&consumer.delay=10000")
                .marshal().rss().to(stream);
            
            
    }

 
}
