package task;

/**
 * A generic task, which can be marked as done.
 */
public class Task {
    protected String description;
    protected boolean isDone;

    /**
     * Initializes a task not yet done with the given description.
     *
     * @param description A description of this task.
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Returns the description associated with this task.
     *
     * @return This task's description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets this task as done or undone.
     */
    public void setDone(boolean done) {
        isDone = done;
    }

    /**
     * Returns a string representation of this task.
     *
     * @return The desired string representation.
     */
    @Override
    public String toString() {
        return (isDone ? "[✓] " : "[✘]") + description;
    }
}