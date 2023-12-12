package TodoAttributes;

public class TodoItem {
    private String description;
    private boolean hasDone;

    public TodoItem(String description) {
        this.description = description;
        this.hasDone = false;
    }

    // Setters and getters
    public String getDescription() { return  description; }
    public void setDescription(String newDescriptionValue) { this.description = newDescriptionValue; }

    public boolean getHasDone() { return  this.hasDone; }
    public void setHasDone(boolean newHasDoneValue) { this.hasDone = newHasDoneValue; }

    //    @Override
    public String stringPerformance() {
        return  description + " " + (hasDone ? "[+]" : "[ ]");
    }

}
