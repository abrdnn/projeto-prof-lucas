
package javaapplication14;

import java.util.HashMap;
import java.util.Map;


public class Config {
 
    // Instância única da classe 
    private static Config instance; 
    private Map<String, String> configMap;

    // Construtor privado para evitar instanciamento externo 
    private Config() { 
        configMap = new HashMap<>(); 
    } 

    // Método para obter a instância única 
    public static synchronized Config getInstance() { 

        if (instance == null) { 
            instance = new Config(); 
        } 
        return instance; 
    }
    
    // Método para definir uma configuração 
    public void set(String key, String value) {
        configMap.put(key, value);
    }
    
    // Método para obter uma configuração 
    public String get(String key) { 
        return configMap.get(key);
    } 

} 
    

