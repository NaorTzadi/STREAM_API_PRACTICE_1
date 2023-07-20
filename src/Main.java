import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbersInList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //printSumOfEvensFromList(numbersInList);
        //printSumOfAllNumbersInList(numbersInList);
        //printSumOfAllNumbersInListByPowerTwo(numbersInList);
        //printNumbersInListByLimit(numbersInList,5);
        //printNumbersInListBySkip(numbersInList,5);
        //printNumbersInListByJump(numbersInList,2);
        //printEvenNumbersInListStatus(numbersInList);
        //printMaxAndMinNumberInList(numbersInList);
        List<Integer> duplicatesInList=Arrays.asList(1,2,2,3,4,4,5,5,5,6,6,7,9,10,10);
        //printDuplicatesInListRemoval(duplicatesInList);

        int[] numbersInArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //printSumOfEvesFromArray(numbersInArray);
        //printSumOfAllNumbersInArray(numbersInArray);
        //printSumOfAllNumbersInArrayByPowerTwo(numbersInArray);
        //printNumbersInArrayByLimit(numbersInArray,5);
        //printNumbersInArrayBySkip(numbersInArray,5);
        //printNumbersInArrayByJump(numbersInArray,2);
        //printEvenNumbersInArrayStatus(numbersInArray);
        //printMaxAndMinNumberInArray(numbersInArray);
        int[] duplicatesInArray={1,2,2,3,4,4,5,5,5,6,6,7,9,10,10};
        //printDuplicatesInArrayRemoval(duplicatesInArray);

        Map<Integer,String> numbersInMap=new HashMap<>();
        numbersInMap.put(1,"one");
        numbersInMap.put(2,"two");
        numbersInMap.put(3,"three");
        numbersInMap.put(4,"four");
        numbersInMap.put(5,"five");
        numbersInMap.put(6,"six");
        numbersInMap.put(7,"seven");
        numbersInMap.put(8,"eight");
        numbersInMap.put(9,"nine");
        numbersInMap.put(10,"ten");
        //printSumOfEvenNumbersFromMap(numbersInMap);
        //printSumOfAllNumbersInMap(numbersInMap);
        //printSumOfAllNumbersInMapByPowerTwo(numbersInMap);
        //printNumbersInMapByLimit(numbersInMap,5);
        //printNumbersInMapBySkip(numbersInMap,5);
        //printNumbersInMapByJump(numbersInMap,2);
        //printEvenNumbersInMapStatus(numbersInMap);
        //printMaxAndMinNumberInMap(numbersInMap);
        Map<Integer,String> duplicatesInMap = new HashMap<>();
        duplicatesInMap.put(1,"one");
        duplicatesInMap.put(2,"two");
        duplicatesInMap.put(3,"two");
        duplicatesInMap.put(4,"three");
        duplicatesInMap.put(5,"three");
        duplicatesInMap.put(6,"four");
        //printDuplicatesInMapRemoval(duplicatesInMap);

        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        //combineListsOfNumbersIntoOneList(lists);

        printNamesWhoStartsWithCertainCharInConstructor('j');
        //printOldestPersonInConstructor();
        //createListsOfEveryFieldInTheConstructorThenPrintAsOne();

        List<String> words = Arrays.asList("Hello", "World");
        //combineListsOfStringIntoOne(words);

        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9, 2, 6, 7, 4);
        //printByAscendingOrder(numbers);
        //printByDescendingOrder(numbers);

        String[] strings = { "banana", "apple", "cherry", "date", "elderberry" };
        //printByAlphabeticalOrder(strings);
        //printByReverseAlphabeticOrder(strings);
        //printByCertainChar(strings,'a');





    }


    private static void printSumOfEvensFromList(List<Integer> numbersList){
        int sumOfEvens=numbersList.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();System.out.println(sumOfEvens);
    }
    private static void printSumOfAllNumbersInList(List<Integer> numbersList){
        Optional<Integer> sum=numbersList.stream().reduce(Integer::sum);System.out.println(sum);
    }
    private static void printSumOfAllNumbersInListByPowerTwo(List<Integer> numbersList){
        List<Integer> allNumbersInListToBeByPowerTwo= numbersList.stream().map(i -> (int) Math.pow(i, 2)).toList();
        int sum1=allNumbersInListToBeByPowerTwo.stream().reduce(0,Integer::sum);      // כאשר אנו לא משתמשים ב-Optional נשים 0
        Optional<Integer> sum2=allNumbersInListToBeByPowerTwo.stream().reduce(Integer::sum); // כאשר אנו משתמשים ב-Optional איך צןרך לשים 0 כי זה כברירת מחדל
        System.out.println(sum1);
        System.out.print(" "+sum2);
    }
    private static void printNumbersInListByLimit(List<Integer> numbersList,int limit){
        numbersList.stream().limit(limit).forEach(System.out::println);
    }
    private static void printNumbersInListBySkip(List<Integer> numbersList,int skip){
        numbersList.stream().skip(skip).forEach(System.out::println);
    }
    private static void printNumbersInListByJump(List<Integer> numbersList,int jump){
        IntStream.range(0,numbersList.size()).filter(i->i%jump==0).forEach(System.out::println);
    }
    private static void printEvenNumbersInListStatus(List<Integer> numbersList){
        System.out.println("at least one match: "+numbersList.stream().anyMatch(i->i%2==0));
        System.out.println("all match: "+numbersList.stream().allMatch(i->i%2==0));
        System.out.println("none match: "+numbersList.stream().noneMatch(i->i%2==0));
    }
    private static void printMaxAndMinNumberInList(List<Integer> numbersList){
        Optional<Integer> max = numbersList.stream().max(Comparator.naturalOrder());System.out.println("max: " + max.get());
        Optional<Integer> min = numbersList.stream().min(Comparator.naturalOrder());System.out.println("min: " + min.get());
    }
    private static void printDuplicatesInListRemoval(List<Integer> duplicatesList){
        List<Integer> noDuplicates=duplicatesList.stream().distinct().toList();noDuplicates.forEach(System.out::println);
    }


    private static void printSumOfEvesFromArray(int[] numbersArray){
        int sumOfEvens= Arrays.stream(numbersArray).filter(i->i%2==0).sum();
        System.out.println(sumOfEvens);
    }
    private static void printSumOfAllNumbersInArray(int[] numbersArray){
        OptionalInt sum=Arrays.stream(numbersArray).reduce(Integer::sum);
        System.out.println(sum);
    }
    private static void printSumOfAllNumbersInArrayByPowerTwo(int[] numbersArray){
        int sum=Arrays.stream(numbersArray).map(i->(int)Math.pow(i,2)).sum();
        System.out.println(sum);
    }
    private static void printNumbersInArrayByLimit(int[] numbersArray,int limit){
        Arrays.stream(numbersArray).limit(limit).forEach(System.out::println);
    }
    private static void printNumbersInArrayBySkip(int[] numbersArray,int skip){
        Arrays.stream(numbersArray).skip(skip).forEach(System.out::println);
    }
    private static void printNumbersInArrayByJump(int[] numbersArray,int jump){
        IntStream.range(0,numbersArray.length).filter(i->i%jump==0).forEach(System.out::println);
    }
    private static void printEvenNumbersInArrayStatus(int[] numbersArray){
        System.out.println("at least one match: "+Arrays.stream(numbersArray).anyMatch(i -> i % 2 == 0));
        System.out.println("all match: "+Arrays.stream(numbersArray).allMatch(i -> i % 2 == 0));
        System.out.println("none match "+Arrays.stream(numbersArray).noneMatch(i -> i % 2 == 0));
    }
    private static void printMaxAndMinNumberInArray(int[] numbersArray){
        OptionalInt max=Arrays.stream(numbersArray).max();System.out.println("max: "+max.getAsInt());
        OptionalInt min=Arrays.stream(numbersArray).min();System.out.println("min: "+min.getAsInt());
    }
    private static void printDuplicatesInArrayRemoval(int[] duplicatesArray){
        List<Integer> noDuplicates=Arrays.stream(duplicatesArray).distinct().boxed().toList();noDuplicates.forEach(System.out::println);
        /*In Java, the boxed() method is used to convert a stream of primitive types to their wrapper types.
        for example you can use box to convert a char into a Character or int into Integer.*/
    }


    private static void printSumOfEvenNumbersFromMap(Map<Integer,String> numbersMap){
        numbersMap.entrySet().stream().filter(entry->entry.getKey()%2==0).forEach(entry-> System.out.println(entry.getKey()));
    }
    private static void printSumOfAllNumbersInMap(Map<Integer,String> numbersMap){
        int sum= numbersMap.keySet().stream().reduce(0,Integer::sum);
        System.out.println(sum);
        // למה יש 0 בקוד?
        // 1.Start with the initial value: 0
        // 2.Combine the initial value with the first element using the provided function: 0 + 1 = 1
        // 3.Combine the result with the second element: 1 + 2 = 3
        // 4.Combine the result with the third element: 3 + 3 = 6
        // 5. 6 is the final result
        // כנראה שפשוט חייב בשביל שיהווה נקודת התחלה
    }
    private static void printSumOfAllNumbersInMapByPowerTwo(Map<Integer,String> numbersMap){
        numbersMap.entrySet().stream().forEach(entry -> System.out.println((int)Math.pow(entry.getKey(), 2)));
        int sum=numbersMap.keySet().stream().mapToInt(i->(int)Math.pow(i,2)).sum();
        System.out.println(sum);
    }
    private static void printNumbersInMapByLimit(Map<Integer,String> numbers,int limit){
        numbers.entrySet().stream().limit(limit).map(Map.Entry::getKey).forEach(System.out::println);
    }
    private static void printNumbersInMapBySkip(Map<Integer,String> numbers,int skip){
        numbers.entrySet().stream().skip(skip).map(Map.Entry::getKey).forEach(System.out::println);
    }
    private static void printNumbersInMapByJump(Map<Integer,String> numbersMap,int jump){
        numbersMap.entrySet().stream().filter(i->i.getKey()%jump==0).map(Map.Entry::getKey).forEach(System.out::println);
    }
    private static void printEvenNumbersInMapStatus(Map<Integer,String> numbersMap){
        System.out.println("at least one match: "+numbersMap.entrySet().stream().anyMatch(i->i.getKey()%2==0));
        System.out.println("all match: "+numbersMap.entrySet().stream().allMatch(i->i.getKey()%2==0));
        System.out.println("none match: "+numbersMap.entrySet().stream().noneMatch(i->i.getKey()%2==0));
    }
    private static void printMaxAndMinNumberInMap(Map<Integer,String> numbersMap){
        Optional<Integer> max=numbersMap.keySet().stream().max(Comparator.naturalOrder());System.out.println("max: "+max.get());
        Optional<Integer> min=numbersMap.keySet().stream().min(Comparator.naturalOrder());System.out.println("min: "+min.get());
    }
    private static void printDuplicatesInMapRemoval(Map<Integer,String> duplicatesMap){
        List<String> noDuplicates=duplicatesMap.values().stream().distinct().toList();noDuplicates.forEach(System.out::println);
    }


    private static void printNamesWhoStartsWithCertainCharInConstructor(char character){
        Person.getPeople().stream().filter(person -> person.getFirstName().toLowerCase().startsWith(Character.toString(character))).forEach(person -> System.out.println(person.getFirstName()));
    }
    private static void printOldestPersonInConstructor(){
        OptionalInt maxAge = Person.getPeople().stream().mapToInt(Person::getAge).max();System.out.println("oldest: "+maxAge.getAsInt());
    }
    private static List<Person> createListsOfEveryFieldInTheConstructorThenPrintAsOne(){
        List<String> firstNames=Person.getPeople().stream().map(Person::getFirstName).toList();
        List<String> lastNames=Person.getPeople().stream().map(Person::getLastName).toList();
        List<String> fullNames=Person.getPeople().stream().map(person -> person.getFirstName()+" "+person.getLastName()).toList();
        List<String> professions=Person.getPeople().stream().map(Person::getProfession).toList();
        List<Integer> ids=Person.getPeople().stream().map(Person::getId).toList();
        List<Integer> ages=Person.getPeople().stream().map(Person::getAge).toList();
        IntStream.range(0,fullNames.size()).forEach(i-> System.out.println(fullNames.get(i)+professions.get(i)+ages.get(i)+ids.get(i)));

        List<Person> people=new ArrayList<>();
        IntStream.range(0,firstNames.size()).
                forEach(person->people.add(new Person(firstNames.get(person),lastNames.get(person), professions.get(person),ages.get(person),ids.get(person))));
        return people;
    }


    private static void combineListsOfNumbersIntoOneList(List<List<Integer>> lists){
        List<Integer> allNumbers = lists.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(allNumbers);
    }
    private static void combineListsOfStringIntoOne(List<String> words){
        Stream<Character> characters = words.stream().flatMap(word -> word.chars().mapToObj(c -> (char) c));
        characters.forEach(System.out::print);
    }
    private static void printByAscendingOrder(List<Integer> numbersList){
        numbersList.stream().sorted().forEach(System.out::println);
    }
    private static void printByDescendingOrder(List<Integer> numbersList){
        numbersList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
    private static void printByAlphabeticalOrder(String[] strings){
        String[] sortedStrings = Arrays.stream(strings).sorted().toArray(String[]::new);
        Arrays.stream(sortedStrings).forEach(System.out::println);
    }
    private static void printByReverseAlphabeticOrder(String[] strings){
        Arrays.stream(strings).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
    private static void printByCertainChar(String[] strings,char character){
        Arrays.stream(strings).filter(i->i.startsWith(String.valueOf(character))).forEach(System.out::println);
    }






}