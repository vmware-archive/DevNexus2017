cf push powerball-docker -o mwrightpivotal/gapowerball -m 2G --no-start
cf set-env powerball-docker CF_TARGET https://api.run.haas-68.pez.pivotal.io
cf bind-service powerball-docker config-service-poly
cf bind-service powerball-docker discovery-service-poly
cf start powerball-docker 
