import java.util.Scanner;

public class SuperGreeter {
        public void start(){
            System.out.println("det virker altså men dette kommer ikke med på git hub før jeg pusher");
        }
    Scanner indTast = new Scanner(System.in);
        public void indtastNavn(){
            System.out.println("hvad er dit navn?");
            String navn = indTast.next();
            System.out.println("Hej "+navn);
        }
        public int dinAlder(){
            System.out.println("hvor gammel er du?");
            int alder = indTast.nextInt();
            return alder;
        }
        public static void main(String[] args){
            SuperGreeter sg = new SuperGreeter();
            sg.start();
            sg.indtastNavn();
            sg.dinAlder();
        }
}
