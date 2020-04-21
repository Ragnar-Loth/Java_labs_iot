package manager;

import model.AbstractInstrument;
import model.SortType;

import java.util.LinkedList;
import java.util.List;

public class InstrumentManager {

    protected List<AbstractInstrument> instruments = new LinkedList<>();

    public InstrumentManager( List<AbstractInstrument> instruments){
        this.instruments = instruments;
    }
    public InstrumentManager() {
    }
    public List<AbstractInstrument> findInstrumentByMaterial(String material){
        List<AbstractInstrument> foundInstruments = new LinkedList<>();
          for (AbstractInstrument instrument : instruments){
              if(instrument.getMaterialMade().equals(material)){
                foundInstruments.add(instrument);
              }
          }
          return foundInstruments;

    }
}
