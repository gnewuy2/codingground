abstract class HelloWorld1{
    int seatingCapacity, noOfPropellers;
    String brand, typeOf;
    abstract void setSeatingCapacity(int newCapacity);
    abstract void setBrand(String newBrand);
    abstract void setTypeOf (String newTypeOf);
    abstract void setNoOfPropellers(int newNoOfPropellers);
    abstract int getSeatingCapacity();
    abstract String getBrand();
    abstract String getTypeOf();
    abstract int getNoOfPropellers();
}

abstract class AnAbstractAirplane extends HelloWorld1{
    void setSeatingCapacity(int newCapacity){
        this.seatingCapacity = newCapacity; 
    }
    void setBrand(String newBrand){
        this.brand = newBrand;
    }
    void setTypeOf(String newTypeOf){
        this.typeOf = newTypeOf;
    }
    void setNoOfPropellers(int newNoOfPropellers){
        this.noOfPropellers = newNoOfPropellers;
    }
    int seatingCapacity = 150;
}

class AnAirplane extends AnAbstractAirplane{
    int getSeatingCapacity(){
        return seatingCapacity;
    }
    int getNoOfPropellers(){
        return noOfPropellers;
    }
    String getBrand(){
        return brand;
    }
    String getTypeOf(){
        return typeOf;
    }
    //int seatingCapacity =200; //If defined then overrides superclass's value
} 

class HelloWorld{
 public static void main(String []args){
        AnAirplane a1 = new AnAirplane();
        System.out.println(a1.getSeatingCapacity());
        //abstract classes cannot be instantiated.
     }
}
