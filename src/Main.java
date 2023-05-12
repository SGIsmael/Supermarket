import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
    Client pedro = new Client("Pedro", BigDecimal.ZERO);
    pedro.addProduct(new Product(2.5,"Remolacha"));
    pedro.showMeList();
    pedro.addProduct(new Product(1.8,"Coliflor"));
    pedro.addProduct(new Product(5,"Papaya"));
    pedro.showMeList();
    pedro.subOneProduct(new Product(5,"Papaya"));
    pedro.showMeList();
    pedro.cleanList();
    pedro.showMeList();



    }
}

