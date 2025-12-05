public class PortfolioData {

    public static Portfolio getMyPortfolio() {

        return new Portfolio(
                "Prathmesh Kuthe",
                "yourEmail@example.com",
                "9876543210",
                "https://www.linkedin.com/in/your-profile",
                "https://github.com/your-github",

                new String[]{"HTML", "CSS", "JavaScript", "React"},
                new String[]{"Java", "Spring Boot", "MySQL"},
                new String[]{"Docker", "GitHub Actions", "AWS"}
        );
    }
}
