package com.itdeep.com.itdeep.eventSearcher.service;


import com.itdeep.com.itdeep.eventSearcher.domain.Event;
import com.itdeep.com.itdeep.eventSearcher.domain.EventResult;
import java.util.List;

public interface EventBriteService {

    List<EventResult>  searchEvent(Event event);

    
}
