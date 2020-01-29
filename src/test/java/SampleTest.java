import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends ConnectionString {

    @Test
    public void enteringEmployeeInformation() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support." +
                "v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout")).click();
        driver.findElement(By.id("etEmployeeId")).sendKeys("SASTestReg001");
        driver.findElement(By.id("etJoiningDate")).sendKeys("1 Nov 2019");
        driver.findElement(By.id("etFullName")).sendKeys("SAS Test EmpA");
        driver.findElement(By.id("etDesignation")).sendKeys("SAS Test Designation A");
        driver.findElement(By.id("etMobileNo")).sendKeys("03362512468");
        driver.findElement(By.id("etBasicPay")).sendKeys("30000");
        driver.findElement(By.id("etAddress")).sendKeys("SAS Test Address A");
        driver.findElement(By.id("imgOther")).click();
    }


}
