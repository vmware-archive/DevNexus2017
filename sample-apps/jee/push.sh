mvn clean package -DskipTests -Dmaven.test.skip=true
cf push jee --random-route -m 512M -p target/moviefun.war
