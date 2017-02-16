This demo goes through a slightly more complex ployglot scenario.   Instead of going through the standard Fortune Teller Spring Cloud Services example, we will leverage a .NET implementation of the Fortune Teller Service, a Spring Boot version of the UI, and an added service for generating Georgia Powerball lottery numbers.


1. run build-ui.sh

2. run build-service.sh

3. target your org/space using cf cli

4. run create-services.sh

5. 'cf services' to see if all the service instances finished provisioning

6. run push.sh
