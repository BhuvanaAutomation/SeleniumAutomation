# Selenium 4.x Java TestNG Framework

Quick start for the scaffolded Selenium + Java + TestNG framework.

Prerequisites:
- Java JDK 17+
- Maven

Run tests (default Chrome):

```bash
mvn test -Dbrowser=chrome
# Selenium 4.x Java TestNG Framework

Author: BHUVANA S

Quick start for the scaffolded Selenium + Java + TestNG framework.

Prerequisites:
- Java JDK 17+
- Maven

Run tests (default Chrome):

```bash
mvn test -Dbrowser=chrome
```

Run tests using Firefox:

```bash
mvn test -Dbrowser=firefox
```

Run tests using Edge:

```bash
mvn test -Dbrowser=edge
```

Supported browsers: Chrome, Firefox, Edge (via WebDriverManager).

Files added/modified:
- [pom.xml](pom.xml) – dependencies, author, and surefire config
- [src/main/java/com/example/framework/DriverFactory.java](src/main/java/com/example/framework/DriverFactory.java) – WebDriverManager + ThreadLocal (Chrome/Firefox/Edge)
- [src/main/java/com/example/framework/BaseTest.java](src/main/java/com/example/framework/BaseTest.java) – Test setup/teardown
- [src/test/java/com/example/tests/SampleTest.java](src/test/java/com/example/tests/SampleTest.java) – sample TestNG test
- [src/test/java/com/example/tests/AddRemoveElementsTest.java](src/test/java/com/example/tests/AddRemoveElementsTest.java) – action test (add/remove elements)
- [testng.xml](testng.xml) – TestNG suite
