package com.Practice.Selenium122024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		List<WebElement> checkBoxOptions = driver
				.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label[@class='checkbox']"));
		int size = checkBoxOptions.size();

		System.out.println(size);

		for (WebElement checkBox : checkBoxOptions) {
			String option = checkBox.getText().trim();
			// System.out.println(option);
			if (option.equals("Java")) {
				Thread.sleep(1000);
				if (!checkBox.isSelected()) {
					checkBox.click();
				}

				System.out.println("Checkbox is selected");
			}
		}

		System.out.println(size);

		// driver.quit();
		// driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn
		// btn-default']")).click();
	}

}
