public class App {
    
    public static void main(String[] args) {
        
      Cat cat1  = new Cat("Grizabella", "white", 29);
      ausgabe("RAM-Adresse: " + cat1.tellYourAddress());
      ausgabe("Name: " + cat1.tellYourName());
      ausgabe("Fellfarbe: " + cat1.tellYourFurColor());
      ausgabe("Alter: " + cat1.tellYourAge());
    
      ausgabe("--------------------");

      Cat cat2  = new Cat("Alonzo", "grey", 35);
      ausgabe("RAM-Adresse: " + cat2.tellYourAddress());
      ausgabe("Name: " + cat2.tellYourName());
      ausgabe("Fellfarbe: " + cat2.tellYourFurColor());
      ausgabe("Alter: " + cat2.tellYourAge());
     
      ausgabe("--------------------");

      ausgabe(String.valueOf(2));
      ausgabe("Wert: " + 2);
      ausgabe(Integer.toString(2));
   
    }

    public static void ausgabe(String outputStr) {
      System.out.println(outputStr);  
    }


}
