package java_concepts.typecasting;

public class TypecastingMain {

    public static void main(String[] args) {

        Vehicle v1 = new Car();      // 1
        Vehicle v2 = new Vehicle();  // 2

    //    Car c0 = v1;  // Wrong Compile Tme Error. Type mismatch. Explicit casting is required.
        Car c1 = (Car)v1;  // Right Explicit Casting. V1 has knowledge of Car due to line 1

    //    Car c2 = (Car)v2;  // Wrong Runtime Exception - ClassCastException. V2 has no knowledge of Car.

    //    Bus b1 = new BMW(); // Wrong Compile Tme Error. Type mismatch.

        Car c3 = new BMW(); // Right. Upcasting or implicit casting.

    //    Car c4 = (BMW)v1;  //  Wrong Runtime Exception - ClassCastException. V1 can only be upcast to its parent or downcast to Car due to line 1.

        Object o = v1;

        Car c5 = (Car)v1;

        c1.print();  // Print Car
        c3.print();  // Print BMW
        c5.print();  // Print Car


    }
}
