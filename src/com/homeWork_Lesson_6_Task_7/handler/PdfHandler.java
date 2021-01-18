package com.homeWork_Lesson_6_Task_7.handler;


public class PdfHandler extends AFileHandler {
    private int pages;
    private int pictures;

    public PdfHandler(long size, String authorName, int pages, int pictures){
        super(size,authorName);
        this.pages = pages;
        this.pictures = pictures;
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
