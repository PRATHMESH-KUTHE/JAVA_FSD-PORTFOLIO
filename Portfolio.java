public class Portfolio {

    private String name;
    private String email;
    private String contactNumber;
    private String linkedInUrl;
    private String githubUrl;

    private String[] frontendSkills;
    private String[] backendSkills;
    private String[] devopsSkills;

    public Portfolio(String name, String email, String contactNumber,
                     String linkedInUrl, String githubUrl,
                     String[] frontendSkills, String[] backendSkills, String[] devopsSkills) {
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.linkedInUrl = linkedInUrl;
        this.githubUrl = githubUrl;
        this.frontendSkills = frontendSkills;
        this.backendSkills = backendSkills;
        this.devopsSkills = devopsSkills;
    }

    // getters
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getContactNumber() { return contactNumber; }
    public String getLinkedInUrl() { return linkedInUrl; }
    public String getGithubUrl() { return githubUrl; }
    public String[] getFrontendSkills() { return frontendSkills; }
    public String[] getBackendSkills() { return backendSkills; }
    public String[] getDevopsSkills() { return devopsSkills; }
}
