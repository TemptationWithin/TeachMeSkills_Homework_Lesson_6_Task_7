package com.homeWork_Lesson_6_Task_7.handler;

public class TxtHandler extends Handler{
    private String fileName;
    private String sourceName;

    public TxtHandler(long size, String authorName, String fileName, String sourceName){
            super(size,authorName);
            this.fileName = fileName;
            this.sourceName = sourceName;
    }

    public static TxtHandler createDefaultFile(){
        System.out.println("Default txt file was created.");
        return new TxtHandler(0,"noName","noName","noName");
    }

    public void readingFile(){
        System.out.println("Reading txt file...");
    }

    public static void updateFile(TxtHandler txtFile, long size, String authorName, String fileName, String sourceName){
        System.out.println("Updating TXT file...");
        txtFile.setSize(size);
        txtFile.setAuthorName(authorName);
        txtFile.setFileName(fileName);
        txtFile.setSourceName(sourceName);
        System.out.println("Size was changed to: " + txtFile.getSize() + " byte");
        System.out.println("Author name was changed to : " + txtFile.getAuthorName());
        System.out.println("File name was changed to: " + txtFile.getFileName());
        System.out.println("Source name was changed to: " + txtFile.getSourceName());
    }

    public static void isTXTFilesFromOneSource(TxtHandler txtFile1, TxtHandler txtFile2){
        if (txtFile1.getSourceName().equals(txtFile2.getSourceName())){
            System.out.println("Those txt files from one source.");
        } else {
            System.out.println("Those txt files from different sources.");
        }
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }
}
