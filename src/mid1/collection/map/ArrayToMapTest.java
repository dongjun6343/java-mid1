package mid1.collection.map;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"JAVA", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        Map<String, Integer> productMap = new HashMap<>();
        for (String[] product : productArr) {
            productMap.put(product[0], Integer.valueOf(product[1]));
        }

        // Map의 모든 데이터 출력 - 코드 작성
        for (String key : productMap.keySet()) {
            System.out.println("key = " + key);
            System.out.println("value = " + productMap.get(key));
        }
    }
}
