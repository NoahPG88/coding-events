package org.launchcode.codingevents.models;

import javax.validation.constraints.*;
import java.util.Objects;

public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3-50 chars")
    private String name;

    @NotBlank(message = "Email required")
    @Email(message = "Invalid email.  Try again.")
    private String contactEmail;

    private boolean required;

    @Max(value = 10000, message = "10,000 attendee maximum")
    @Min(value = 10, message = "10 attendee minimum")
    private Integer attendees;

    @Size(min = 3, max = 50, message = "Location must be between 3-50 chars")
    @NotBlank(message = "Location is required")
    private String location;

    @Size(max = 750, message = "Description too long!  750 char max")
    private String description;

    public Event(){
        this.id = nextId;
        nextId++;
    }

    public Event(String name, String contactEmail, boolean required, Integer attendees, String location, String description){
        this();
        this.name = name;
        this.contactEmail = contactEmail;
        this.required = required;
        this.attendees = attendees;
        this.location = location;
        this.description = description;
    }



    public Integer getAttendees() {
        return attendees;
    }

    public void setAttendees(Integer attendees) {
        this.attendees = attendees;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Event{" + "name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return getId() == event.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
