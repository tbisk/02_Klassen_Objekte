public class App {
    
    public static void main(String[] args) {
        
    Cat cat1  = new Cat(); 
    ausgabe("Blick von aussen: " + cat1);
    ausgabe("Blick von innen: " + cat1.tellYourAddress());
    
    ausgabe("--------------------");

    Cat cat2  = new Cat(); 
    ausgabe("Blick von aussen: " + cat2);
    ausgabe("Blick von innen: " + cat2.tellYourAddress());

    }

    public static void ausgabe(String outputStr) {
      System.out.println(outputStr);  
    }


}
