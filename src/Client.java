import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

public class Client {
    private ArrayList<Product> productsList;
    private String name;
    private Integer karma;
    private BigDecimal money;

    public Client(String name, BigDecimal money){
        this.name = name;
        productsList = new ArrayList<Product>();
        this.karma = new Random().nextInt(100);
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product p){
        productsList.add(p);
        System.out.println("He añadido "+ p.getDescription() + " al carrito.");
    }

    public void cleanList(){
        productsList.clear();
        System.out.println("He vaciado el carrito de la compra");
    }

    public void subOneProduct(Product p){
        productsList.remove(p);
        System.out.println("He eliminado "+ p.getDescription() + " del carrito.");
    }

    public void showMeList(){

        //TODO: transformalo en un foreach y te ahorras la función get y complejidad en el for
        for(int i = 0; i < productsList.size(); i++){
            System.out.println("Producto nº "+ i + " " + productsList.get(i).getDescription());
        }
    }
    /**
     * @Author 
     * @param none
     * @return Boolean makesGoodAction
     * 
     * This method says if the client give the casier a little tip 
     * compares the karma of the client with a random number, if the karma is bigger
     * he will give the tip, and the money will go down
     */
    public Boolean goodAction(){
        Boolean makesGoodAction = false;

        //TODO: Autogenerated Method
        
        return makesGoodAction;
    }
}
