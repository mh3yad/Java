package mh3yad.com;

import java.util.Scanner;

public class Diagnose {
    public static void main(String[] args) {
        boolean go = true;
        while(go) {
            System.out.println("name: mohamed");
            System.out.println("age: 19");
            System.out.println("choose organ: ");
            System.out.println("\t1. Right eye");
            System.out.println("\t2. Left eye");
            System.out.println("\t3. Heart");
            System.out.println("\t4. Stomach");
            System.out.println("\t5. Skin");
            System.out.println("\t6. Quit");
            Scanner getInput = new Scanner(System.in);
            int num = getInput.nextInt();


            switch (num) {
                case 1:
                    Righteye right = new Righteye("righteye","Normal","red");
                    System.out.println("Name: "+right.getName());
                    System.out.println("Medical Condition: "+right.getMedical_condition());
                    System.out.println("Color: "+right.Color);
                    System.out.println("\t1. Close the eye");
                    int num3 = getInput.nextInt();
                    if(num3!=-8) {
                        System.out.println("Right eye closed");
                        break;
                    }
                case 2:
                    Lefteye left = new Lefteye("lefteye","short sight","blue");
                    System.out.println("Name: "+left.getName());
                    System.out.println("Medical Condition: "+left.getMedical_condition());
                    System.out.println("Color: "+left.Color);
                    System.out.println("\t1. Close the eye");
                    int num2 = getInput.nextInt();
                    if(num2!=-8) {
                        System.out.println("Right eye closed");
                        break;
                    }
                case 3:
                    Heart heart = new Heart("Heart","beat problem",50);
                    System.out.println("Name: "+heart.getName());
                    System.out.println("Medical Condition: "+heart.getMedical_condition());
                    System.out.println("Heart Rate: "+heart.getHeartRate());
                    System.out.println("\t1. change the Heart rate");
                    int num5 = getInput.nextInt();
                    if(num5!=-8) {
                        System.out.println("Enter the new heart rate value: ");
                        int heart_rate= getInput.nextInt();
                        heart.setHeartRate(heart_rate);
                        System.out.println("Heart rate changed to: "+ heart_rate);
                        break;
                    }
                case 4:
                    Stomach stomach = new Stomach("Stomach","PUD");
                    System.out.println("Name: "+stomach.getName());
                    System.out.println("Medical Condition: "+stomach.getMedical_condition());
                    System.out.println("\t1. start the digest");
                    int num6 = getInput.nextInt();
                    if(num6!=-8) {
                        System.out.println("digest started... ");
                        break;
                    }
                case 5:
                    Skin skin = new Skin("Heart","beat problem");
                    System.out.println("Name: "+skin.getName());
                    System.out.println("Medical Condition: "+skin.getMedical_condition());
                    int num7 = getInput.nextInt();
                    if(num7!=-8) {
                        System.out.println("Heart closed");
                       break;
                    }
                default:
                    System.out.println("thnks!!! exiting...");
                    go = false;

            }
        }
    }
}
