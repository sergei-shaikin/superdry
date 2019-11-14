package buying.tests;

import org.testng.annotations.Test;
import buying.model.Data;

public class TaskPerformingTests extends TestBase {

  @Test
  public void testTaskPerforming() throws InterruptedException {
    app.getNavigationHelper().acceptCookie();
    app.getNavigationHelper().selectSearch();
    app.getNavigationHelper().searchItem("Ethan Classic Straight Jeans");
    app.getNavigationHelper().selectItem();
    app.getNavigationHelper().selectSize();
    app.getNavigationHelper().addToBag();
    app.getTaskHelper().checkoutAsAGuest();
    app.getTaskHelper().selectDelivery();
    app.getTaskHelper().selectCountry();
    app.getTaskHelper().fillDeliveryAddress(new Data("Sergei", "Shaikin",
            "+79876391174", "shaikins@yahoo.com", "shaikins@yahoo.com",
            "Matrosa Zheleznyaka 15", "197343", "Saint Petersburg",
            null, null, null));
    app.getTaskHelper().fillPaymentDetails(new Data(null, null,
            null, null, null, null,
            null,null, "Sergei Shaikin", "4444333322221111", "123"));
    app.getTaskHelper().selectExpiryDate();
    app.getTaskHelper().buyNow();
  }
}
