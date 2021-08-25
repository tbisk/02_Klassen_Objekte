public class App {
    
    public static void main(String[] args) {
        
      Cat cat1  = new Cat("Grizabella", "white", 29);
      ausgabe("RAM-Adresse: " + cat1.tellYourAddress());
      ausgabe("Name: " + cat1.tellYourName());
      // Fellfarbe --> tellYourFurColor()
      // Alter --> tellYourAge()

    
      ausgabe("--------------------");

      Cat cat2  = new Cat("Alonzo", "grey", 35);
      ausgabe("RAM-Adresse: " + cat2.tellYourAddress());
      ausgabe("Name: " + cat2.tellYourName());
     
   
    }

    public static void ausgabe(String outputStr) {
      System.out.println(outputStr);  
    }


}
