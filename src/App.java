public class App {
    
<<<<<<< HEAD
   public static void main(String[] args) {

   Cat cat1 = new Cat("Grizabella", "white", 29);
   ausgabe("RAM-Adresse: " + cat1.tellYourAdress());
   ausgabe("Name: " + cat1.tellYourName());
   ausgabe("Fellfarbe: "  + cat1.tellYourFurColor());
   ausgabe("Alter: " + cat1.tellYourAge());
   // Fellfarbe -> tellYourFurColor
   //  Alter -> tellYourAge
    
   ausgabe("-------------------------------");

   Cat cat2 = new Cat("Alonzo", "grey", 35);
   ausgabe("RAM-Adresse: " + cat2.tellYourAdress());
   ausgabe("Name: " + cat2.tellYourName());
   ausgabe("Fellfarbe: "  + cat2.tellYourFurColor());
   ausgabe("Alter: " + cat2.tellYourAge());

   ausgabe("-------------------------------");
   ausgabe(String.valueOf(2));
   ausgabe("Wert: " + 2);
   ausgabe(Integer.toString(2));

=======
    public static void main(String[] args) {
        
      Cat cat1  = new Cat("Grizabella", "white", 29);

      ausgabe("RAM-Adresse: " + cat1.tellYourAddress());
      ausgabe("Name: " + cat1.getName());
      ausgabe("Fellfarbe: " + cat1.getFurColor());
      ausgabe("Alter: " + cat1.getAge());
    
      ausgabe("--------------------");

      Cat cat2  = new Cat("Alonzo", "grey", 35);
      cat2.setName("Alonzo, der Coole!");
      
      ausgabe("RAM-Adresse: " + cat2.tellYourAddress());
      ausgabe("Name: " + cat2.getName());
      ausgabe("Fellfarbe: " + cat2.getFurColor());
      ausgabe("Alter: " + cat2.getAge());
     
      ausgabe("--------------------");

      // ausgabe(2); //Typ muss konvertiert werden!
      ausgabe("Wert: " + 2);
      ausgabe(String.valueOf(2));
      ausgabe(Integer.toString(2));
   
>>>>>>> bf5e1463e7661fe919593d979fba54b745df8264
    }

    public static void ausgabe(String outputStr) {
      System.out.println(outputStr);  
    }

}
