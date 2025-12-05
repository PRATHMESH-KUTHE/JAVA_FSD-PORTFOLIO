Name - Prathmesh Kuthe
Roll no. - 64
Batch - A3
Branch - Computer Technology
Reg no - 23071178

------------------------------------------------------------------------------------------------------------------------------------------------
Portfolio  Website
Backend (Java + Spring Ecosystem)
Java
The core programming language used to build the backend logic for handling requests, managing routes, and structuring the server-side architecture.

Spring Boot
-Used for creating a lightweight and fast REST API layer.
-Handles routing, controllers, exception handling, and service layers.
-Provides auto-configuration and production-ready features.


Frontend (React + TypeScript)
-Although the project is Java FSD, the frontend is built using:
-React for component-based UI
-TypeScript for type safety
-Tailwind CSS for styling
-JavaScript / HTML / CSS for structure and scripting
-These integrate with the REST APIs provided by the Spring Boot backend.

DevOps & Deployment (Tools Used)
Git
-Version control for maintaining clean commits and collaborative workflow.

Module 1: Core Java Fundamentals (Backend Foundations)
This module forms the base layer of the backend logic used in the portfolio system.
Concepts Applied
Java program structure
Primitive data types (used for percentage values of skills)
Variables & operators
Control flow (if-else, loops, switch)
Basic validations
Module 1 is Used in the Portfolio Website
-Handling skill percentages (e.g., Java 95%, React 88%) using primitive types
-Looping through skills/projects to generate API responses
-Input validation for contact form submissions
-Using conditions to check if fields are empty or invalid
-Creating the initial structure for backend classes and services


Module 2: OOP + Arrays + Collections + Exception Handling (Main Backend Engine)
This module gives the website its full structure, scalability, and real functionality.
OOP Implementation
My portfolio backend is fully object-oriented:
Classes created:
Skill, Project, Category, ContactMessage, User, Experience
Encapsulation:
All fields are private with getter/setter methods
Inheritance:
Example:
Skill → BackendSkill, FrontendSkill, DevOpsSkill
Polymorphism:
Different skill categories override the display method
Abstraction:
Interface like Displayable for items displayed on UI

Collections Used
Your skill categories and project data are managed with Java Collections:
ArrayList<Project> → Stores all portfolio projects
HashMap<String, Integer> → Skill name → percentage
LinkedList<ContactMessage> → Stores contact form messages
HashSet<String> → Avoid duplicate emails
TreeMap<Integer, Skill> → Sorted skills by percentage
Collections make the backend dynamic and easy to update.

Exception Handling
Custom and built-in exceptions ensure the backend never crashes:
InvalidSkillValueException
EmptyFieldException
DuplicateProjectException



