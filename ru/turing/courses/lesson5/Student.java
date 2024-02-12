package ru.turing.courses.lesson5;

import java.util.Comparator;
import java.util.Objects;

/**
 * Класс Student с тремя полями: id, name, phone
 */
public class Student {
    private Long id;
    private String name;
    private String phone;

    public Student(Long id, String name, String phone) {
        this.id = id;
        this.name = name;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    /**
     * перестановка 2-х элементов с индексами first, second массива String[]
     * @param array
     * @param first
     * @param second
     */
    private static void toSwap( String[] array, int first, int second){
        String buffer = array[first];
        array[first] =  array[second];
        array[second]= buffer;
    }

    /**
     * перестановка 2-х элементов с индексами first, second массива int[]
     * @param array
     * @param first
     * @param second
     */
    private static void toSwap( int[] array, int first, int second){
        int buffer = array[first];
        array[first] =  array[second];
        array[second]= buffer;
    }
    /**
     * сортировка пузырьком элементов в массиве String[]
     * @param array
     */
    public static void bubbleSort(String[] array){
        if(array==null)
            throw new NullArrayException();
        int len = array.length;
        for (int i = 0; i< len -1; i++){  //Внешний цикл
            for (int j = 0; j < len - i - 1; j++){       //Внутренний цикл
                if(array[j+1]!=null) {
                    if (array[j] == null) {
                        toSwap(array, j, j + 1);
                    } else if (array[j].length() > array[j + 1].length()) {
                        toSwap(array, j, j + 1);
                    }
                }
            }
        }
    }
    /**
     * сортировка пузырьком для массива int[]
     * @param array
     */
    public static void bubbleSort(int[] array){
        if(array==null)
            throw new NullArrayException();
        int len = array.length;
        for (int i = 0; i< len -1; i++){  //Внешний цикл
            for (int j = 0; j < len - i - 1; j++){       //Внутренний цикл
                if(array[j] > array[j + 1]) {
                    //Если порядок элементов нарушен
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(phone, student.phone) && Objects.equals(id, student.id) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone);
    }
}
