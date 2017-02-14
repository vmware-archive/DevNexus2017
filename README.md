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
###

*** Agenda
Pre-Req Checkpoint 8:30 -9:00
PCF 101 Internals, concepts, etc. (Preso) 9-9:45
manifest
Deploy an application - staging process (helloworld Demos  ) 9:45 -10:15
Hello Static/Node /PHP/ Ruby / Docker
Idea: cf push dockerApp –o /cloudfoundry/testapp
Scale an application - memory, disk, instances (Demo/Lab) 10:15-10:40
Deploying applications with manifest files (Lab) 
Connecting applications to services - service broker (Demo/Lab) 10:50-11:20
Spring Cloud Connectors and reading environment variables 11:20-11:40
SpringBoot  (need 1.9 apps manager integration) 
PcfDemo rabbit example
Idea: Live Coding of SpringBoot Example +15 mins
Overview of Java buildpack vs Docker( Preso/Demo/Lab 1:00 -1:30
Upgrading buildpacks for deployed applications(Preso)
pcfDemo rabbit example
Thought experiment – how to do this with docker app
Take a poll: what would most prefer and why? (open discussion) 1:30
Application logs & forwarding to syslog drain 1:30 -1:45
Monitoring applications on the platform – PCF Metrics/JMX/Logs (Labs) 1:45:2:15
Blue green styled deployment (Lab)  2:30 -3:00
SCS Lab (optional) 3:00-3:30
SCS/SCDF/Autoscaling (bonus)
Serverless
SCDF (Task/ DSL stream trigger /lambda-ish)
