package buying.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void selectSearch() {
    click(By.xpath("//*[@id='main-menu']/div[2]/div/i"));
  }

  public void searchItem(String item) {
    click(By.xpath("//*[@id='pop-in-search-term']"));
    type(By.xpath("//*[@id='pop-in-search-term']"), item);
    click(By.xpath("//*[@id='menu-pop-in']/div[2]/div[1]/a[2]/i"));
  }

  public void selectItem() {
    click(By.xpath("//*[@id='product156418']/div/a[1]"));
  }

  public void selectSize() {
    click(By.xpath("//*[@id='add_to_bag_desktop']/div[1]/div[2]/select/option[2]"));
  }

  public void addToBag() {
    click(By.xpath("//*[@id='add-to-bag-mob']/div/fieldset/input"));
    click(By.xpath("//*[@title='Checkout']"));
  }

  public void acceptCookie() {
    click(By.cssSelector("a.cc-btn:nth-child(2)"));
  }

}
