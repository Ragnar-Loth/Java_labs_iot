package ua.lviv.iot.manager;

import manager.InstrumentManager;
import model.AbstractInstrument;
import model.SortType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class InstrumentManagerTest extends BaseInstrumentTest {

    @Test
    public void testFindInstrumentByType() {
        InstrumentManager manager = new InstrumentManager(instruments);

        List<AbstractInstrument> result = manager.findInstrumentByMaterial("metal");
        result.addAll(manager.findInstrumentByMaterial("plastic"));
        assertEquals(result.get(0).getBrandOfProduction(),"GDrob");
        assertEquals(result.get(1).getBrandOfProduction(),"Chabarok");


    }
}
