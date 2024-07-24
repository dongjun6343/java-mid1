package mid1.collection.map;


public class MapIntro {
    /**
     * put, putIfAbsent, getOrDefault, remove ...
     * Key(중복X), Value(중복O)
     *
     * Key - Set
     * Value - Collection ( 순서보장X, 중복허용)
     *
     * entrySet() => Set<Map.Entry<String,Integer>>
     *     => entry는 key와 value 저장.
     *
     * 해당 키가 없는 경우에만 put 할거다!
     * map.putIfAbsent("aaa",100);
     *
     * Map 구현체
     * - HashMap
     * - TreeMap
     * - LinkedHashMap
     *
     * Map vs Set
     * Map과 Set은 거의 같다. 옆에 Value를 가지고 있는가 없는가의 차이
     *
     * 실제로 자바에서 HashSet의 구현은 대부분 HashMap의 구현을 가져다 사용한다.
     * Map에서 Value만 비워두면 Set으로 사용할 수 있다.
     */


}
