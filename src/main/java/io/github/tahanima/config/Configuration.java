package io.github.tahanima.config;

import org.aeonbits.owner.Config;

/**
 * Mapping interface for the global parameters contained within config.properties file.
 *
 * @author tahanima
 */
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties", "classpath:config.properties"})
public interface Configuration extends Config {
    /**
     * @return a string containing the browser name
     */
    String browser();

    /**
     * @return a string containing the base url of the AUT
     */
    @Key("base.url")
    String baseUrl();

    /**
     * @return a boolean containing the choice whether the browser will run in headless mode
     */
    Boolean headless();

    /**
     * @return an integer containing the slow motion value
     */
    @Key("slow.motion")
    int slowMotion();

    /**
     * @return an integer containing the timeout value
     */
    @Key("timeout")
    int timeout();

    /**
     * @return a string containing the base path to store all the test data
     */
    @Key("base.test.data.path")
    String baseTestDataPath();

    /**
     * @return a string containing the base path to store all the test reports
     */
    @Key("base.report.path")
    String baseReportPath();

    /**
     * @return a string containing the base path to store all the failed test screenshots
     */
    @Key("base.screenshot.path")
    String baseScreenshotPath();
}
