# 🎯 E-Commerce Test Automation Suite

A comprehensive QA automation framework built with Selenium, TestNG, RestAssured, and Cucumber.

## ✨ Features

- UI Automation with Selenium WebDriver 4.15
- API Testing with RestAssured
- BDD Testing with Cucumber
- Data-Driven Testing with Excel
- CI/CD Integration (GitHub Actions, Jenkins, GitLab CI)
- Parallel Test Execution
- ExtentReports for advanced reporting
- Cross-browser support (Chrome, Firefox, Safari)

## 🛠️ Tech Stack

- Java 11+
- Selenium WebDriver 4.15
- TestNG 7.8
- RestAssured 5.4
- Cucumber 7.14
- Maven 3.6+

## 🚀 Quick Start

```bash
# Clone repository
git clone https://github.com/YOUR_USERNAME/ecommerce-test-automation.git
cd ecommerce-test-automation

# Install dependencies
mvn clean install

# Run all tests
mvn test
```

## 📊 Reports

Test reports are generated in `test-output/reports/index.html`

## 📁 Project Structure

```
ecommerce-test-automation/
├── src/main/java/com/qa/
│   ├── config/          # Configuration
│   ├── pages/           # Page Objects
│   ├── utils/           # Utilities
│   └── api/             # API Clients
├── src/test/java/com/qa/
│   ├── tests/           # Test Classes
│   └── listeners/       # Test Listeners
├── .github/workflows/   # GitHub Actions
└── pom.xml             # Dependencies
```

## 🎯 Key Features

✅ Page Object Model (POM)  
✅ Data-Driven Testing  
✅ API Testing with RestAssured  
✅ CI/CD Pipelines  
✅ Parallel Execution  
✅ Advanced Reporting  
✅ Screenshot on Failure  
✅ Comprehensive Logging  

## 📝 License

MIT License
