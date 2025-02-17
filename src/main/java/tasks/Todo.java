package tasks;

/**
 * Represents a Todo task. A Todo object is represented by a description of the task.
 */

public class Todo extends Task {

    public Todo(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    @Override
    public String toFile() {
        return "T|" + super.toFile();
    }
}
