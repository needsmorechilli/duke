public abstract class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }

    public void markAsDone(){
        this.isDone = true;
    }

    public Boolean getStatus(){
        return this.isDone;
    }

    public String getDescription(){
        return this.description;
    }

    public abstract char getD();
    public abstract String getTime();
    @Override
    public String toString() {
        return "[" + getStatusIcon() + "] " + this.description;
    }
}
