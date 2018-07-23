package be.cetic.rssfeed.service;

import be.cetic.rssfeed.domain.RSSFeed;
import java.util.List;

/**
 *
 * @author EXG503
 */
public interface RSSFeedsManagementService {

    public List<RSSFeed> getAllRSSFeeds();
    
}
