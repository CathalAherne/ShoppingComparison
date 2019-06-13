import java.util.HashMap;
import java.util.Map;

public class ShoppingItem {

    private Map itemDescription;

    public ShoppingItem(String brand, String product, String name, int size) {
        itemDescription = new HashMap();
        populateItemName(brand, product, name, size);
    }

    private void populateItemName(String brand, String product, String name, int size){
        itemDescription.put("brand", ((brand == null) ? null: brand));
        itemDescription.put("product", ((brand == null) ? null: product));
        itemDescription.put("name", ((brand == null) ? null: name));
        itemDescription.put("size", ((brand == null) ? null: Integer.toString(size)));
    }

    public Map getProperties(){
        return itemDescription;
    }

}
