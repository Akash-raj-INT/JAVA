import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("vishal",10);
        map.put("amit",12);
        map.put("anuj",9);

        for(Map.Entry<String, Integer> e:map.entrySet()){
        System.out.println("key: "+ e.getKey()+"Value: "+e.getValue());
    }
}
}
