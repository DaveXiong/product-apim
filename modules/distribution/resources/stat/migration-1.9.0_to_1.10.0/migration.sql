
  
create temporary table APIThrottleSummaryData using CarbonJDBC options (dataSource "WSO2AM_STATS_DB", tableName "API_THROTTLED_OUT_SUMMARY");
CREATE TEMPORARY TABLE THROTTLED_OUT_FINAL_SUMMARY USING CarbonAnalytics OPTIONS (tableName "API_THROTTLED_OUT_SUMMARY",
  schema "api string -i,
  api_version string -i,
  context string -i,
  apiPublisher string -i,
  applicationName string -i,
  tenantDomain string -i,
  year int -i,
  month int -i,
  day int -i,
  week int -i,
  time string -i,
  success_request_count int -i,
  throttleout_count int -i,
  max_request_time long -i,
  api_apiPublisher_applicationName_facet facet -i,
  applicationName_facet facet -i",
  primaryKeys "api,api_version,context,apiPublisher,applicationName,tenantDomain,year,month,day"
);

insert into table THROTTLED_OUT_FINAL_SUMMARY select 
api,api_version,context,apiPublisher,applicationName,tenantDomain,year,month,
day,week,time,COALESCE(success_request_count,0),COALESCE(throttleout_count,0),
COALESCE(timestamp(time),0),concat( api,concat(",",concat(apiPublisher,concat(",",applicationName)) )),
applicationName from APIThrottleSummaryData; 




                            


  

  CREATE TEMPORARY TABLE API_REQUEST_SUMMARY_FINAL USING CarbonAnalytics OPTIONS (tableName "API_REQUEST_SUMMARY",
  schema "api string -i,
  api_version string -i,
  version string -i,
  apiPublisher string -i,
  consumerKey string -i,
  userId string -i,
  context string -i,
  max_request_time long -i,
  total_request_count int -i,
  hostName string -i,
  year int -i,
  month int -i,
  day int -i,
  time string -i,
  key_api_facet facet -i,
  key_userId_facet facet -i,
  api_version_userId_facet facet -i,
  api_version_userId_apiPublisher_facet facet -i,
  api_version_userId_context_facet facet -i",
  primaryKeys "api,api_version,version,apiPublisher,consumerKey,userId,context,hostName,year,month,day"
  );

  create temporary table APIRequestSummaryData using CarbonJDBC options (dataSource "WSO2AM_STATS_DB", tableName "API_REQUEST_SUMMARY");

  insert into table API_REQUEST_SUMMARY_FINAL select api, api_version,version, apiPublisher,
  consumerKey,
  userId,
  context,
  max_request_time,
  total_request_count,
  hostName,
  year,
  month,
  day,
  time,
  concat(concat(consumerKey,","),api),
  concat(concat(consumerKey,","),userId),
  concat(concat(api,","),concat(concat(version,","),userId)),
  concat(concat(api,","),concat(concat(version,","),concat(concat(userId,","),apiPublisher))),
  concat(concat(api,","),concat(concat(version,","),concat(concat(userId,","),context)))
  from APIRequestSummaryData;

  















  create temporary table APIVersionUsageSummaryData using CarbonJDBC options (dataSource "WSO2AM_STATS_DB", tableName "API_VERSION_USAGE_SUMMARY");

  CREATE TEMPORARY TABLE API_VERSION_USAGE_SUMMARY_FINAL USING CarbonAnalytics OPTIONS (tableName "API_VERSION_USAGE_SUMMARY",
  schema "api string -i,
  version string -i,
  apiPublisher string -i,
  context string -i,
  total_request_count int -i,
  hostName string -i,
  year int -i,
  month int -i,
  day int -i,
  time string -i,
  max_request_time long -i,
  api_version_context_facet facet -i",
  primaryKeys "api,version,apiPublisher,context,hostName,year,month,day"
  );

  insert into table API_VERSION_USAGE_SUMMARY_FINAL select api,version,apiPublisher,context,total_request_count,hostName,
  year,  month,  day,  time,  timestamp(time),  concat(concat(api,","),concat(concat(version,","),context)) 
  from APIVersionUsageSummaryData; 















create temporary table APIResourcePathUsageSummaryData using CarbonJDBC options (dataSource "WSO2AM_STATS_DB", tableName "API_Resource_USAGE_SUMMARY");

  CREATE TEMPORARY TABLE API_Resource_USAGE_SUMMARY_FINAL USING CarbonAnalytics OPTIONS (tableName "API_Resource_USAGE_SUMMARY",
  schema "api string -i,
  version string -i,
  apiPublisher string -i,
  consumerKey string -i,
  resourcePath string -i,
  context string -i,
  method string -i,
  total_request_count int -i,
  hostName string -i,
  year int -i,
  month int -i,
  day int -i,
  time string -i,
  max_request_time long -i,
  key_api_method_path_facet facet -i,
  api_version_context_method_facet facet -i",
  primaryKeys "api,version,apiPublisher,consumerKey,context,resourcePath,method,hostName,year,month,day"
  );

  insert into table API_Resource_USAGE_SUMMARY_FINAL select
  api,version,apiPublisher,COALESCE(consumerKey,''),
  resourcePath,context,method,total_request_count,hostName,
  year,  month,  day,  time,
  timestamp(time),
  concat(consumerKey,concat(",", concat(api, concat(",",concat(method, concat(",",resourcePath)))))),
  concat(api,concat(",", concat(version, concat(",",concat(context, concat(",",method))))))
  from APIResourcePathUsageSummaryData;






create temporary table APIResponseSummaryData using CarbonJDBC options (dataSource "WSO2AM_STATS_DB", tableName "API_RESPONSE_SUMMARY");

  CREATE TEMPORARY TABLE API_RESPONSE_SUMMARY_FINAL USING CarbonAnalytics OPTIONS (tableName "API_RESPONSE_SUMMARY",
  schema "api_version string -i,
  apiPublisher string -i,
  context string -i,
  serviceTime int -i,
  total_response_count int -i,
  hostName string -i,
  year int -i,
  month int -i,
  day int -i,
  time string -i,
  max_request_time long -i,
  api_version_context_facet facet -i",
  primaryKeys "api,version,apiPublisher,context,hostName,year,month,day"
  );

  insert into table API_RESPONSE_SUMMARY_FINAL select
  api_version,  COALESCE(apiPublisher,''),  context,  serviceTime,  total_response_count,
  hostName,  year,  month,  day,  time,  timestamp(time), concat(api_version,concat(",", concat(api_version, concat(",",context))))
  from APIResponseSummaryData;








create temporary table APIFaultSummaryData using CarbonJDBC options (dataSource "WSO2AM_STATS_DB", tableName "API_FAULT_SUMMARY");

  CREATE TEMPORARY TABLE API_FAULT_SUMMARY_FINAL USING CarbonAnalytics OPTIONS (tableName "API_FAULT_SUMMARY",
  schema "api string -i,
  version string -i,
  apiPublisher string -i,
  consumerKey string -i,
  context string -i,
  total_fault_count int -i,
  hostName string -i,
  year int -i,
  month int -i,
  day int -i,
  time string -i,
  max_request_time long -i,
  consumerKey_api_facet facet -i,
  api_version_apiPublisher_context_facet facet -i",
  primaryKeys "api,version,apiPublisher,consumerKey,context,hostName,year,month,day"
  );

  insert into table API_FAULT_SUMMARY_FINAL select
  api,version,apiPublisher,COALESCE(consumerKey,''),context,  total_fault_count,
  hostName,year,  month,  day,  time, timestamp(time), concat(consumerKey,concat(",",api)),
  concat(api,concat(",", concat(version, concat(",",concat(apiPublisher, concat(",",context))))))
  from APIFaultSummaryData;



  create temporary table APIDestinationDataSummaryData using CarbonJDBC options (dataSource "WSO2AM_STATS_DB", tableName "API_DESTINATION_SUMMARY");
  CREATE TEMPORARY TABLE API_DESTINATION_SUMMARY_FINAL USING CarbonAnalytics OPTIONS (tableName "API_DESTINATION_SUMMARY",
  schema "api string -i,
  version string -i,
  apiPublisher string -i,
  context string -i,
  destination string -i,
  total_request_count int -i,
  hostName string -i,
  year int -i,
  month int -i,
  day int -i,
  time string -i,
  max_request_time long -i,
  api_version_context_dest_facet facet -i",
  primaryKeys "api,version,apiPublisher,context,destination,hostName,year,month,day"
  );

  insert into table API_DESTINATION_SUMMARY_FINAL select
  api,version,apiPublisher, context,destination,total_request_count,hostName,
  year,  month,  day,  time, timestamp(time),
  concat(api,concat(",", concat(version, concat(",",concat(context, concat(",",destination))))))
  from APIDestinationDataSummaryData;

