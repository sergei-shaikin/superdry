package buying.appmanager;

import buying.model.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskHelper extends HelperBase {

  public TaskHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void selectCountry() {
    click(By.xpath("//*[@value='RUS']"));
  }

  public void fillDeliveryAddress(Data data) {
    type(By.xpath("//*[@id='shipping_first_name']"), data.getShippingFirstName());
    type(By.xpath("//*[@id='shipping_last_name']"), data.getShippingLastName());
    type(By.xpath("//*[@id='billing_phone']"), data.getBillingPhone());
    type(By.xpath("//*[@id='billing_email']"), data.getBillingEmail());
    type(By.xpath("//*[@id='billing_confirmemail']"), data.getConfirmEmail());
    type(By.xpath("//*[@id='shipping_address_1']"), data.getShippingAddress());
    WebElement element = wd.findElement(By.xpath("//*[@id='shipping_zip']"));
    Actions actions = new Actions(wd);
    actions.moveToElement(element).click().perform();
    type(By.xpath("//*[@id='shipping_zip']"), data.getShippingZip());
    type(By.xpath("//*[@name='shipping_city']"), data.getShippingCity());
  }

  public void checkoutAsAGuest() {
    click(By.xpath("//*[@id='main-body']/div/div/div[2]/div[2]/div/div[2]/a"));
  }

  public void selectDelivery() {
    click(By.xpath("//*[@id='delivery-type-international']"));
  }

  public void fillPaymentDetails(Data data){
    type(By.xpath("//*[@id='order_payment_name']"), data.getNameOnCard());
    WebElement element = wd.findElement(By.xpath("//*[@id='card-number']"));
    Actions actions = new Actions(wd);
    actions.moveToElement(element).click().perform();
    type(By.xpath("//*[@id='card-number']"), data.getCardNumber());
    type(By.xpath("//*[@id='cvv']"), data.getSecurityCode());
  }

  public void selectExpiryDate() {
    click(By.xpath("//*[@id='selected-payment-method']/div/div[1]/div[2]/div/div[1]/div/select[1]/option[2]"));
    click(By.xpath("//*[@id='selected-payment-method']/div/div[1]/div[2]/div/div[1]/div/select[2]/option[3]"));
  }

  public void buyNow() {
    click(By.xpath("//*[@id='submit']"));
  }

}
