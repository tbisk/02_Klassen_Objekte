public class App {
    
    public static void main(String[] args) {
        
      Cat cat1  = new Cat(); 
      cat1.name = "Grizabella";
      ausgabe("RAM-Adresse: " + cat1.tellYourAddress());
      ausgabe("Name: " + cat1.tellYourName());
    
      ausgabe("--------------------");

      Cat cat2  = new Cat(); 
      cat2.name = "Alonzo";
      ausgabe("RAM-Adresse: " + cat2.tellYourAddress());
      ausgabe("Name: " + cat2.tellYourName());
      ausgabe(cat2.name);
   
    }

    public static void ausgabe(String outputStr) {
      System.out.println(outputStr);  
    }


}
