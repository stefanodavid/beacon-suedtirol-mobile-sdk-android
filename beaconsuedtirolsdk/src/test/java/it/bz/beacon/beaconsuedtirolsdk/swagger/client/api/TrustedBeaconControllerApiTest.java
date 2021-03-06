/*
 * Beacon Suedtirol API TEST
 * The API for the Beacon Suedtirol project for configuring beacons and accessing beacon data.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package it.bz.beacon.beaconsuedtirolsdk.swagger.client.api;

import it.bz.beacon.beaconsuedtirolsdk.swagger.client.ApiException;
import it.bz.beacon.beaconsuedtirolsdk.swagger.client.model.Beacon;
import it.bz.beacon.beaconsuedtirolsdk.swagger.client.model.BeaconBatteryLevelUpdate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TrustedBeaconControllerApi
 */
@Ignore
public class TrustedBeaconControllerApiTest {

    private final TrustedBeaconControllerApi api = new TrustedBeaconControllerApi();

    
    /**
     * Update battery level of beacon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUsingPATCH1Test() throws ApiException {
        BeaconBatteryLevelUpdate batteryLevelUpdate = null;
        String id = null;
        Beacon response = api.updateUsingPATCH1(batteryLevelUpdate, id);

        // TODO: test validations
    }
    
}
