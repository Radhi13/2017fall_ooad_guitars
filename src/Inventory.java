/**
* Purpose :This Inventory class creates a linked list of type guitar and it also add functionalities 
* to search guitar by its SearialNumber,Type,Price,Model,Builder,TopWood,BackWood
* 
* @author Radhika Hegde
* @version 1.0
* @since   09-16-2017
*
*/
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//This is the Inventory class which holds the list of guitars 
public class Inventory {
	//Declaring linked list of type Guitar
  private List<Guitar> guitars;

  // This is the constructor
  public Inventory() {
    guitars = new LinkedList<Guitar>();
  }
/*Description: This method is used to add an entry of type Guitar into inventory
 * Input:Single guitar parameters passed from FindGuitarTester
 * Output :No return value
*/
  public void addGuitar(String serialNumber, double price,
                        String builder, String model,
                        String type, String backWood, String topWood) {
    Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }
  
/*Description: This method is used to search a Guitar for a specified serial number from inventory
 * Input:Serial Number
 * Output :Single Guitar
*/
  public Guitar getGuitar(String serialNumber) {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }
 /*Description: This method loops through the linked list of guitars to search a type of guitar.
 * Input:Guitar
 * Output :Single Guitar
 */  
  public Guitar search(Guitar searchGuitar) {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      // Ignore serial number since that's unique
      // Ignore price since that's unique
      String builder = searchGuitar.getBuilder();
      if ((builder != null) && (!builder.equals("")) &&
          (!builder.equals(guitar.getBuilder())))
        continue;
      String model = searchGuitar.getModel();
      if ((model != null) && (!model.equals("")) &&
          (!model.equals(guitar.getModel())))
        continue;
      String type = searchGuitar.getType();
      if ((type != null) && (!searchGuitar.equals("")) &&
          (!type.equals(guitar.getType())))
        continue;
      String backWood = searchGuitar.getBackWood();
      if ((backWood != null) && (!backWood.equals("")) &&
          (!backWood.equals(guitar.getBackWood())))
        continue;
      String topWood = searchGuitar.getTopWood();
      if ((topWood != null) && (!topWood.equals("")) &&
          (!topWood.equals(guitar.getTopWood())))
        continue;
      return guitar;
    }
    return null;
  }
}
