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

import org.ow2.proactive.catalog.client.model.BucketMetadata;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-26T17:28:06.013+01:00")
public class BucketControllerApi {
  private ApiClient apiClient;

  public BucketControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BucketControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete the empty buckets
   * 
   * @throws ApiException if fails to make API call
   */
  public void cleanEmptyUsingDELETE() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/buckets";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Creates a new bucket
   * 
   * @param sessionID sessionID (required)
   * @param name The unique name of the Bucket. /n The name of bucket can be between 3 and 63 characters long, and can contain only lower-case characters, numbers, and dashes. /nA bucket&#39;s name must start with a lowercase letter and cannot terminate with a dash (optional)
   * @param owner The name of the user that will own the Bucket (optional, default to GROUP:public-objects)
   * @return BucketMetadata
   * @throws ApiException if fails to make API call
   */
  public BucketMetadata createUsingPOST(String sessionID, String name, String owner) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling createUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/buckets";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
    localVarQueryParams.addAll(apiClient.parameterToPair("owner", owner));

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

    GenericType<BucketMetadata> localVarReturnType = new GenericType<BucketMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete an empty bucket
   * It&#39;s forbidden to delete a non-empty bucket. You need to delete manually all workflows in the bucket before.
   * @param sessionID sessionID (required)
   * @param bucketName bucketName (required)
   * @return BucketMetadata
   * @throws ApiException if fails to make API call
   */
  public BucketMetadata deleteUsingDELETE(String sessionID, String bucketName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling deleteUsingDELETE");
    }
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling deleteUsingDELETE");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


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

    GenericType<BucketMetadata> localVarReturnType = new GenericType<BucketMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a bucket&#39;s metadata by ID
   * 
   * @param bucketName bucketName (required)
   * @param sessionID sessionID (optional)
   * @return BucketMetadata
   * @throws ApiException if fails to make API call
   */
  public BucketMetadata getMetadataUsingGET(String bucketName, String sessionID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getMetadataUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


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

    GenericType<BucketMetadata> localVarReturnType = new GenericType<BucketMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Lists the buckets
   * 
   * @param sessionID sessionID (optional)
   * @param owner The name of the user who owns the Bucket (optional)
   * @param kind The kind(s) of objects that buckets must contain. Multiple kinds can be specified using comma separators (optional)
   * @param contentType The Content-Type of objects that buckets must contain (optional)
   * @param objectTag The tag of objects that buckets must contain (optional)
   * @param objectName The name of objects that buckets must contain (optional)
   * @param bucketName The bucket name contains the value of this parameter (case insensitive) (optional)
   * @return List&lt;BucketMetadata&gt;
   * @throws ApiException if fails to make API call
   */
  public List<BucketMetadata> listUsingGET(String sessionID, String owner, String kind, String contentType, String objectTag, String objectName, String bucketName) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/buckets";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("owner", owner));
    localVarQueryParams.addAll(apiClient.parameterToPair("kind", kind));
    localVarQueryParams.addAll(apiClient.parameterToPair("contentType", contentType));
    localVarQueryParams.addAll(apiClient.parameterToPair("objectTag", objectTag));
    localVarQueryParams.addAll(apiClient.parameterToPair("objectName", objectName));
    localVarQueryParams.addAll(apiClient.parameterToPair("bucketName", bucketName));

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

    GenericType<List<BucketMetadata>> localVarReturnType = new GenericType<List<BucketMetadata>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update bucket owner
   * 
   * @param sessionID sessionID (required)
   * @param bucketName The name of the existing Bucket  (required)
   * @param owner The new name of the user that will own the Bucket (optional)
   * @return BucketMetadata
   * @throws ApiException if fails to make API call
   */
  public BucketMetadata updateBucketOwnerUsingPUT(String sessionID, String bucketName, String owner) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionID' is set
    if (sessionID == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionID' when calling updateBucketOwnerUsingPUT");
    }
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling updateBucketOwnerUsingPUT");
    }
    
    // create path and map variables
    String localVarPath = "/buckets/{bucketName}"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("owner", owner));

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

    GenericType<BucketMetadata> localVarReturnType = new GenericType<BucketMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
