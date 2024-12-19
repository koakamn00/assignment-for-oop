public class Main {
    public static void main(String[] args) {
        JobListing job1 = new JobListing("Web Developer", "Develop a responsive website", 5000);
        JobListing job2 = new JobListing("Graphic Designer", "Design a logo and branding", 2000);


        Freelancer freelancer1 = new Freelancer("Alice", "Web Developer", 50);
        Freelancer freelancer2 = new Freelancer("Bob", "Graphic Designer", 30);


        Portal portal = new Portal();
        portal.addJobListing(job1);
        portal.addJobListing(job2);
        portal.addFreelancer(freelancer1);
        portal.addFreelancer(freelancer2);


        portal.displayJobListings();
        portal.displayFreelancers();


        portal.compareFreelancers(freelancer1, freelancer2);


        System.out.println(freelancer1.getName() + " can apply for job1: " + freelancer1.canApplyForJob(job1));
        System.out.println(freelancer2.getName() + " can apply for job2: " + freelancer2.canApplyForJob(job2));
    }
}
