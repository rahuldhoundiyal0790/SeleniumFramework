# Data-Driven Selenium Framework (Java + TestNG)

## Features
- Selenium WebDriver with Page Object Model
- TestNG for test management
- Apache POI for Excel-based data-driven testing
- Maven for dependency management

## Project Structure
```
src/
├── test/
│   ├── java/
│   │   ├── base/          # Base test setup (WebDriver config)
│   │   ├── pages/         # Page Object classes
│   │   ├── tests/         # TestNG test classes
│   │   └── utils/         # Excel utility
test-data/                 # Excel data for tests
pom.xml                    # Maven project file
testng.xml                 # TestNG suite file
```

## How to Run
1. Ensure ChromeDriver is present at `drivers/chromedriver`
2. Run using IntelliJ or command line:
```
mvn clean test
```

## Create Runnable Jar
```
mvn clean package
```
This will create a `.jar` file in the `target` folder.
