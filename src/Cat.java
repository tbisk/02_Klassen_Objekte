public class Cat {
    
    // Attribut | Field | Property
<<<<<<< HEAD
    public String name;
    public String furColor;
    public int age;

    Cat(String name, String furColor, int age){
=======
    private String name;
    private String furColor; 
    private int age;

    public Cat(String name, String furColor, int age) {
>>>>>>> bf5e1463e7661fe919593d979fba54b745df8264
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

<<<<<<< HEAD
    public Cat tellYourAdress(){
        return this;
    }
    
    public String tellYourName(){
        return this.name;
    }

    public void changeYourName(String name){
        this.name = name;
    }

    public String tellYourFurColor(){
        return this.furColor;
    }

    public String tellYourAge(){
       return String.valueOf(age);
    }
 
}
=======
    public Cat tellYourAddress(){
       return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       // ggf. Rechte erfragen ...
        this.name = name;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }

  
   


}
>>>>>>> bf5e1463e7661fe919593d979fba54b745df8264
