package de.neuefische.studendb.model;

public class EconomicsStudent extends Student{
    private String anzahlModule;

    public EconomicsStudent(String name, String id, String anzahlModule) {
        super(name, id);
        this.anzahlModule = anzahlModule;
    }



    public String getAnzahlModule() {
        return anzahlModule;
    }

    public void setAnzahlModule(String anzahlModule) {
        this.anzahlModule = anzahlModule;
    }

    @Override
    public String toString() {
        return """
                EconomicsStudent{name= %s, id= %s , Anzahl Module= %s}
                """.formatted(getName(), getId(), anzahlModule);

    }
}
