package duke.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * The Event class.
 */
public class Event extends Task {
    private LocalDate startDate;
    private LocalDate endDate;

    /**
     * The constructor for the duke.task.Event class.
     *
     * @param name Name of the event task.
     * @param startDate Start date of the event.
     * @param endDate End date of the event.
     * @param isDone Whether the task is marked done or not.
     */
    public Event(String name, String startDate, String endDate, boolean isDone) {
        super(name, isDone);
        this.startDate = LocalDate.parse(startDate);
        this.endDate = LocalDate.parse(endDate);
    }

    @Override
    public String toString() {
        if (this.isDone) {
            return "[E][X] " + this.name + " From: " + this.startDate + " To: " + this.endDate;
        } else {
            return "[E][ ] " + this.name + " From: " + this.startDate + " To: " + this.endDate;
        }
    }
    /**
     * Displays the event in a user-friendly format.
     *
     * @return The string representation of the event for display to the user.
     */
    public String userDisplayString() {
        String newStartDate = this.startDate.format(DateTimeFormatter.ofPattern("MMM d yyyy"));
        String newEndDate = this.endDate.format(DateTimeFormatter.ofPattern("MMM d yyyy"));
        if (this.isDone) {
            return "[E][X] " + this.name + " From: " + newStartDate + " To: " + newEndDate;
        } else {
            return "[E][ ] " + this.name + " From: " + newStartDate + " To: " + newEndDate;
        }
    }
}
