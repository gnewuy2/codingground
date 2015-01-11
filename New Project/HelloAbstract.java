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
