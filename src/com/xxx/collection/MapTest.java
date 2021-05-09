package com.xxx.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Employee> staff = new HashMap<>();
        staff.put("144",new Employee("Amy Lee"));
        staff.put("567",new Employee("Harry Cooper"));
        staff.put("157",new Employee("Gary Cooper"));
        staff.put("456",new Employee("Francesca Cruz"));
        System.out.println(staff);
        staff.remove("567");
        staff.put("456",new Employee("Francesca Miller"));
        System.out.println(staff.get("144"));
        staff.forEach((k,v)->
                System.out.println("key="+k+",value="+v));
        Set<String> keys = staff.keySet();
        for(String key:keys){
            System.out.println(staff.get(key));
        }
        for(Map.Entry<String,Employee> entry:staff.entrySet()){
            String key = entry.getKey();
            Employee value = entry.getValue();
            System.out.println(key+","+value);
        }
        for(Employee entry:staff.values()){
            System.out.println(entry);
        }

    }
}
