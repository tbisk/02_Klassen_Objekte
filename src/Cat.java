public class Cat {
    
    // Attribut | Field | Property
    public String name;
    public String furColor;
    public int age;

    Cat(String name, String furColor, int age){
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

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