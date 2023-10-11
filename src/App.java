import java.util.Scanner;
public class App

{
    public static void main(String[] args) throws Exception {
        
        int poäng = 0;
        
        Scanner tb = new Scanner(System.in);
        
        System.out.println("Vilket land är störst? ");
        String frågaEtt = tb.nextLine();

        if(frågaEtt.equalsIgnoreCase("Ryssland"))
        {
            poäng+=1;
        }
        System.out.println("Vad är Norges huvudstad? ");
        String frågaTvå = tb.nextLine();

        if(frågaTvå.equalsIgnoreCase("Oslo"))
        {
            poäng+=1;
        }

        System.out.println("Vilken världsdel är störst");
        String frågaTre = tb.nextLine();

        if(frågaTre.equalsIgnoreCase("Asien"))
        {
            poäng +=1;
        }

        System.out.println("Vilken färg är en ko");
        String frågaFyra = tb.nextLine();

        if(frågaFyra.equalsIgnoreCase("svart"))
        {
            poäng +=1;
        }

        System.out.println("2+2");
        String frågaFem = tb.nextLine();

        if(frågaFem.equalsIgnoreCase("4"))
        {
            poäng +=1;
        }

        System.out.println("Du fick " +poäng+ "- poäng");
    }
}
