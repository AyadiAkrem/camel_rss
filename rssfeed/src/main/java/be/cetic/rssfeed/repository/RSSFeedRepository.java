package be.cetic.rssfeed.repository;

import be.cetic.rssfeed.domain.RSSFeed;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 */
public interface RSSFeedRepository extends CrudRepository<RSSFeed, Long> {

    /**
     * @param isActive
     * @return All the inactive URIs
     */
    List<RSSFeed> findByActive(boolean isActive);

}
