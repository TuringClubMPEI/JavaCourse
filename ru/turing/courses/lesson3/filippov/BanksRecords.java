package ru.turing.courses.lesson3.filippov;

import java.util.Objects;

public class BanksRecords extends Record {
    private boolean availabilityOfCredit;

    public BanksRecords(String id, String info, boolean availabilityOfCredit) {
        super(id, info);
        this.availabilityOfCredit = availabilityOfCredit;
    }

    @Override
    public String toString() {
        return "Id:" + getId() + "\nPhone number:" + info  + "\nКредит одобрен:"+availabilityOfCredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BanksRecords)) return false;
        BanksRecords that = (BanksRecords) o;
        return ((availabilityOfCredit == that.availabilityOfCredit) && getId().equals(that.getId()) && getInfo().equals(that.getInfo()));
        //тут я явно написал сравнения для строк
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityOfCredit);
    }
}
