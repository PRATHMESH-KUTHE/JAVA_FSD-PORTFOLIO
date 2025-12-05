import { Helmet } from "react-helmet-async";
import Navbar from "@/components/Navbar";
import HeroSection from "@/components/HeroSection";
import AboutSection from "@/components/AboutSection";
import SkillsSection from "@/components/SkillsSection";
import ContactSection from "@/components/ContactSection";
import Footer from "@/components/Footer";

const Index = () => {
  return (
    <>
      <Helmet>
        <title>Prathmesh Kuthe | Java Full Stack Developer</title>
        <meta
          name="description"
          content="Java Full Stack Developer specializing in Spring Boot, React, and modern web technologies. Building robust, scalable enterprise applications."
        />
        <meta
          name="keywords"
          content="Java Developer, Full Stack Developer, Spring Boot, React, Web Development, Software Engineer"
        />
      </Helmet>

      <div className="min-h-screen bg-background">
        <Navbar />
        <main>
          <HeroSection />
          <AboutSection />
          <SkillsSection />
          <ContactSection />
        </main>
        <Footer />
      </div>
    </>
  );
};

export default Index;
