package be.cetic.rssfeed.controller;

import be.cetic.rssfeed.domain.RSSFeed;
import be.cetic.rssfeed.service.RSSFeedsManagementService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/manager")
public class RSSFeedsManagementController {

    private final RSSFeedsManagementService rSSFeedsManagementService;

    public RSSFeedsManagementController(RSSFeedsManagementService rSSFeedsManagementService) {
        this.rSSFeedsManagementService = rSSFeedsManagementService;
    }

    @PutMapping("/put")
    public String createUser(@RequestBody RSSFeed rss) {
        this.rSSFeedsManagementService.saveRSSFeed(rss);
        return "Saving " + rss.getURI() +" is done";
    }
}
