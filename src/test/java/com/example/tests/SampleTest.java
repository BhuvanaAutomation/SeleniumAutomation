package com.example.tests;

import com.example.framework.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test
    public void exampleDomainTitle() {
        driver.get("https://example.com");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Example Domain"), "Title should contain 'Example Domain'");
    }
}
