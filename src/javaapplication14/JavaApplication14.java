package javaapplication14;


public class JavaApplication14 {

    
    public static void main(String[] args) {
        
        Config config = Config.getInstance(); 
        
        config.set("db_host", "localhost"); 

        config.set("db_port", "5432");
        
        Config anotherConfig = Config.getInstance(); 

        System.out.println(anotherConfig.get("db_host")); // Saída: localhost 

        System.out.println(anotherConfig.get("db_port")); // Saída: 5432 

        // Verificando se ambas as instâncias são a mesma 

        System.out.println(config == anotherConfig); // Saída: true 
        
    }
    
    
    
    
}
