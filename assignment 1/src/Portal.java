import java.util.ArrayList;

public class Portal {
    private ArrayList<JobListing> jobListings;
    private ArrayList<Freelancer> freelancers;


    public Portal() {
        this.jobListings = new ArrayList<>();
        this.freelancers = new ArrayList<>();
    }


    public void addJobListing(JobListing job) {
        jobListings.add(job);
    }


    public void addFreelancer(Freelancer freelancer) {
        freelancers.add(freelancer);
    }


    public void displayJobListings() {
        System.out.println("Job Listings:");
        for (JobListing job : jobListings) {
            System.out.println(job);
        }
    }


    public void displayFreelancers() {
        System.out.println("Freelancers:");
        for (Freelancer freelancer : freelancers) {
            System.out.println(freelancer);
        }
    }


    public void compareFreelancers(Freelancer freelancer1, Freelancer freelancer2) {
        if (freelancer1.getRate() < freelancer2.getRate()) {
            System.out.println(freelancer1.getName() + " has a lower rate than " + freelancer2.getName());
        } else if (freelancer1.getRate() > freelancer2.getRate()) {
            System.out.println(freelancer2.getName() + " has a lower rate than " + freelancer1.getName());
        } else {
            System.out.println(freelancer1.getName() + " and " + freelancer2.getName() + " have the same rate.");
        }
    }
}
