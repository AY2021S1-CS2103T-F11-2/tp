package seedu.address.testutil;

import seedu.address.model.meeting.meeting.Contacts;
import seedu.address.model.meeting.meeting.Description;
import seedu.address.model.meeting.meeting.From;
import seedu.address.model.meeting.meeting.Location;
import seedu.address.model.meeting.meeting.Meeting;
import seedu.address.model.meeting.meeting.Title;
import seedu.address.model.meeting.meeting.To;


public class MeetingBuilder {

    public static final String DEFAULT_TITLE = "Test";
    public static final String DEFAULT_DESCRIPTION = "Refine functional requirements "
            + "with business associates";
    public static final String DEFAULT_FROM = "12-12-2020 08:00";
    public static final String DEFAULT_TO = "12-12-2020 09:00";
    public static final String DEFAULT_CONTACTS = "3,6,9";
    public static final String DEFAULT_LOCATION = "Singapore";

    private Title title;
    private Description description;
    private From from;
    private To to;
    private Contacts contacts;
    private Location location;

    /**
     * Constructor for Meeting builder, instantiate to use default attributes.
     */
    public MeetingBuilder() {
        this.title = new Title(DEFAULT_TITLE);
        this.description = new Description(DEFAULT_DESCRIPTION);
        this.from = new From(DEFAULT_FROM);
        this.to = new To(DEFAULT_TO);
        this.contacts = new Contacts(DEFAULT_CONTACTS);
        this.location = new Location(DEFAULT_LOCATION);
    }

    /**
     * Copies meeting attributes into builder.
     *
     * @param meetingToCopy specified meeting to build.
     */
    public MeetingBuilder(Meeting meetingToCopy) {
        this.title = meetingToCopy.getTitle();
        this.description = meetingToCopy.getDescription();
        this.from = meetingToCopy.getFrom();
        this.to = meetingToCopy.getTo();
        this.contacts = meetingToCopy.getContacts();
        this.location = meetingToCopy.getLocation();
    }

    /**
     * Sets the {@code Title} of the {@code Meeting} that we are building.
     */
    public MeetingBuilder withTitle(String title) {
        this.title = new Title(title);
        return this;
    }

    /**
     * Sets the {@code Description} of the {@code Meeting} that we are building.
     */
    public MeetingBuilder withDescription(String description) {
        this.description = new Description(description);
        return this;
    }

    /**
     * Sets the {@code From} of the {@code Meeting} that we are building.
     */
    public MeetingBuilder withFrom(String from) {
        this.from = new From(from);
        return this;
    }

    /**
     * Sets the {@code To} of the {@code Meeting} that we are building.
     */
    public MeetingBuilder withTo(String to) {
        this.to = new To(to);
        return this;
    }

    /**
     * Sets the {@code Contacts} of the {@code Meeting} that we are building.
     */
    public MeetingBuilder withContacts(String contacts) {
        this.contacts = new Contacts(contacts);
        return this;
    }

    /**
     * Sets the {@code Location} of the {@code Meeting} that we are building.
     */
    public MeetingBuilder withLocation(String location) {
        this.location = new Location(location);
        return this;
    }


    public Meeting build() {
        return new Meeting(title, description, from, to, contacts, location);
    }

}
