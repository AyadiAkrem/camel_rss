package be.cetic.rssfeed.service;

import be.cetic.rssfeed.domain.RSSFeed;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.stereotype.Service;


@Service
public class RSSFeedsManagementServiceImpl implements RSSFeedsManagementService {

    public List<RSSFeed> getAllRSSFeeds(){
        return IntStream.range(0, 5).mapToObj(x ->new RSSFeed("Hello "+x)).collect(Collectors.toList());
    }
    
}
