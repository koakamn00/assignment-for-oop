public class Freelancer {
    private String name;
    private String skill;
    private double rate;


    public Freelancer(String name, String skill, double rate) {
        this.name = name;
        this.skill = skill;
        this.rate = rate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


    public String toString() {
        return "Freelancer Name: " + name + ", Skill: " + skill + ", Rate: $" + rate + "/hour";
    }

    public boolean canApplyForJob(JobListing job) {
        return this.rate <= job.getBudget();
    }
}
