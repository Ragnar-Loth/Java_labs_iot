package ua.lviv.iot.manager;

import model.AbstractInstrument;
import org.junit.jupiter.api.BeforeEach;

import java.util.LinkedList;
import java.util.List;

public class BaseInstrumentTest {
    protected List<AbstractInstrument> instruments;

    @BeforeEach
    public void createInstruments(){
        this.instruments = new LinkedList<AbstractInstrument>();
        this.instruments.add(new AbstractInstrument(50.0,1993,"Band","glass"));
        this.instruments.add(new AbstractInstrument(2000.0,2019,"GDrob","metal"));
        this.instruments.add(new AbstractInstrument(2500.0,2018,"Chabarok","plastic"));
    }
}
