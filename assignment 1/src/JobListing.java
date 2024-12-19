public class JobListing {
    private String jobTitle;
    private String description;
    private double budget;


    public JobListing(String jobTitle, String description, double budget) {
        this.jobTitle = jobTitle;
        this.description = description;
        this.budget = budget;
    }


    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }


    public String toString() {
        return "JobTitle: " + jobTitle + ", Description: " + description + ", Budget: $" + budget;
    }
}
