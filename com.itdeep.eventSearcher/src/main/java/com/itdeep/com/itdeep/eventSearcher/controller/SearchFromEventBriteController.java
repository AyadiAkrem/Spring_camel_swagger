package com.itdeep.com.itdeep.eventSearcher.controller;

import com.itdeep.com.itdeep.eventSearcher.domain.Event;
import com.itdeep.com.itdeep.eventSearcher.domain.EventResult;
import com.itdeep.com.itdeep.eventSearcher.service.EventBriteService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author Akrem AYADI
 */
@RestController
@RequestMapping("/search")
final class SearchFromEventBriteController {

    private final EventBriteService eventBriteService;

    /**
     * Starting from Spring Framework 4.3, it's very easy to write components
     * that use constructor injections. The @Autowired annotation is no longer
     * mandatory as long as the Component have a single constructor. Spring will
     * consider it an autowire target.
     *
     * @param multiplicationService : it will be injected automatically by
     * Spring
     */
    public SearchFromEventBriteController(EventBriteService eventBriteService) {
        this.eventBriteService = eventBriteService;
    }

    @GetMapping("/event")
    List<EventResult> search(@RequestParam(value = "latitude") String latitude,
            @RequestParam(value = "longitude") String longitude,
            @RequestParam(value = "within") String within) {

        System.out.println("=====>" + within);
        return eventBriteService.searchEvent(new Event(Double.parseDouble(latitude),
                 Double.parseDouble(longitude),
                Integer.parseInt(within)));
    }

}
