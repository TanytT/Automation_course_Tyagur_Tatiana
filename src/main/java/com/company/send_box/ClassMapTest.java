package com.company.send_box;


public class ClassMapTest {
    public static void main(String[] args) {

        System.out.println(greet("english"));
        System.out.println(greet(""));

        System.out.println(subtractSum(115));

    }
    public static String subtractSum (int n) {
        String str = "1-kiwi\n" +
                "2-pear\n" +
                "3-kiwi\n" +
                "4-banana\n" +
                "5-melon\n" +
                "6-banana\n" +
                "7-melon\n" +
                "8-pineapple\n" +
                "9-apple\n" +
                "10-pineapple\n" +
                "11-cucumber\n" +
                "12-pineapple\n" +
                "13-cucumber\n" +
                "14-orange\n" +
                "15-grape\n" +
                "16-orange\n" +
                "17-grape\n" +
                "18-apple\n" +
                "19-grape\n" +
                "20-cherry\n" +
                "21-pear\n" +
                "22-cherry\n" +
                "23-pear\n" +
                "24-kiwi\n" +
                "25-banana\n" +
                "26-kiwi\n" +
                "27-apple\n" +
                "28-melon\n" +
                "29-banana\n" +
                "30-melon\n" +
                "31-pineapple\n" +
                "32-melon\n" +
                "33-pineapple\n" +
                "34-cucumber\n" +
                "35-orange\n" +
                "36-apple\n" +
                "37-orange\n" +
                "38-grape\n" +
                "39-orange\n" +
                "40-grape\n" +
                "41-cherry\n" +
                "42-pear\n" +
                "43-cherry\n" +
                "44-pear\n" +
                "45-apple\n" +
                "46-pear\n" +
                "47-kiwi\n" +
                "48-banana\n" +
                "49-kiwi\n" +
                "50-banana\n" +
                "51-melon\n" +
                "52-pineapple\n" +
                "53-melon\n" +
                "54-apple\n" +
                "55-cucumber\n" +
                "56-pineapple\n" +
                "57-cucumber\n" +
                "58-orange\n" +
                "59-cucumber\n" +
                "60-orange\n" +
                "61-grape\n" +
                "62-cherry\n" +
                "63-apple\n" +
                "64-cherry\n" +
                "65-pear\n" +
                "66-cherry\n" +
                "67-pear\n" +
                "68-kiwi\n" +
                "69-pear\n" +
                "70-kiwi\n" +
                "71-banana\n" +
                "72-apple\n" +
                "73-banana\n" +
                "74-melon\n" +
                "75-pineapple\n" +
                "76-melon\n" +
                "77-pineapple\n" +
                "78-cucumber\n" +
                "79-pineapple\n" +
                "80-cucumber\n" +
                "81-apple\n" +
                "82-grape\n" +
                "83-orange\n" +
                "84-grape\n" +
                "85-cherry\n" +
                "86-grape\n" +
                "87-cherry\n" +
                "88-pear\n" +
                "89-cherry\n" +
                "90-apple\n" +
                "91-kiwi\n" +
                "92-banana\n" +
                "93-kiwi\n" +
                "94-banana\n" +
                "95-melon\n" +
                "96-banana\n" +
                "97-melon\n" +
                "98-pineapple\n" +
                "99-apple\n" +
                "100-pineapple";

        if(n>=10 && n<10000){
           do {
               int res=0;
               int n1=n;
               while(n1>0) {
                   res += n1 % 10;
                   n1/=10;
               }
               n -= res;
           } while(n>100);
        }

        String [] arrSt= str.split("\n");
        for (int i = 0; i < arrSt.length; i++) {
            String [] kv = arrSt[i].split("-");
            if(kv[0].equals(n+"")){
                return kv[1].trim();
            }
        }
        return "";
    }

    public static String greet(String language){
        String str = "english: \"Welcome\",\n" +
                "czech: \"Vitejte\",\n" +
                "danish: \"Velkomst\",\n" +
                "dutch: \"Welkom\",\n" +
                "estonian: \"Tere tulemast\",\n" +
                "finnish: \"Tervetuloa\",\n" +
                "flemish: \"Welgekomen\",\n" +
                "french: \"Bienvenue\",\n" +
                "german: \"Willkommen\",\n" +
                "irish: \"Failte\",\n" +
                "italian: \"Benvenuto\",\n" +
                "latvian: \"Gaidits\",\n" +
                "lithuanian: \"Laukiamas\",\n" +
                "polish: \"Witamy\",\n" +
                "spanish: \"Bienvenido\",\n" +
                "swedish: \"Valkommen\",\n" +
                "welsh: \"Croeso\"";

        String [] arr = str.split(",\n");
        for (int i = 0; i < arr.length ; i++) {
            String [] keyValue = arr[i].split(":");
            if(keyValue[0].equals(language)){
                return keyValue[1].replace('\"','\0').trim();
            }
        }

            return "Welcome";
    }
}
