package be.cetic.rssfeed.domain;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author EXG503
 */
public class RSSFeed {
    private static AtomicInteger counter = new AtomicInteger(0);
    private final String URI ;
    private boolean active ; 
    private final long id;

    public RSSFeed(String URI) {
        this.URI = URI;
        id = counter.incrementAndGet();
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getURI() {
        return URI;
    }

    public long getId() {
        return id;
    }

}
