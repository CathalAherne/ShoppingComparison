import java.util.HashMap;
import java.util.Map;

public class ShoppingItem {

    private Map itemDescription;

    public ShoppingItem() {
        itemDescription = new HashMap();
        populateItemName();
    }

    private void populateItemName(){
        itemDescription.put("Brand", null);
        itemDescription.put("Product", null);
        itemDescription.put("Name", null);
        itemDescription.put("Size", null);
    }

    public Map getProperties(){
        return itemDescription;
    }

}
