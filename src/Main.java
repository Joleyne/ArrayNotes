import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0]=1;
        arr[1]=7;
        arr[2]=35;
        System.out.println(arr[1]);
        ArrayList<Integer>arrL = new ArrayList<>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        System.out.println(arrL);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Columbus");
        cities.add("New York");
        cities.add("Tokyo");
        System.out.println(cities);
        for(String city:cities){
            System.out.println(" " +city);
        }
        Set<String> cities2 = new HashSet<>();
        cities2.add("Dayton");
        cities2.add("Detroit");
        cities2.add("Chigacho");
        cities2.add("Dayton");
        cities2.add("Akron");
        System.out.println(cities2);


        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"What");
        hashMap.put(2, "if");
        hashMap.put(3, "!");
        System.out.println(hashMap);
        System.out.println(hashMap.get(3));

        for(Integer key:hashMap.keySet()){
            System.out.println(key);
        }
        Math.abs(-2);
        Map<String, ArrayList<Double>> mycityTempMap = new HashMap<>();
    }
}