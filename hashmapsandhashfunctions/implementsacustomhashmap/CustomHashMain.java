import com.Day02.hashmapsandhashfunctions.implementsacustomhashmap.CustomHashMap;

public static void main(String[] args) {
    CustomHashMap<String, Integer> map = new CustomHashMap<>();

    map.put("one", 1);
    map.put("two", 2);
    map.put("three", 3);

    System.out.println("Value for 'one': " + map.get("one"));
    System.out.println("Value for 'two': " + map.get("two"));
    System.out.println("Value for 'three': " + map.get("three"));

    map.remove("two");
    System.out.println("Value for 'two' after removal: " + map.get("two"));

    System.out.println("Size of the map: " + map.size());
}

