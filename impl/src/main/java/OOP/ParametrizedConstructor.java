package OOP;


/**
 * Parametrized constructor as it`s name states has parameters in it. It is used to initialize fields of the class with our own values.*/
public class ParametrizedConstructor {

    //parameters to pass in the constructor
    String carName;
    int quantity;

    public ParametrizedConstructor(String carName, int quantity){
        this.carName = carName;
        this.quantity = quantity;
    }


    //method to display parameters
    void getDetails(){
        System.out.println("Im buying: " + carName);
        System.out.println("only: " + quantity + " in stock.");
    }



    static void main() {

        //pass the values to the constructor which will be attached to the parameters
        ParametrizedConstructor parametrizedConstructor = new ParametrizedConstructor("Bmw i5", 3);
        parametrizedConstructor.getDetails();

    }
    /**
     * expected output is :
     * "Im buying: Bmw i5
     * only: 3 in stock."*/

}
