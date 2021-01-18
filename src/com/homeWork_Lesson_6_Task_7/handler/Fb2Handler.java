package com.homeWork_Lesson_6_Task_7.handler;



public class Fb2Handler extends AFileHandler {
    private String placeOnComputer;

    public Fb2Handler(long size, String authorName, String date, String placeOnComputer){
        super(size, authorName, date);
        this.placeOnComputer = placeOnComputer;
    }


    public static void isFilesInOneFolder(Fb2Handler fb2File1, Fb2Handler fb2File2){
        if (fb2File1.getPlaceOnComputer().equals(fb2File2.getPlaceOnComputer())){
            System.out.println("Books in the one folder on the computer.");
        } else {
            System.out.println("Books in different folders on the computer.");
        }
    }


    public String getPlaceOnComputer() {
        return placeOnComputer;
    }

    public void setPlaceOnComputer(String placeOnComputer) {
        this.placeOnComputer = placeOnComputer;
    }
}
