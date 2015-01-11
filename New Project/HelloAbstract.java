public abstract class HelloWorld{
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
