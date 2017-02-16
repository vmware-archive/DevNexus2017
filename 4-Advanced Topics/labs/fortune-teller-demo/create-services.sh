cf create-service p-config-server standard config-server-poly -c config-server-orig.json
cf create-service p-service-registry standard discovery-service-poly
cf create-service p-circuit-breaker-dashboard standard circuit-breaker-poly
