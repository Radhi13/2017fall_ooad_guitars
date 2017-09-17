/*
* Purpose :This Guitar Class adds arguments of guitar and adds the functionalities 
* like getting the Price,Model,Type,TopWood,BackWood
* 
* @author Radhika Hegde
* @version 1.0
* @since   09-15-2017
*
*/
// This is the public Guitar class
public class Guitar {
  // Guitar class has seven arguments 
  private String serialNumber, builder, model, type, backWood, topWood;
  private double price;
  
  //The Guitar has one Constructor
  public Guitar(String serialNumber, double price,
                String builder, String model, String type,
                String backWood, String topWood) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }
/* This method returns the Serialnumber of Guitar
 */
  public String getSerialNumber() {
    return serialNumber;
  }
  /* This method returns the Price of Guitar
   */
  public double getPrice() {
    return price;
  }
  /* This method set the newPrice of Guitar passed through arrguments
   * Input: Float
   */
  public void setPrice(float newPrice) {
    this.price = newPrice;
  }
  /* This method returns the Builder of Guitar
   */
  public String getBuilder() {
    return builder;
  }
  /* This method returns the Model of Guitar
   */
  public String getModel() {
    return model;
  }
  /* This method returns the Type of Guitar
   */
  public String getType() {
    return type;
  }
  /* This method returns the BackWood of Guitar
   */
  public String getBackWood() {
    return backWood;
  }
  /* This method returns the TopWood of Guitar
   */
  public String getTopWood() {
    return topWood;
  }
}
