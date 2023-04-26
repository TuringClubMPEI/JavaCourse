package ru.turing.courses.lesson3.filippov;


public abstract class Record {
    protected String id;
    protected String info;

    public Record(String id, String info) {
        this.id = id;
        this.info = info;
    }


    public String getId() {
        return id;
    }

    public String getInfo() {
        return info;
    }


}
