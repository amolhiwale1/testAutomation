package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
* chrome --remote-debugging-port=9222 --user-data-dir="C:\Users\Downloads"
* Change the address of your project and run this command on CMD

* */
public class Test {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "localhost:9222");

        WebDriver driver = new ChromeDriver(options);

        System.out.println("Current title: " + driver.getTitle());
        driver.findElement(By.cssSelector("")).click();
    }
}
