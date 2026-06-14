import java.util.Scanner;

public class App {
    // enum Clothes {
    //     Medic,
    //     Jacket,
    //     Moleton,
    //     None
    // }

    // enum Hats {
    //     Tophat,
    //     LittleMongus,
    //     Crown,
    //     Cone,
    //     None
    // }

    // enum Visors {
    //     Broken,
    //     Kawaii,
    //     UwU,
    //     Sheetpost,
    //     AngryEyebrows,
    //     None
    // }

    // enum Pets {
    //     SonGus,
    //     Snowboy,
    //     Vines,
    //     Magmapal,
    //     None
    // }

    // public enum Colors {
    //     Red,
    //     Blue,
    //     Green,
    //     Yellow,
    //     Banana,
    //     Purple,
    //     Pink,
    //     Rose,
    //     Coral,
    //     Black,
    //     Gray,
    //     Lime,
    //     Cyan,
    //     Tan,
    //     Orange,
    //     Brown
    //     ;
    // }
    static String[] colors = {"Red", "Blue", "Green", "Yellow", "Banana", "Purple", "Pink", "Rose", "Coral", "Black", "Gray", "Lime", "Cyan", "Tan", "Orange", "Brown"};
    static String[] visors = {"Broken", "Kawai", "UwU", "Sheetpost", "Angry Eyebrows", "None"};
    static String[] clothes = {"Medic", "Jacket", "Moleton", "None"};
    static String[] hats = {"Tophat", "Little Mongus", "Crown", "Cone", "None"};

    static Scanner scanner = new Scanner(System.in);

    static boolean done = false;

    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to the Among us Dressing game!");
        System.out.println();
        System.out.print("Please press ENTER to begin the game.");
        System.out.print(scanner.nextLine());

        System.out.println();
        System.out.println("(1/4) First you got to choose a color!");

        boolean isColorSelected = false;
        boolean isClothSelected = false;
        boolean isHatSelected = false;
        boolean isVisorSelected = false;

        String strColor = "";
        String strHat = "";
        String strCloth = "";
        String strVisor = "";

        
        do{
            chooseColor();
            
            strColor = scanner.nextLine();

            for (int i = 0; i < colors.length; i++) {
                // System.out.println(colors[i]);
                if (strColor.equalsIgnoreCase(colors[i])) {
                    isColorSelected = true;
                    break;
                }
            }
            if (isColorSelected) {
                System.out.println();
                System.out.println("Color Selected!");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("Color doesn't exist!");
            }

        } while (isColorSelected == false);

        System.out.println("(2/4) Now you got to choose your hat!");
        do{
            chooseHat();
            
            strHat = scanner.nextLine();

            for (int i = 0; i < hats.length; i++) {
                // System.out.println(colors[i]);

                if (strHat.equalsIgnoreCase(hats[i])) {
                    isHatSelected = true;
                    break;
                }
            }
            if (isHatSelected) {
                System.out.println();
                System.out.println("Hat Selected!");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("Hat doesn't exist!");
            }

        } while (isHatSelected == false);

        System.out.println("(3/4) Now you got to choose your clothes!");
        do{
            chooseClothes();
            
            strCloth = scanner.nextLine();

            for (int i = 0; i < clothes.length; i++) {
                // System.out.println(colors[i]);

                if (strCloth.equalsIgnoreCase(clothes[i])) {
                    isClothSelected = true;
                    break;
                }
            }
            if (isClothSelected) {
                System.out.println();
                System.out.println("Cloth Selected!");
                System.out.println();
            }
            else{ 
                System.out.println();
                System.out.println("Cloth doesn't exist!");
            }
        } while (isClothSelected == false);


        System.out.println("(4/4) Now you got to choose your visor!");
        do{
            chooseVisor();
            
            strVisor = scanner.nextLine();

            for (int i = 0; i < visors.length; i++) {
                // System.out.println(visors[i]);

                if (strVisor.equalsIgnoreCase(visors[i])) {   
                    isVisorSelected = true;
                    break;
                }
            }

            if (isVisorSelected) {
                System.out.println();
                System.out.println("Visor Selected!");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("Visor doesn't exist!");
            }
        } while (isVisorSelected == false);

        System.out.println();
        System.out.println("Your skin settings: " + "\nColor: " + strColor.toUpperCase() + "\nHat: " + strHat.toUpperCase() + "\nClothes: " + strCloth.toUpperCase() + "\nVisor: " + strVisor.toUpperCase());


        scanner.close();

    }

    // static void chooseItem(String item) {
    //     System.out.println("Avaiable " + item + " to pick: ");

    // }

    static void chooseColor() {
        System.out.println("Avaliable colors to pick: ");

        for (String color : colors) {
            if (color != colors[15])
                System.out.print(color.toUpperCase() + ", ");
            else
                System.out.println(color.toUpperCase() + ".");
        }
        
        System.out.print(">> ");
    }

    static void chooseVisor() {
        System.out.println("Avaliable visors to pick: ");

        for (String visor : visors) {
            if (visor != visors[5])
                System.out.print(visor.toUpperCase() + ", ");
            else
                System.out.println(visor.toUpperCase() + ".");
        }

        System.out.print(">> ");
    }

    static void chooseHat() {
        System.out.println("Avaliable hats to pick: ");

        for (String hat : hats) {
            if (hat != hats[4])
                System.out.print(hat.toUpperCase() + ", ");
            else
                System.out.println(hat.toUpperCase() + ".");
        }

        System.out.print(">> ");
    }

    static void chooseClothes(){
        System.out.println("Avaliable clothes to pick: ");

        for (String cloth : clothes) {
            if (cloth != clothes[3])
                System.out.print(cloth.toUpperCase() + ", ");
            else
                System.out.println(cloth.toUpperCase() + ".");
        }

        System.out.print(">> ");    
    }
}
