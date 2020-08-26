package com.company;

public class Main {

    public static void main(String[] args) {
        String palindrom = "Кара чар врача – рак";
        String buffer = palindrom.toLowerCase(); //toLowerCase это делает все буквы на маленькие (нижний регистр)
        System.out.println(buffer);
        buffer = buffer.replaceAll(" ",""); //меняет regex: на replecement:
        buffer = buffer.replaceAll("-",""); //меняет regex: на replecement:
        buffer = buffer.replaceAll(",",""); //меняет regex: на replecement:
        System.out.println(buffer);
        String backward = "";

        // GUI - grafic user interface - frontend


        for (int i = buffer.length()-1; i >=0; i--) {

            backward += buffer.charAt(i);



        }
        System.out.println(backward);


        boolean result = backward.equals(buffer);
        System.out.println(result);

        int[] arrey = new int[5];
        arrey[0] = 10;
        arrey[1] = 2;
        arrey[2] = 3;
        arrey[3] = 40;
        arrey[4] = 50;

        for (int i = 0; i < arrey.length; i++) {

            if (arrey[i]>=10){
                System.out.println(arrey[i]);
            }


        }
        System.out.println(arrey[3]);

        int ageOfMyFriend // это называется CamelCase !!!!

        int areaOfMyGarden;




    }
}
