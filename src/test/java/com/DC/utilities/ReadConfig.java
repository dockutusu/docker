package com.DC.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    public static ReadConfig singleInstance = null;

    static Properties pro = null;

    private ReadConfig() {
        File src = new File("src/test/resources/environment/staging/config.properties");
        Properties systemProperties = System.getProperties();
        if (!systemProperties.containsKey("baseURL")) {
            try {
                FileInputStream fis = new FileInputStream(src);
                pro = new Properties();
                pro.load(fis);
            } catch (Exception e) {
                System.out.println("Exception is " + e.getMessage());
            }
        }
    }

    public static ReadConfig getInstance() {
        if (singleInstance == null) {
            singleInstance = new ReadConfig();
        }
        return singleInstance;
    }

    public String getUsername() {
        return pro != null ? pro.getProperty("username") : System.getProperty("username");
    }

    public String getPassword() {
        return pro != null ? pro.getProperty("password") : System.getProperty("password");
    }

    public String getSQLDatabaseName() {
        return pro != null ? pro.getProperty("sqlDBName") : System.getProperty("sqlDBName");
    }

    public String getSQLDBUsername() {
        return pro != null ? pro.getProperty("sqlDBusername") : System.getProperty("sqlDBusername");
    }

    public String getSQLDBPassword() {
        return pro != null ? pro.getProperty("sqlDBpassword") : System.getProperty("sqlDBpassword");
    }

    public String getSshHost() {
        return pro != null ? pro.getProperty("sshhost") : System.getProperty("sshhost");
    }

    public String getSshUser() {
        return pro != null ? pro.getProperty("sshuser") : System.getProperty("sshuser");
    }

    public Integer getSshPort() {
        return pro != null ? Integer.parseInt(pro.getProperty("sshport")) : Integer.parseInt(System.getProperty("sshport"));
    }

    public String getSshKey() {
        return pro != null ? pro.getProperty("sshkey") : System.getProperty("sshkey");
    }

    public String getDBHost() {
        return pro != null ? pro.getProperty("dbhost") : System.getProperty("dbhost");
    }

    public Integer getDBPort() {
        return pro != null ? Integer.parseInt(pro.getProperty("dbport")) : Integer.parseInt(System.getProperty("dbport"));
    }

    public String getFilaBaseUri() {
        return pro != null ? pro.getProperty("filaBaseUri") : System.getProperty("filaBaseUri");
    }

    public String getBearerURL() {
        return pro != null ? pro.getProperty("bearerurl") : System.getProperty("bearerurl");
    }

    public String getBearerUserName() {
        return pro != null ? pro.getProperty("bearerusername") : System.getProperty("bearerusername");
    }

    public String getBearerPassword() {
        return pro != null ? pro.getProperty("bearerpassword") : System.getProperty("bearerpassword");
    }

    public String getRedShiftUserName() {
        return pro != null ? pro.getProperty("redshiftusername") : System.getProperty("redshiftusername");
    }

    public String getRedShiftPassword() {
        return pro != null ? pro.getProperty("redshiftpassword") : System.getProperty("redshiftpassword");
    }

    public String getRedShiftURL() {
        return pro != null ? pro.getProperty("redshifturl") : System.getProperty("redshifturl");
    }

    public Integer getRedShiftPort() {
        return pro != null ? Integer.parseInt(pro.getProperty("redshiftport")) : Integer.parseInt(System.getProperty("redshiftport"));
    }

    public Boolean getHeadlessMode() {
        return pro != null ? Boolean.parseBoolean(pro.getProperty("headless")) : Boolean.parseBoolean(System.getProperty("headless"));
    }

    public String getInsightsUsername() {
        return pro != null ? pro.getProperty("insightsusername") : System.getProperty("insightsusername");
    }

    public String getInsightsSupportUsername() {
        return pro != null ? pro.getProperty("insightssupportusername") : System.getProperty("insightssupportusername");
    }

    public String getInsightsPassword() {
        return pro != null ? pro.getProperty("insightspassword") : System.getProperty("insightspassword");
    }

    public String getProductVariantRepoEndpoint() {
        return pro != null ? pro.getProperty("productmasterrepoendpoint") : System.getProperty("productmasterrepoendpoint");
    }

    public String getInsightsApiLoginEndpoint() {
        return pro != null ? pro.getProperty("insightsapiloginendpoint") : System.getProperty("insightsapiloginendpoint");
    }

    public String getInsightsApiSupportuserLoginEndpoint() {
        return pro != null ? pro.getProperty("insightsapisupportuserloginendpoint") : System.getProperty("insightsapisupportuserloginendpoint");
    }

    public String getInsightsDigitalShelfAuditEndpoint() {
        return pro != null ? pro.getProperty("insightsdigitalshelfauditorendpoint") : System.getProperty("insightsdigitalshelfauditorendpoint");
    }

    public String getInsightsAutomatedTestCompanyId() {
        return pro != null ? pro.getProperty("insightsautomatedtestcompanyid") : System.getProperty("insightsautomatedtestcompanyid");
    }

    public String getInsightsAutomatedTestCompanyName() {
        return pro != null ? pro.getProperty("insightsautomatedtestcompanyname") : System.getProperty("insightsautomatedtestcompanyname");
    }

    public String getInsightsAutomatedTestCompanyTwoId() {
        return pro != null ? pro.getProperty("insightsautomatedtestcompanytwoid") : System.getProperty("insightsautomatedtestcompanytwoid");
    }

    public String getInsightsAutomationGridCompanyId() {
        return pro != null ? pro.getProperty("insightsautomationgridtestcompanyid") : System.getProperty("insightsautomationgridtestcompanyid");
    }

    public String getInsightsTaskUIMappingId() {
        return pro != null ? pro.getProperty("insightstaskuimappingid") : System.getProperty("insightstaskuimappingid");
    }

    public String getInsightsFamilyProductId() {
        return pro != null ? pro.getProperty(("testfamilyproductid")) : System.getProperty("testfamilyproductid");
    }

    public String getInsightsBrandProductId() {
        return pro != null ? pro.getProperty(("testbrandproductid")) : System.getProperty("testbrandproductid");
    }

    public String getInsightsProductRepoEndpoint() {
        return pro != null ? pro.getProperty("productRepoendpoint") : System.getProperty("productRepoendpoint");
    }

    public String getEnvironment() {
        return pro != null ? pro.getProperty("environment") : System.getProperty("environment");
    }

    public String getMongodbHosts() {
        return pro != null ? pro.getProperty("mongodbhosts") : System.getProperty("mongodbhosts");
    }

    public String getMongoDatabase() {
        return pro != null ? pro.getProperty("mongodbdatabase") : System.getProperty("mongodbdatabase");
    }

    public String getMongodbUsername() {
        return pro != null ? pro.getProperty("mongodbusername") : System.getProperty("mongodbusername");
    }

    public String getMongodbPassword() {
        return pro != null ? pro.getProperty("mongodbpassword") : System.getProperty("mongodbpassword");
    }

    public String getMongodbReplicaSet() {
        return pro != null ? pro.getProperty("mongodbreplicaset") : System.getProperty("mongodbreplicaset");
    }

    public String getHubExternalGateway() {
        return pro != null ? pro.getProperty("externalGatewayUri") : System.getProperty("externalGatewayUri");
    }

    public String getInsightsAuthServiceEndpoint() {
        return pro != null ? pro.getProperty("insightsauthserviceendpoint") : System.getProperty("insightsauthserviceendpoint");
    }

    public String getInsightsJwtEndpoint() {
        return pro != null ? pro.getProperty("insigthsjwtendpoint") : System.getProperty("insigthsjwtendpoint");
    }

    public String getInsightsCompanySchemaEndpoint() {
        return pro != null ? pro.getProperty("insightscompanyschemaendpoint") : System.getProperty("insightscompanyschemaendpoint");
    }

    public String getBasicAuthValue() {
        return pro != null ? pro.getProperty("basicauthvalue") : System.getProperty("basicauthvalue");
    }

    public String getInsightsCompanyAllCountriesEndpoint() {
        return pro != null ? pro.getProperty("insightscompanyallcountriesendpoint") : System.getProperty("insightscompanyallcountriesendpoint");
    }

    public String getCpgServerUrl() {
        return pro != null ? pro.getProperty("cpgserverurl") : System.getProperty("cpgserverurl");
    }

    public String getHubInsightsUsername() {
        return pro != null ? pro.getProperty("hubinsightsusername") : System.getProperty("username");
    }

    public String getHubInsightsPassword() {
        return pro != null ? pro.getProperty("hubinsightspassword") : System.getProperty("hubinsightspassword");
    }

    public String getMarketShareBaseUri() {
        return pro != null ? pro.getProperty("marketsharebaseuri") : System.getProperty("marketsharebaseuri");
    }

    public String getaAuthServiceBaseUri() {
        return pro != null ? pro.getProperty("authservicebaseuri") : System.getProperty("authservicebaseuri");
    }

    public String getCpgDataServiceUrl() {
        return pro != null ? pro.getProperty("cpgdataserviceurl") : System.getProperty("cpgdataserviceurl");
    }

    public String getCpgEndpoint() {
        return pro != null ? pro.getProperty("cpgendpoint") : System.getProperty("cpgendpoint");
    }

    public String getDcAppUrl() {
        return pro != null ? pro.getProperty("baseCommerceCloudAppUrl") : System.getProperty("baseCommerceCloudAppUrl");
    }

    public String getInsightsEnvironment() {
        return pro != null ? pro.getProperty("insightsenvironment") : System.getProperty("insightsenvironment");
    }

    public String getDcAppFilaLegacyUrl() {
        return pro != null ? pro.getProperty("dcAppFilaLegacyUrl") : System.getProperty("dcAppFilaLegacyUrl");
    }

    public String getDcAppEdgeUrl() {
        return pro != null ? pro.getProperty("dcAppEdgeUrl") : System.getProperty("dcAppEdgeUrl");
    }

    public String getDcAppInsightsUrl() {
        return pro != null ? pro.getProperty("commerceCloudAppInsightsUrl") : System.getProperty("commerceCloudAppInsightsUrl");
    }

    public String getHubFilaUserEmail() {
        return pro != null ? pro.getProperty("hubfilausername") : System.getProperty("hubfilausername");
    }

    public String getHubFilaUserPassword() {
        return pro != null ? pro.getProperty("hubfilapassword") : System.getProperty("hubfilapassword");
    }

    public String getHubInsightsUserEmail() {
        return pro != null ? pro.getProperty("hubinsightsusername") : System.getProperty("hubinsightsusername");
    }

    public String getHubInsightsUserPassword() {
        return pro != null ? pro.getProperty("hubinsightspassword") : System.getProperty("hubinsightspassword");
    }

    public String getHubEdgeUserEmail() {
        return pro != null ? pro.getProperty("hubedgeusername") : System.getProperty("hubedgeusername");
    }

    public String getHubEdgeUserPassword() {
        return pro != null ? pro.getProperty("hubedgepassword") : System.getProperty("hubedgepassword");
    }

    public String getHubEdgeOnlyUserEmail() {
        return pro != null ? pro.getProperty("hubedgeonlyusername") : System.getProperty("hubedgeonlyusername");
    }

    public String getHubEdgeOnlyUserPassword() {
        return pro != null ? pro.getProperty("hubedgeonlypassword") : System.getProperty("hubedgeonlypassword");
    }

    public String getHubFilaInsightsUserEmail() {
        return pro != null ? pro.getProperty("hubfilainsightsusername") : System.getProperty("hubfilainsightsusername");
    }

    public String getHubFilaInsightsUserPassword() {
        return pro != null ? pro.getProperty("hubfilainsightspassword") : System.getProperty("hubfilainsightspassword");
    }

    public String getHubFilaEdgeUserEmail() {
        return pro != null ? pro.getProperty("hubfilaedgeusername") : System.getProperty("hubfilaedgeusername");
    }

    public String getHubFilaEdgeUserPassword() {
        return pro != null ? pro.getProperty("hubfilaedgepassword") : System.getProperty("hubfilaedgepassword");
    }

    public String getHubInsightsEdgeUserEmail() {
        return pro != null ? pro.getProperty("hubinsightsedgeusername") : System.getProperty("hubinsightsedgeusername");
    }

    public String getHubInsightsEdgeUserPassword() {
        return pro != null ? pro.getProperty("hubinsightsedgepassword") : System.getProperty("hubinsightsedgepassword");
    }

    public String getHubFilaInsightsEdgeUserEmail() {
        return pro != null ? pro.getProperty("hubfilainsightsedgeusername") : System.getProperty("hubfilainsightsedgeusername");
    }

    public String getHubFilaInsightsEdgeUserPassword() {
        return pro != null ? pro.getProperty("hubfilainsightsedgepassword") : System.getProperty("hubfilainsightsedgepassword");
    }

    public String getHubFilaOnlyUserEmail() {
        return pro != null ? pro.getProperty("hubfilaonlyusername") : System.getProperty("hubfilaonlyusername");
    }

    public String getHubFilaOnlyUserPassword() {
        return pro != null ? pro.getProperty("hubfilaonlypassword") : System.getProperty("hubfilaonlypassword");
    }

    public String getHubFilaOnlyUserOktaPassword() {
        return pro != null ? pro.getProperty("hubfilaonlyuseroktapassword") : System.getProperty("hubfilaonlyuseroktapassword");
    }

    public String getHubInsightsSupportUsername() {
        return pro != null ? pro.getProperty("hubinsightssupportusername") : System.getProperty("hubinsightssupportusername");
    }

    public String getHubInsightsSupportUserPassword() {
        return pro != null ? pro.getProperty("hubinsightssupportpassword") : System.getProperty("hubinsightssupportpassword");
    }

    public String getPostgresDbHost() {
        return pro != null ? pro.getProperty("postgresdbhost") : System.getProperty("postgresdbhost");
    }

    public String getPostgresDbPort() {
        return pro != null ? pro.getProperty("postgresdbport") : System.getProperty("postgresdbport");
    }

    public String getPostgresDbUsername() {
        return pro != null ? pro.getProperty("postgresdbusername") : System.getProperty("postgresdbusername");
    }

    public String getPostgresDbPassword() {
        return pro != null ? pro.getProperty("postgresdbpassword") : System.getProperty("postgresdbpassword");
    }

    public String getHubEdgeExternalUserEmail() {
        return pro != null ? pro.getProperty("hubedgeexternalusername") : System.getProperty("hubedgeexternalusername");
    }

    public String getHubEdgeExternalUserPassword() {
        return pro != null ? pro.getProperty("hubedgeexternaluserpassword") : System.getProperty("hubedgeexternaluserpassword");
    }

    public String getInsightsAccountServiceUrl() {
        return pro != null ? pro.getProperty("insightsaccountserviceurl") : System.getProperty("insightsaccountserviceurl");
    }

    public String getRedisHost() {
        return pro != null ? pro.getProperty("hubredishost") : System.getProperty("hubredishost");
    }

    public String getRedisPort() {
        return pro != null ? pro.getProperty("hubredisport") : System.getProperty("hubredisport");
    }

    public String getRedisUsername() {
        return pro != null ? pro.getProperty("hubredisusername") : System.getProperty("hubredisusername");
    }

    public String getRedisPassword() {
        return pro != null ? pro.getProperty("hubredispassword") : System.getProperty("hubredispassword");
    }

    public String getHubConnectUserEmail() {
        return pro != null ? pro.getProperty("hubconnectusername") : System.getProperty("hubconnectusername");
    }

    public String getHubConnectUserPassword() {
        return pro != null ? pro.getProperty("hubconnectpassword") : System.getProperty("hubconnectpassword");
    }

    public String getHubConnectUserOktaPassword() {
        return pro != null ? pro.getProperty("hubconnectuseroktapassword") : System.getProperty("hubconnectuseroktapassword");
    }

    public String getSnowflakeDbHost() {
        return pro != null ? pro.getProperty("snowflakedbhost") : System.getProperty("snowflakedbhost");
    }

    public String getSnowflakeDbPort() {
        return pro != null ? pro.getProperty("snowflakedbport") : System.getProperty("snowflakedbport");
    }

    public String getSnowflakeDbUsername() {
        return pro != null ? pro.getProperty("snowflakedbusername") : System.getProperty("snowflakedbusername");
    }

    public String getSnowflakeDbPassword() {
        return pro != null ? pro.getProperty("snowflakedbpassword") : System.getProperty("snowflakedbpassword");
    }

    public String getAggregationServiceBaseUri() {
        return pro != null ? pro.getProperty("aggregationservicebaseuri") : System.getProperty("aggregationservicebaseuri");
    }

    public String getHubFilaQaUserEmail() {
        return pro != null ? pro.getProperty("hubfilaqausername") : System.getProperty("hubfilaqausername");
    }

    public String getHubFilaQaUserPassword() {
        return pro != null ? pro.getProperty("hubfilaqapassword") : System.getProperty("hubfilaqapassword");
    }

    public String getCpgAccountUrl() {
        return pro != null ? pro.getProperty("cpgaccounturl") : System.getProperty("cpgaccounturl");
    }

    public String getSnowflakeDatabase() {
        return pro != null ? pro.getProperty("snowflakedatabase") : System.getProperty("snowflakedatabase");
    }

    public String getSnowflakeWarehouse() {
        return pro != null ? pro.getProperty("snowflakedbwarehouse") : System.getProperty("snowflakedbwarehouse");
    }

    public String getSnowflakeRole() {
        return pro != null ? pro.getProperty("snowflakerole") : System.getProperty("snowflakerole");
    }

}





