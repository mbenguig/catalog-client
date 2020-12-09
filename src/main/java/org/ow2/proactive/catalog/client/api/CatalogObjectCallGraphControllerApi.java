/*
 * CatalogObjectEntity Catalog API
 * The purpose of the catalog is to store ProActive objects.  A catalog is subdivided into buckets.   Each bucket manages zero, one or more versioned ProActive objects.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.ow2.proactive.catalog.client.api;

import com.sun.jersey.api.client.GenericType;

import org.ow2.proactive.catalog.client.ApiException;
import org.ow2.proactive.catalog.client.ApiClient;
import org.ow2.proactive.catalog.client.Configuration;
import org.ow2.proactive.catalog.client.model.*;
import org.ow2.proactive.catalog.client.Pair;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-09T10:37:34.255+01:00")
public class CatalogObjectCallGraphControllerApi {
  private ApiClient apiClient;

  public CatalogObjectCallGraphControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CatalogObjectCallGraphControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the call graph of selected catalog objects in a bucket
   * 
   * @param bucketName bucketName (required)
   * @param sessionID sessionID (optional)
   * @param owner The name of the user who owns the Bucket (optional)
   * @param kind Filter according to kind. (optional)
   * @param contentType Filter according to Content-Type. (optional)
   * @param name Give a list of name separated by comma to get them in the report (optional)
   * @throws ApiException if fails to make API call
   */
  public void getCallGraphForSelectedObjectsUsingGET(String bucketName, String sessionID, String owner, String kind, String contentType, String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getCallGraphForSelectedObjectsUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/call-graph/selected/{bucketName}"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("owner", owner));
    localVarQueryParams.addAll(apiClient.parameterToPair("kind", kind));
    localVarQueryParams.addAll(apiClient.parameterToPair("contentType", contentType));
    localVarQueryParams.addAll(apiClient.parameterToPair("name", name));

    if (sessionID != null)
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get the call graph of all catalog objects in a JPG image
   * 
   * @param sessionID sessionID (optional)
   * @param owner The name of the user who owns the Bucket (optional)
   * @param kind The kind of objects that buckets must contain (optional)
   * @param contentType The Content-Type of objects that buckets must contain (optional)
   * @throws ApiException if fails to make API call
   */
  public void getCallGraphUsingGET(String sessionID, String owner, String kind, String contentType) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/buckets/call-graph";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("owner", owner));
    localVarQueryParams.addAll(apiClient.parameterToPair("kind", kind));
    localVarQueryParams.addAll(apiClient.parameterToPair("contentType", contentType));

    if (sessionID != null)
      localVarHeaderParams.put("sessionID", apiClient.parameterToString(sessionID));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
