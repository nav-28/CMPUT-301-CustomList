import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest(){
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteCityTest(){
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertTrue(list.deleteCity(city));
    }

    @Test
    public void countCityTest(){
        int listS = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(), listS+1);
    }
}
