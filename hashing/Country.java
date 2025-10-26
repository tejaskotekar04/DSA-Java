/*
We are using HashMap
to store country names and their populations..
 */
import java.util.HashMap;
public class Country {
    public static void main(String[] args) {
        //String as key and Integer as value
        //country(key) and its population(value)
        HashMap<String, Integer> countryPopulation = new HashMap<>();

        // Add(insert) key-value pairs to the HashMap 
        countryPopulation.put("India", 145);
        countryPopulation.put("USA", 33);    
        countryPopulation.put("China", 140);

        System.out.println(countryPopulation);

        // If we want to update population of a country
        countryPopulation.put("India", 146); // India population updated to 146
        System.out.println(countryPopulation);

        //If we want to check if a key is present in the HashMap
        if(countryPopulation.containsKey("China")){ // true
            System.out.println("China is present in the map");
        }else{
            System.out.println("China is not present in the map");
        }

        // If we want to access the value of a particular key 
        System.out.println(countryPopulation.get("China")); // Output: 140 (which means the key exists)
        System.out.println(countryPopulation.get("Brazil")); // Output: null (which means the key doesn't exist)
    }
}

/*
We have used 'put' method to add key-value pairs to the HashMap.
HashMaps are unordered. 
So, the order of elements in the output may vary each time.

We have used 'containsKey' method to check if a key is present in the HashMap.
We have used 'get' method to access the value of a particular key.
 */

