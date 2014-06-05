To reproduce:
mvn jetty:run
curl http://localhost:8080/issue-320/api/outages/next

Note that the Json properties match those specified in @JsonProperty
annotations within /SwaggerMvcIssue320/src/main/java/net/tataryn/swagger/issue320/model/rest/OutageDto.java


Now in a browser load:
http://localhost:8080/issue-320/swagger

Drill down into the Outages operation, and note the ApiModel properties
are not the same as the property names specified in the @JsonProperty
annotations
