cf push powerball-docker -o mwrightpivotal/gapowerball -m 2G --no-start
cf set-env powerball-docker CF_TARGET https://api.run.haas-73.pez.pivotal.io
cf set-env powerball-docker MANAGEMENT_CLOUDFOUNDRY_SKIP-SSL-VALIDATION true
cf set-env powerball-docker SECURITY_BASIC_ENABLED false
cf bind-service powerball-docker config-server-poly
cf bind-service powerball-docker discovery-service-poly
cf start powerball-docker 
