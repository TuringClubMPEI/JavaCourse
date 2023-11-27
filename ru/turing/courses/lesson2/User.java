package ru.turing.courses.lesson2;
import java.util.Scanner;
import java.time.LocalDate;
public class User {
    protected String fio;
    private String dateOfBirth; //дд.мм.гггг
    private String address;

    public User() {
    }

    public User(String fio, String dateOfBirth, String address) {
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getFio() {
        return fio;
    }

    public void setFio() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фио: ");
        this.fio = in.nextLine();
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату рождения в формате: (дд.мм.гггг)");
        this.dateOfBirth = in.nextLine();
    }

    public void getAddress() {
        String[] Address = address.split(",");
        System.out.println("Адрес: ");
        for (int i = 0; i < Address.length; i++){
            System.out.println(Address[i].trim());
        }
    }

    public void setAddress() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите адрес в формате: (страна,город,улица,дом,квартира)");
        this.address = in.nextLine();
    }

    public int fullYearCount(){
        LocalDate currentDate = LocalDate.now();
        String[] currentDataArray = currentDate.toString().split("-");
        int numberNow = Integer.parseInt(currentDataArray[2]);
        int monthNow = Integer.parseInt(currentDataArray[1]);
        int yearNow = Integer.parseInt(currentDataArray[0]);
        String[] data = dateOfBirth.split("\\.");
        int number = Integer.parseInt(data[0]);
        int month = Integer.parseInt(data[1]);
        int year = Integer.parseInt(data[2]);
        int fullyearcount = yearNow - year;
        if (monthNow > month){
            return fullyearcount;
        }
        else if (monthNow < month){
            return --fullyearcount;
        }
        else {
            if (numberNow >= number){
                return fullyearcount;
            }
            else{
                return --fullyearcount;
            }
        }
    }

    public int fullMonthCount(){
        LocalDate currentDate = LocalDate.now();
        String[] currentDataArray = currentDate.toString().split("-");
        int numberNow = Integer.parseInt(currentDataArray[2]);
        int monthNow = Integer.parseInt(currentDataArray[1]);
        int yearNow = Integer.parseInt(currentDataArray[0]);
        String[] data = dateOfBirth.split("\\.");
        int number = Integer.parseInt(data[0]);
        int month = Integer.parseInt(data[1]);
        int year = Integer.parseInt(data[2]);
        return (yearNow - year) * 12 + monthNow - 1;
    }
}

