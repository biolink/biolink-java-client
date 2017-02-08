/**
 * BioLink API
 * API integration layer for linked biological objects.   __Source:__ https://github.com/monarch-initiative/biolink-api/
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Association;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CamApi
 */
public class CamApiTest {

    private final CamApi api = new CamApi();

    
    /**
     * Returns list of models
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActivityCollectionTest() throws ApiException {
        String contributor = null;
        String title = null;
        // api.getActivityCollection(contributor, title);

        // TODO: test validations
    }
    
    /**
     * Returns list of matches
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstanceTest() throws ApiException {
        String id = null;
        String contributor = null;
        String title = null;
        // List<Association> response = api.getInstance(id, contributor, title);

        // TODO: test validations
    }
    
    /**
     * Returns a complete model
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelTest() throws ApiException {
        String id = null;
        // api.getModel(id);

        // TODO: test validations
    }
    
    /**
     * Returns list of ALL models
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelCollectionTest() throws ApiException {
        // api.getModelCollection();

        // TODO: test validations
    }
    
    /**
     * Returns list of all properties used across all models
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelCollection_0Test() throws ApiException {
        String contributor = null;
        String title = null;
        // api.getModelCollection_0(contributor, title);

        // TODO: test validations
    }
    
    /**
     * Returns list property-values for all models
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelCollection_1Test() throws ApiException {
        String contributor = null;
        String title = null;
        // api.getModelCollection_1(contributor, title);

        // TODO: test validations
    }
    
    /**
     * Returns list of models matching query
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelCollection_2Test() throws ApiException {
        String contributor = null;
        String title = null;
        // api.getModelCollection_2(contributor, title);

        // TODO: test validations
    }
    
    /**
     * Returns list of all instances
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelContibutorsTest() throws ApiException {
        // api.getModelContibutors();

        // TODO: test validations
    }
    
    /**
     * Returns list of all contributors across all models
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelContibutors_0Test() throws ApiException {
        // api.getModelContibutors_0();

        // TODO: test validations
    }
    
    /**
     * Returns list of models
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPhysicalInteractionTest() throws ApiException {
        String contributor = null;
        String title = null;
        // api.getPhysicalInteraction(contributor, title);

        // TODO: test validations
    }
    
}
