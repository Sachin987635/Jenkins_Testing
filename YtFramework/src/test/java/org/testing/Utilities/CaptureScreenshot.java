package org.testing.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {
	
	public static void takescreenshot(ChromeDriver driver,String path) throws IOException {
		File file1=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file1, new File(path));
	}
}
