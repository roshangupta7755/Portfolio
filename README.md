# Personal Portfolio Website

A personal portfolio website built using **Java Spring Boot, Thymeleaf, HTML, CSS, and JavaScript**.

## About the Project

This project showcases my personal information, introduction, technical skills, and projects through a responsive portfolio website.

## Live Demo

🚀 **Live Website:** https://portfolio-5rt4.onrender.com/

**Deployment Platform:** Render

## Technologies Used

- Java
- Spring Boot
- Thymeleaf
- HTML5
- CSS3
- JavaScript
- Maven
- Git & GitHub
- Render (Deployment)

## Project Features

- Navigation Bar
- Hero Section
- About Section
- Skills Section
- Profile Image
- Responsive UI
- Dynamic content rendering using Spring Boot and Thymeleaf
- Reusable Thymeleaf fragments

## Project Structure

```text
Portfolio/
│
├── docs/
│   └── screenshots/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── Portfolio/
│   │   │               ├── controller/
│   │   │               │   └── HomeController.java
│   │   │               │
│   │   │               ├── model/
│   │   │               │   └── Skill.java
│   │   │               │
│   │   │               └── PortfolioApplication.java
│   │   │
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── css/
│   │       │   ├── images/
│   │       │   └── js/
│   │       │
│   │       ├── templates/
│   │       │   ├── fragments/
│   │       │   │   └── layout.html
│   │       │   │
│   │       │   └── index.html
│   │       │
│   │       └── application.properties
│   │
│   └── test/
│
├── .gitignore
├── Dockerfile
├── README.md
└── pom.xml
```

## Run Locally

### Prerequisites

- Java JDK 17 or compatible version configured in the project
- Maven (optional, Maven Wrapper is included)

### Steps

1. Clone the repository:

```bash
git clone https://github.com/roshangupta7755/Portfolio.git
```

2. Navigate to the project directory:

```bash
cd Portfolio
```

3. Run the application.

**For Windows:**

```powershell
.\mvnw.cmd spring-boot:run
```

**For Linux / macOS:**

```bash
./mvnw spring-boot:run
```

4. Open your browser:

```text
http://localhost:8080
```

## Deployment

The application is deployed on **Render**.

Live URL: https://portfolio-5rt4.onrender.com/

## Screenshots

Project screenshots will be available in:

```text
docs/screenshots/
```

## Developer

**Roshan Gupta**

BCA Student | Java & Web Development

GitHub: https://github.com/roshangupta7755

---

*Built with Java Spring Boot and Thymeleaf.*
