package ru.turing.courses.lesson2;

public class Solution {
    public static class Human {
        private int age;
        private String name;
        private boolean sex;
        private String coutry;
        private String city;
        private String street;
        private int homenum;
        private int roomnum;


        public Human(int age, String name, boolean sex, String coutry, String city, String street, int homenum, int roomnum) {
            this.age = age;
            this.name = name;
            this.sex = sex;
            this.coutry = coutry;
            this.city = city;
            this.street = street;
            this.homenum = homenum;
            this.roomnum = roomnum;
        }

        public void setCoutry(String coutry) {
            this.coutry = coutry;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setHomenum(int homenum) {
            this.homenum = homenum;
        }

        public void setRoomnum(int roomnum) {
            this.roomnum = roomnum;
        }

        public String getCoutry() {
            return coutry;
        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public int getHomenum() {
            return homenum;
        }

        public int getRoomnum() {
            return roomnum;
        }

        //????? ??? ????????? ?????? ???
        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public boolean isSex() {
            return sex;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSex(boolean sex) {
            this.sex = sex;
        }

        //lived months method
        public int months() {
            return (this.age * 12);
        }

        //adress print method
        public void adress() {
            System.out.println("Adress: " + this.coutry + ", " + this.city + ", " + this.street + ", " + this.homenum + ", " + this.roomnum);

        }
        }
    }


