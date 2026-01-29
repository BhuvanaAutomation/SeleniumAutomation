package com.example.tests;

import com.example.framework.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddRemoveElementsTest extends BaseTest {

    @Test
    public void addAndRemoveElements() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        By addButton = By.xpath("//button[text()='Add Element']");
        By deleteButtons = By.cssSelector(".added-manually");

        // Click Add Element 3 times
        driver.findElement(addButton).click();
        driver.findElement(addButton).click();
        driver.findElement(addButton).click();

        List<WebElement> deletes = driver.findElements(deleteButtons);
        Assert.assertEquals(deletes.size(), 3, "There should be 3 delete buttons after adding elements");

        // Remove one element
        deletes.get(0).click();

        List<WebElement> deletesAfter = driver.findElements(deleteButtons);
        Assert.assertEquals(deletesAfter.size(), 2, "There should be 2 delete buttons after removing one element");
    }
}
