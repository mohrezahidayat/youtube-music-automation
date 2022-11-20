# Automated Testing Youtube Music Web
This automation testing using Selenium + jUnit4 + Cucumber

# Preparation Set Up

1. Copy and paste this command on your terminal
   > git clone https://github.com/mohrezahidayat/youtube-music-automation.git
2. Install editor such: ItelliJ/Eclipse
5. Install JDK 17
6. Set JAVA_HOME
7. Install Maven from terminal for Mac
8. Set Maven from advance system for Windows

# How To Run Test
Follow instruction:
- Open folder automation
- Open terminal
- Copy and paste this command on your terminal
  > mvn clean test -Dcucumber.features="src/test/resources/features/home.feature"
- If want to generate report add command with space
  > -Dcucumber.plugin="html:target/cucumber-html-report.html"

If preparation set up correct then you will see report in folder target
<details><summary>Click to expand</summary>
<img width="1000" alt="Screenshot 2022-11-14 at 21 21 30" src="https://user-images.githubusercontent.com/30076130/202901973-678339f2-9460-41f3-b3c5-ee910c15b816.png">
</details>
<p>