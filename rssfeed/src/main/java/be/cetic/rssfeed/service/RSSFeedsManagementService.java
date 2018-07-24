package be.cetic.rssfeed.service;

import be.cetic.rssfeed.domain.RSSFeed;
import java.util.List;

/**
 *
 */

public interface RSSFeedsManagementService {

    public List<RSSFeed> getAllRSSFeeds();
    
    public void saveRSSFeed(RSSFeed rssFeed);
    
}
