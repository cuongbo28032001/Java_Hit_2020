package main;

import person.Person;

public class Runmain {
    public static void main(String[] args) {
        Person DoanXinhGai = new Person();
        Person DiepBeDe = new Person();

        DoanXinhGai.setName("Vũ Văn Doan");
        DoanXinhGai.setGender("Nam");
        DoanXinhGai.setDateOfBirth("Không rõ");
        DoanXinhGai.setHobby("Code dạo");
        System.out.println("Tên:" +DoanXinhGai.getName()+ " - Giới Tính:" +DoanXinhGai.getGender()+ " - Ngày Sinh:" +DoanXinhGai.getDateOfBirth()+ " - Sở Thích:" +DoanXinhGai.getHobby());
        DiepBeDe.setName("Đức Điệp");
        DiepBeDe.setGender("3 pha");
        DiepBeDe.setDateOfBirth("Không rõ");
        DiepBeDe.setHobby("Cưa troai");
        System.out.print("Tên:" +DiepBeDe.getName()+ " - Giới Tính:" +DiepBeDe.getGender()+ " - Ngày Sinh:" +DiepBeDe.getDateOfBirth()+ " - Sở Thích:" +DiepBeDe.getHobby());

    }
}