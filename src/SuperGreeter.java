import java.util.Scanner;

public class SuperGreeter {
        public void start(){
            System.out.println("det virker altså");
        }
        public void indtastNavn(){
            System.out.println("hvad er dit navn?");
            Scanner indTast = new Scanner(System.in);
            String navn = indTast.next();
            System.out.println("Hej "+navn);
        }
        public static void main(String[] args){
            SuperGreeter sg = new SuperGreeter();
            sg.start();
            sg.indtastNavn();
        }


}
