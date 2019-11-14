package buying.model;

public class Data {
  private final String shippingFirstName;
  private final String shippingLastName;
  private final String billingPhone;
  private final String billingEmail;
  private final String confirmEmail;
  private final String shippingAddress;
  private final String shippingCity;
  private final String shippingZip;
  private final String nameOnCard;
  private final String cardNumber;
  private final String securityCode;

  public Data(String shippingFirstName, String shippingLastName, String billingPhone, String billingEmail,
              String confirmEmail, String shippingAddress, String shippingZip, String shippingCity,
              String nameOnCard, String cardNumber, String securityCode) {
    this.shippingFirstName = shippingFirstName;
    this.shippingLastName = shippingLastName;
    this.billingPhone = billingPhone;
    this.billingEmail = billingEmail;
    this.confirmEmail = confirmEmail;
    this.shippingAddress = shippingAddress;
    this.shippingCity = shippingCity;
    this.shippingZip = shippingZip;
    this.nameOnCard = nameOnCard;
    this.cardNumber = cardNumber;
    this.securityCode = securityCode;
  }

  public String getShippingFirstName() {
    return shippingFirstName;
  }

  public String getBillingPhone() {
    return billingPhone;
  }

  public String getShippingLastName() {
    return shippingLastName;
  }

  public String getBillingEmail() {
    return billingEmail;
  }

  public String getShippingAddress() {
    return shippingAddress;
  }

  public String getShippingCity() {
    return shippingCity;
  }

  public String getShippingZip() {
    return shippingZip;
  }

  public String getNameOnCard() {
    return nameOnCard;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public String getSecurityCode() {
    return securityCode;
  }

  public String getConfirmEmail() {
    return confirmEmail;
  }
}
