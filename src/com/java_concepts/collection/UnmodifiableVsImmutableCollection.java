package java_concepts.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableVsImmutableCollection {

    public static void main(String[] args) {

        /*

        Basically unModifiable Collection is a view, So indirectly it could still be 'modified' from some other reference that is modifiable.
        Also as its just a readonly view of annother collection , When the source collection changes unModifiable Collection will always present with latest values.

        However immutable Collection can be treated as a readonly copy of another collection and can not be modified.
        In this case when the source collection changes , immutable Collection do not reflect the changes


         */

        //ModifiableList
        List<String> modifiableList = new ArrayList<String>();
        modifiableList.add("a");

        System.out.println("modifiableList:" + modifiableList);
        System.out.println("--");

        System.out.println(" Modifiable List Size -- " + modifiableList.size());

        //unModifiableList
        List<String> unModifiableList = Collections.unmodifiableList(modifiableList);

        modifiableList.add("b");

        boolean exceptionThrown = false;
        try {
            unModifiableList.add("b");
            System.out.println("add supported for unModifiableList!!");
        } catch (UnsupportedOperationException e) {
            exceptionThrown = true;
            System.out.println("unModifiableList.add() not supported");
        }
        System.out.println("Exception Thrown -- " + exceptionThrown);

        System.out.println("modifiableList:" + modifiableList);
        System.out.println("unModifiableList:" + unModifiableList);

        System.out.println(" Modifiable List Size -- " + modifiableList.size());
        System.out.println(" UnModifiable List Size -- " + unModifiableList.size());
        System.out.println("--");


        //immutableList


        List<String> immutableList = Collections.unmodifiableList(new ArrayList<String>(modifiableList));

        modifiableList.add("c");

        exceptionThrown = false;
        try {
            immutableList.add("c");
            System.out.println("add supported for immutableList!!");
        } catch (UnsupportedOperationException e) {
            exceptionThrown = true;
            System.out.println("immutableList.add() not supported");
        }

        System.out.println("Exception Thrown -- " + exceptionThrown);


        System.out.println("modifiableList:" + modifiableList);
        System.out.println("unModifiableList:" + unModifiableList);
        System.out.println("immutableList:" + immutableList);
        System.out.println("--");

        System.out.println(" Modifiable List Size -- " + modifiableList.size());
        System.out.println(" UnModifiable List Size -- " + unModifiableList.size());
        System.out.println(" Immutable List Size -- " + immutableList.size());

    }
}

