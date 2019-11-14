package buying.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase {

  public SessionHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void signin() {
    click(By.xpath("//*[@id='login']/div[3]/div/input"));
  }
}
