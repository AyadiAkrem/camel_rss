package be.cetic.rssfeed.controller;

import be.cetic.rssfeed.domain.RSSFeed;
import be.cetic.rssfeed.service.RSSFeedsManagementService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 */
@RestController
@RequestMapping("/rssfeeds")
final class RSSFeedsController {

    private final RSSFeedsManagementService rSSFeedsManagementService;

    /**
     * Starting from Spring Framework 4.3, it's very easy to write components
     * that use constructor injections. The @Autowired annotation is no longer
     * mandatory as long as the Component have a single constructor. Spring will
     * consider it an autowire target.
     *
     * @param rSSFeedsManagementService : it will be injected automatically by
     * Spring
     */
    public RSSFeedsController(RSSFeedsManagementService rSSFeedsManagementService) {
        this.rSSFeedsManagementService = rSSFeedsManagementService;
    }

//    @GetMapping("/events")
//    List<EventResult> search(@RequestParam(value = "latitude") String latitude,
//            @RequestParam(value = "longitude") String longitude,
//            @RequestParam(value = "within") String within) {
//
//        System.out.println("=====>" + within);
//        return rSSFeedsManagementService.searchEvent(new Event(Double.parseDouble(latitude),
//                 Double.parseDouble(longitude),
//                Integer.parseInt(within)));
//    }
    
    @GetMapping("/all")
    List<RSSFeed> search() {

        return rSSFeedsManagementService.getAllRSSFeeds();
    }

}
