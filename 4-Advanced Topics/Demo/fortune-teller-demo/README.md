This demo goes through a slightly more complex ployglot scenario.   Instead of using the well known, all Spring Boot, Fortune Teller Spring Cloud Services example (https://github.com/spring-cloud-samples/fortune-teller), we will leverage a .NET implementation of the Fortune Teller Service that leverages http://steeltoe.io, a Spring Boot version of the UI, and an added service for generating Georgia Powerball lottery numbers deployed from a Docker image.


1. review and run build-ui.sh

2. review and run build-service.sh

3. target your org/space using cf cli

4. review and run create-services.sh

5. 'cf services' to see if all the service instances finished provisioning

6. 'cf push -f manifest-devnexus.yml' <- this pushes the UI service and the backend Fortune Service.  Make sure CF_TARGET points to the correct Cloud Foundry API endpoint in manifest.yml

7. review and run push-docker-powerball.sh

Note: the project includes build-docker-service.sh.  This not needed since the push will pull from a previously built docker image on Ducker Hub
