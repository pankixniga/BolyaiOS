import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

            int selection;

            Scanner sc = new Scanner(System.in);

            do {
                System.out.println("Valaszd ki a szamot!");
                System.out.println("1 - HELLO WORLD");
                System.out.println("2 - INFO");
                System.out.println("3 - Exit");
                System.out.println("4 - HELP");

                selection = sc.nextInt();

                switch (selection) {
                    case 1:
                        System.out.println("Hello World!!!!!");
                        break;
                    case 2:
                        System.out.println("Bolyai OS v1");
                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("Parancsok: Exit, Info, Help, Hello World");
                        break;
                }
            }
            while (selection != 3);



    }
}