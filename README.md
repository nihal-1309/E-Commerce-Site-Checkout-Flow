# E-Commerce-Site-Checkout-Flow

1. Tech Stack Used 
	 •	Java
	 •	Selenium WebDriver
	 •	TestNG
	 •	Maven
	 •	Page Object Model (POM)
	 •	WebDriverManager
2. How to install dependencies
   Step 1: Visit Maven Repository Website
   Go to https://mvnrepository.com/ in your browser. This site contains all the major libraries you might need for Java projects—like           Selenium and TestNG.
   Step 2: Search for Each Dependency
   Use the search bar at the top of the Maven Repository site:
	•	For Selenium, type “selenium java” and hit Enter.
	•	For TestNG, type “testng” and hit Enter.
  Step 3: Copy the Maven Snippet
	•	Click the search result for the latest stable version of each dependency (Selenium Java and TestNG).
	•	Scroll down to the section labeled “Maven” on the library’s page.
	•	You’ll see a code snippet like this for Selenium:
<----------------------------------------------------->
  <dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.18.1</version>
 </dependency>

 <------------------------------------------------------>
  And like this for TestNG:
<------------------------------------------------------>
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.9.0</version>
    <scope>test</scope>
</dependency>
<------------------------------------------------------>


Copy each snippet separately.
Step 4: Add Dependencies to Your `pom.xml`
	•	Open the `pom.xml` file in the root directory of your Maven project in any text editor or IDE.
	•	Locate the `<dependencies>` section inside your `pom.xml` file.
	•	Paste the copied `<dependency>...</dependency>` blocks inside the `<dependencies>` tag, each on its own (not nested).
Your dependencies section should look like this (with both blocks present):

<------------------------------------------------------>

 <dependencies>
    <!-- Selenium dependency -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.18.1</version>
    </dependency>

    <!-- TestNG dependency -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.9.0</version>
        <scope>test</scope>
    </dependency>
    <!-- You can add more dependencies similarly! -->
 </dependencies>
 <------------------------------------------------------>

 Save the `pom.xml` file after pasting in the dependencies.

 Step 5: Let Maven Download the Libraries
 When you save your `pom.xml` and build your project (`mvn clean install` or just open the project in your IDE as a Maven project), Maven   will automatically download Selenium, TestNG, and any other dependencies you add.


3. To Run the Tests
  Go to the Tests package and go inside CheckoutTest.java and then at the top of the window there is option to run the the project and tests.
