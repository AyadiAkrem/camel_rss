package be.cetic.rssfeed.service;

import be.cetic.rssfeed.domain.RSSFeed;
import be.cetic.rssfeed.repository.ParameterRepository;
import be.cetic.rssfeed.repository.RSSFeedRepository;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author EXG503
 */
public class RSSFeedsManagementServiceImplTest {

    private RSSFeedsManagementServiceImpl rSSFeedsManagementServiceImpl;
    @Mock
    private RSSFeedRepository rSSFeedRepository;
    @Mock
    private ParameterRepository parameterRepository;
          
    @Before
    public void setUp() {
        // With this call to initMocks we tell Mockito to  process the annotations 
        MockitoAnnotations.initMocks(this);
        rSSFeedsManagementServiceImpl = new RSSFeedsManagementServiceImpl(rSSFeedRepository,parameterRepository);
    }

    /**
     * Test of getAllRSSFeeds method, of class RSSFeedsManagementServiceImpl.
     */
    @Test
    public void testGetAllRSSFeeds() {
        System.out.println("getAllRSSFeeds");
//        RSSFeedsManagementServiceImpl instance = new RSSFeedsManagementServiceImpl(rSSFeedRepository);
//        List<RSSFeed> expResult = null;
//        List<RSSFeed> result = instance.getAllRSSFeeds();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
