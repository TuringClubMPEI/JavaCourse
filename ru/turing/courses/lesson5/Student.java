package ru.turing.courses.lesson5;

import java.util.Comparator;
import java.util.Objects;

/**
 * Класс Student с четырьмя полями: id, name, yearOfAdmission, phone,
 */
public class Student implements Comparable<Student> {
    private Long id;
    private String name;
    private int yearOfAdmission;
    private String phone;

    public Student(Long id, String name, int yearOfAdmission, String phone) {
        this.id = id;
        this.name = name;
        this.yearOfAdmission = yearOfAdmission;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * По умолчанию сортировка студентов по году поступления в институт
     *
     * @param other the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.yearOfAdmission, other.yearOfAdmission);
    }

    /**
     * сравнение 2-х студентов по полю name
     */
    public static Comparator<Student> COMPARE_BY_NAME = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }
    };

    /**
     * сравнение 2-х студентов по полю id
     */
    public static Comparator<Student> COMPARE_BY_ID = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.id.compareTo(o2.id);
        }
    };

    /**
     * сравнение 2-х студентов по полю phone
     */
    public static Comparator<Student> COMPARE_BY_PHONE = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.phone.compareTo(o2.phone);
        }
    };

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearOfAdmission=" + yearOfAdmission +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return yearOfAdmission == student.yearOfAdmission && Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, yearOfAdmission, phone);
    }
}
