# DevNexus 2107 - Cloud, Containers, Serverless Computing, Docker : Oh my!

## Pre-Requisites
•Windows or Mac OS

## Java Dependencies
* Java JDK 1.7+
* Maven / Gradle
* PCF CLI (https://console.run.pivotal.io/2/tools)
* PCF account (Pivotal Web Services “Trial account” will be best)
	Go to run.pivotal.io and click the “Sign up for free” button.
* Your preferred git client or https://git-scm.com/downloads
* Chrome or Firefox….(not IE)

## Smoke-test
From your command line:
```
git clone https://github.com/vinayu/CloudNativeArchitectureWorkshop.git
cd CloudNativeArchitectureWorkshop
cf push My-Spring-Music-[##] –p Sample-apps/spring-music/spring-music.war
```
(where you replace [##] with your initials in order to create a unique hostname.)
