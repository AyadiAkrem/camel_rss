package be.cetic.rssfeed.router;

import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.feed.synd.SyndFeedImpl;
import org.apache.camel.Endpoint;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.stream.StreamEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventRouter extends RouteBuilder {

   
    
    @Override
    public void configure() throws Exception {
        Endpoint stream = (StreamEndpoint) endpoint("stream:out");
        stream.getCamelContext().getTypeConverterRegistry().addTypeConverter(MyPOJO.class, String.class, new RSSTypeConvertor());
            from("rss:http://trafiroutes.wallonie.be/trafiroutes/Evenements_FR.rss?alt=rss&splitEntries=false&consumer.delay=1000")
                .marshal().rss().to(stream);
            
            
    }

 
}
