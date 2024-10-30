import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //greeting();
        //String returned_name = getNameFromUser();
        //System.out.println(returned_name);
        //greetName("Abbu");

        //ifSats();
        //forLoop();
        //doWhileLoop();
        arrayer();
        forEachLoop();
        listor();


    }

    //Function utan retur eller in parameter
    public static void greeting(){
        Scanner scanner;
        scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        greetName(input);

    }

    // Function med in parameter

    public static void greetName(String name){
        System.out.println("Hej, " + name);
    }

    //Function that is returning a value

    public static String getNameFromUser(){
        Scanner scanner;
        scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        return  input;

    }

    //vilkor

    public static void ifSats(){
        int x =10;
        int y = 40;
        int z = 30;
        if(x > y  || z > y ){
            System.out.println("Executing the if statement");
        }else if(y>z){
            System.out.println("Y is greater than z");
        }
        System.out.println("We are just printing line");
    }

    public static void switchSats(){
        System.out.println("Choose a value:");
        System.out.println("Choose a value:");
        System.out.println("Choose a value:");
        int  x = 5;
        switch (x){
            case 5:
                System.out.println("First case");
                break;
            case 6:
                System.out.println("Second Case is working");
                break;
            default:
                System.out.println("Its the default value of the case.");
        }

    }

    //For Loop
    public static void forLoop(){
        for(int i=0 ; i < 10 ; i++) {
            System.out.println("i = " + i);
        }

        //While loop
        boolean running = true;
        while(running){

            System.out.println("Hello");
            String input = getNameFromUser();
            if(input.equals("ja")){
                break;
            }else{
                continue;
            }

        }

    }

    //Do while

    public static void doWhileLoop(){
        boolean running = false;
        do{
            System.out.println("Do while");
            String input = getNameFromUser();
            if(input.equals("ja")){
                break;
            }else{
                continue;
            }
        }while(running);

    }

    // Arrray

    public static void arrayer(){
        int number = 1;
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        int[] numbers2 = new int[10];
        numbers2[0] = number;
        System.out.println(numbers2);

    }

    public static void forEachLoop(){
        int[] numbers = {17,34,32,3,4,5,6,7,8,9};
        char[] text = "Hej".toCharArray();
        for (char i: text){
            System.out.println("letter = " + i);
        }
        int[] numbers2= numbers;
        System.out.println();
        System.out.println("Numbers "+ Arrays.toString(numbers));
        System.out.println("last element of en array: " + numbers[numbers.length-1]);

    }

    // listor and set
    public static void listor(){


        HashSet<String> nameset = new HashSet<>();
        nameset.add("Bill");
        nameset.add("Bill");
        nameset.add("Bill");
        System.out.println("nameList =" + nameset); // Unique value

        for (String s: nameset){
            if(s.startsWith("B")){
                System.out.println("I got you!");
            }
        }

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Bill");
        nameList.add("Bill2");
        nameList.add("Bill3");
        nameList.add("Bill4");

        System.out.println("nameList =" + nameList);
        System.out.println("nameList =" + nameList.get(3));


        // Map with key and value same as python Map/ Dictionary

        HashMap<String, String> playerAsMap = new HashMap<>();
        playerAsMap.put("name","Bill");
        playerAsMap.put("STR","10000000");
        playerAsMap.put("Equiddedweapong","Sniper");

        System.out.println(playerAsMap);

        // Printing out the keys of the map
        for (String k: playerAsMap.keySet()){
            System.out.println("k = " + k);
            System.out.println("__________________");
            System.out.println("k " + playerAsMap.get(k));
        }

    }







}//main