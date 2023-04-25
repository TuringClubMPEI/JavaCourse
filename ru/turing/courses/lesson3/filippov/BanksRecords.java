package ru.turing.courses.lesson3.filippov;

import java.util.Objects;

public class BanksRecords extends Record {
    boolean availabilityOfCredit;

    public BanksRecords(String id, String info, boolean availabilityOfCredit) {
        super(id, info);
        this.availabilityOfCredit = availabilityOfCredit;
    }

    @Override
    public String getRecord() {
        return "Id:" + getId() + "\nPhone number:" + info  + "\nКредит одобрен:"+availabilityOfCredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BanksRecords that)) return false;
        return ((availabilityOfCredit == that.availabilityOfCredit) && getId().equals(that.getId()) && getInfo().equals(that.getInfo()));
        //тут я явно написал сравнения для строк
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityOfCredit);
    }
}
