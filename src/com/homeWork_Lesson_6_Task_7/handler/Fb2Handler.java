package com.homeWork_Lesson_6_Task_7.handler;

public class Fb2Handler extends Handler{
    private String placeOnComputer;

    public Fb2Handler(long size, String authorName, String date, String placeOnComputer){
        super(size, authorName, date);
        this.placeOnComputer = placeOnComputer;
    }

    public static Fb2Handler createDefaultFile(){
        System.out.println("Default fb2 file was created.");
        return new Fb2Handler(0, "noName", "UnknownDate", "noPlace");
    }

    public void readingFile(){
        System.out.println("Reading fb2 file...");
    }

    public static void updateFile(Fb2Handler fb2File, long size, String authorName, String date, String placeOnComputer){
        System.out.println("Updating FB2 file...");
        fb2File.setSize(size);
        fb2File.setAuthorName(authorName);
        fb2File.setDate(date);
        fb2File.setPlaceOnComputer(placeOnComputer);
        System.out.println("Size was changed to: " + fb2File.getSize() + " byte.");
        System.out.println("Author name was changed to : " + fb2File.getAuthorName());
        System.out.println("Date was changed to: " + fb2File.getDate());
        System.out.println("Place place on the computer changed to: " + fb2File.getPlaceOnComputer());
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
