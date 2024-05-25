import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------------------------------");
        System.out.println("HashMap");
        System.out.println("---------------------------------");

        HashMap<Integer, String> someMap = new HashMap<>();
        someMap.put(1, "A");
        someMap.put(2, "B");
        someMap.put(3, "C");

        System.out.println(changeKeysAndValues(someMap));

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("LinkedList ArrayList");
        System.out.println("---------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 1000000; i++) {
            numbers.add(random.nextInt(1000000));
        }

        long startTime = System.currentTimeMillis();
        getElems(numbers);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);


        LinkedList<Integer> linkedNumbers = new LinkedList<>();
        for(int i = 0; i < 1000000; i++) {
            linkedNumbers.add(random.nextInt(1000000));
        }

        startTime = System.currentTimeMillis();
        getElems(linkedNumbers);
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("ArrayList");
        System.out.println("---------------------------------");

        ArrayList<String> someWords = new ArrayList<>();

        someWords.add("AnotherWord");
        someWords.add("Words");
        someWords.add("Words");
        someWords.add("AnotherWord");
        someWords.add("Word");
        someWords.add("AnotherWord");
        someWords.add("Words");
        someWords.add("Word");
        someWords.add("Word");

        System.out.println(deleteDuplicates(someWords));

    }

    public static HashMap<String, Integer> changeKeysAndValues(HashMap<Integer, String> hashMap) {

        HashMap<String, Integer> newHashMap = new HashMap<>();

        for(Map.Entry<Integer, String> elems : hashMap.entrySet()) {
            newHashMap.put(elems.getValue(), elems.getKey());
        }

        return newHashMap;
    }

    public static void getElems(ArrayList<Integer> array) {
        Random random = new Random();
        for(int i = 0; i < 1000; i++) {
            array.get(random.nextInt(array.size() - 1));
        }
    }

    public static void getElems(LinkedList<Integer> array) {
        Random random = new Random();
        for(int i = 0; i < 1000; i++) {
            array.get(random.nextInt(array.size() - 1));
        }
    }

    public static ArrayList<String> deleteDuplicates(ArrayList<String> arrayList) {

        for(int i = 0; i < arrayList.size(); i++) {

            for(int j = 0; j < arrayList.size(); j++) {
                if(j == i) {
                    continue;
                } else {
                    if(arrayList.get(i) == arrayList.get(j)) {
                        arrayList.remove(j);
                    }
                }
            }
        }

        return arrayList;
    }
}
