package com.homeWork_Lesson_6_Task_7.handler;


public class PdfHandler extends Handler {
    private int pages;
    private int pictures;

    public PdfHandler(long size, String authorName, int pages, int pictures){
        super(size,authorName);
        this.pages = pages;
        this.pictures = pictures;
    }

    public static PdfHandler createDefaultFile(){
        System.out.println("Default pdf file was created.");
        return new PdfHandler(0, "noName", 0, 0);
    }

    public void readingFile(){
        System.out.println("Reading pdf file...");
    }

    public static void updateFile(PdfHandler pdfFile, long size, String authorName, int pages, int pictures){
        System.out.println("Updating PDF file...");
        pdfFile.setSize(size);
        pdfFile.setAuthorName(authorName);
        pdfFile.setPages(pages);
        pdfFile.setPictures(pictures);
        System.out.println("Size was changed to: " + pdfFile.getSize() + " byte");
        System.out.println("Author name was changed to : " + pdfFile.getAuthorName());
        System.out.println("Number of pages was changed to: " + pdfFile.getPages());
        System.out.println("Number of pictures was changed to: " + pdfFile.getPictures());
    }

    public static void isPicturesByOneAuthor(PdfHandler pdfFile1, PdfHandler pdfFile2){
        if (pdfFile1.getAuthorName().equals(pdfFile2.getAuthorName()) && (pdfFile1.getPictures() == pdfFile2.getPictures())){
            System.out.println("Those pictures in pdf files by one author");
        } else {
            System.out.println("Those pictures in pdf files by different author");
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPictures() {
        return pictures;
    }

    public void setPictures(int pictures) {
        this.pictures = pictures;
    }
}
