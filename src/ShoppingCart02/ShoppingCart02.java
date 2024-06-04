package ShoppingCart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+"Quer comprar duas "+itemDesc;
        
        double preco = 20.50;
        double imposto = 0.28; 
        int quantidade = 2; 
        
         
        double custoTotal = (preco + quantidade) + (1 + imposto);
          
        
        
        System.out.println(message);
        System.out.println("o custo com o impposto e: $" + custoTotal);
        
       
        
    }    
}
