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


    public Cat tellYourAddress(){
       return this;
    }

    public String tellYourName(){
        return this.name;
    }

    public String tellYourFurColor(){
        return this.name;
    }

    public int tellYourAge(){
        return this.age;
    }

    public void changeYourName(String name){
        this.name = name;
    }
    



}
