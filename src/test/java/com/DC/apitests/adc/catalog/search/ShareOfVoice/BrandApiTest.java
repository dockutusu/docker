package com.DC.apitests.adc.catalog.search.ShareOfVoice;


import com.DC.testcases.BaseClass;
import com.DC.utilities.ReadConfig;
import com.DC.utilities.SecurityAPI;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrandApiTest extends BaseClass {


    @Test(groups = "NoDataProvider", description = "Share Of Voice Brand API test - Verifying fetching of amazon platfom data for aggregation intervals")
    public void Share_Of_Voice_Brand_Amazon_Api_Test() throws Exception {

        System.out.println("********************* " + ReadConfig.getInstance().getDcAppUrl() + " *********************");
        String token = "Bearer";
        Assert.assertTrue(token.startsWith("doc"), "Token is not correct");

    }

    @Test(groups = "NoDataProvider", description = "Share Of Voice Brand API test - Verifying fetching of amazon platfom data for aggregation intervals")
    public void Share_Of_Voice_Brand_Api_Test() throws Exception {

        String token = "Bearer";
        Assert.assertTrue(token.contains("Bearer"));

    }

    @Test(groups = "NoDataProvider", description = "Share Of Voice Brand API test - Verifying fetching of amazon platfom data for aggregation intervals")
    public void Share_Of_Brand_Amazon_Api_Test() throws Exception {

        String token = "Bearer";
        Assert.assertTrue(token.startsWith("abc"), "Token failure");

    }

    @Test(groups = "NoDataProvider", description = "Share Of Voice Brand API test - Verifying fetching of amazon platfom data for aggregation intervals")
    public void Share_Voice_Brand_Amazon_Api_Test() throws Exception {

        String token = "Bearer";
        Assert.assertTrue(token.contains("Bear"));

    }
}
