import java.util.ArrayList;

public class Client {
    private ArrayList<Product> productsList;
    private String name;

    public Client(String name){
        this.name = name;
        productsList = new ArrayList<Product>();
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
        for(int i = 0; i < productsList.size(); i++){
            System.out.println("Producto nº "+ i + " " + productsList.get(i).getDescription());
        }
    }
}
