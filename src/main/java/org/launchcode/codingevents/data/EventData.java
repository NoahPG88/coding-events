package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.*;

public class EventData {

 //private static List<Event> events = new ArrayList<>();

    private static final Map<Integer, Event> events = new HashMap<>();

    public static void addEvent(Event event) {
        events.put(event.getId(), event);
    }

    public static Event getById(int id){
        return events.get(id);
    }

    public static Collection<Event> getAllEvents(){
        return events.values();
    }

    public static void removeEvent(int id){
        events.remove(id);
    }

}
