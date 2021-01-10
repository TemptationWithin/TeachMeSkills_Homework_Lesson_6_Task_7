package com.homeWork_Lesson_6_Task_7.handler;

public class Handler {
    private long size;
    private String authorName;
    private String date;
    private String extension;

    public Handler(long size, String authorName, String date){
        this.size = size;
        this.authorName = authorName;
        this.date = date;
    }

    public Handler(long size, String authorName) {
        this.size = size;
        this.authorName = authorName;
    }

    public static Handler createDefaultFile(){
        System.out.println("UnknownFile was created. I am not sure that we can work with it.");
        return new Handler(0, "Unknown");
    }

    public void readingFile(){
        System.out.println("Reading unknown file... Is is elf language???");
    }

    public static void updateFile(Handler file, long size, String authorName, String date) {
        file.setSize(size);
        file.setAuthorName(authorName);
        file.setDate(date);
        System.out.println("Size was set to: " + file.getSize() + " byte.");
        System.out.println("Author name was set to : " + file.getAuthorName());
        System.out.println("Date was changed to : " + file.getDate());
    }


    public void delete(){
        System.out.println("File was deleted!");
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
