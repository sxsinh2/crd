package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;



/**
 * Unit test for simple App.
 */
class CarRentalTest {
    ArrayList<Car> inv = CarRental.getInventoryList();

    @Test
    public void testGetInventoryList() {
        ArrayList<String> carTypeList = new ArrayList<String>();
        for (Car i : inv){
            carTypeList.add(i.getType());
        }
        boolean allCarTypes = false;
        if(carTypeList.contains("SUV") && carTypeList.contains("Sedan") && carTypeList.contains("Van")){
            allCarTypes = true;
        }

        assertEquals(true, allCarTypes);
    }
}
