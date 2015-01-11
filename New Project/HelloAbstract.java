abstract class HelloWorld{
    int seatingCapacity;
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

//"extends" = inherits fully or partially
//"implements" = concretizes fully

abstract class AnAbstractAirplane extends HelloWorld{
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
    int seatingCapacity = 200;
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
} 

//If public interface then it needs to be declared in a file named 
//IntAirPlane.java
interface IntAirplane{
    void setSeatingCapacity(int newCapacity);
    void setBrand(String newBrand);
    void setTypeOf(String newTypeOf);

}

//If public class ten it needs to be declared in a
//separate file named AnIntAirplane.java
class AnIntAirplane implements IntAirplane{
    int seatingCapacity;
    String brand;
    String typeOf;
    public void setSeatingCapacity(int newCapacity){
        this.seatingCapacity = newCapacity;
    }
    // this public void was necessary, or it cannot implement the itnerface
    public void setBrand(String newBrand){
        this.brand = newBrand;
    }
    public void setTypeOf(String newTypeOf){
        this.typeOf = newTypeOf;
    }
}
