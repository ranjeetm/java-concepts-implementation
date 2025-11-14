import java.util.*; 

public class hashmap {

    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Ranjeet", 100);
        map.put("XYZ1", 90);
        map.put("XYZ2", 80);
        map.put("XYZ3", 90);

        System.out.println(map.putIfAbsent("XYZ4", 99));
        System.out.println(map.size());
        
    }
}