package be.cetic.rssfeed.service;

import be.cetic.rssfeed.domain.Parameter;
import be.cetic.rssfeed.domain.RSSFeed;
import be.cetic.rssfeed.repository.ParameterRepository;
import be.cetic.rssfeed.repository.RSSFeedRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RSSFeedsManagementServiceImpl implements RSSFeedsManagementService {

    private RSSFeedRepository rSSFeedRepository;
    private ParameterRepository parameterRepository;

    @Autowired
    public RSSFeedsManagementServiceImpl(RSSFeedRepository rSSFeedRepository, ParameterRepository parameterRepository) {
        this.rSSFeedRepository = rSSFeedRepository;
        this.parameterRepository = parameterRepository;
    }

    @Transactional
    @Override
    public void saveRSSFeed(RSSFeed rssFeed) {
        // stores the rss feed 
        rssFeed.getParameters().forEach(parameterRepository::save);
        rSSFeedRepository.save(rssFeed);

    }

    public List<RSSFeed> getAllRSSFeeds() {
        final List<RSSFeed> result = new ArrayList<>();
        rSSFeedRepository.findAll().forEach(result::add);
        return result;
      //  return IntStream.range(0, 1).mapToObj(this::buildRSSFeed).collect(Collectors.toList());
    }

    private RSSFeed buildRSSFeed(int i) {
        final RSSFeed rssFeed = new RSSFeed("http://trafiroutes.wallonie.be/trafiroutes/Evenements_FR.rss");
        List<Parameter> list = new ArrayList();
         Parameter parameter = new Parameter();
        parameter.setName("consumer.delay");
        parameter.setType("long");
        list.add(parameter);
        parameter = new Parameter();
        parameter.setName("splitEntries");
        parameter.setType("boolean");
        list.add(parameter);
        rssFeed.setParameters(list);
        return rssFeed;
    }

}
