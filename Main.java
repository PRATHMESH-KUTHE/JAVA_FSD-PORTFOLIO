public class Main {
    public static void main(String[] args) {

        Portfolio p = PortfolioData.getMyPortfolio();

        System.out.println("==== MY PORTFOLIO ====");
        System.out.println("Name: " + p.getName());
        System.out.println("Email: " + p.getEmail());
        System.out.println("Contact: " + p.getContactNumber());
        System.out.println("LinkedIn: " + p.getLinkedInUrl());
        System.out.println("GitHub: " + p.getGithubUrl());

        System.out.println("\nFrontend Skills:");
        for(String skill : p.getFrontendSkills()) {
            System.out.println("- " + skill);
        }

        System.out.println("\nBackend Skills:");
        for(String skill : p.getBackendSkills()) {
            System.out.println("- " + skill);
        }

        System.out.println("\nDevOps Skills:");
        for(String skill : p.getDevopsSkills()) {
            System.out.println("- " + skill);
        }
    }
}
