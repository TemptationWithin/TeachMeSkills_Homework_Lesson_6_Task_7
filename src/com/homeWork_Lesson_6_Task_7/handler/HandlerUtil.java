package com.homeWork_Lesson_6_Task_7.handler;


public class HandlerUtil {


    public static AFileHandler createDefaultFile(String type) {
        AFileHandler file = null;
        switch (type){
            case ("txt"):
                file = new  TxtHandler(0, "unknownAuthor", "unknownName","unknownSource");
                System.out.println("default txt file was created");
                break;
            case("pdf"):
                file = new PdfHandler(0,"unknownAuthor", 0, 0);
                System.out.println("default pdf file was created");
                break;
            case("fb2"):
                file = new Fb2Handler(0,"unknownAuthor","unknownDate", "unknownPlace");
                System.out.println("default fb2 file was created");
                break;
            default:
                System.out.println("unknown type of file. File wasn't created");
                break;
        }

        if (file.equals(null)){
            System.out.println("Unknown type of file. File wasn't created");
            throw new NullPointerException();
        }

        return file;
    }


    public static void updateFile(AFileHandler file){
        System.out.println(file.getExtension() + " file was updated");
    }

    public static void readingFile(AFileHandler file){
        System.out.println("Reading " + file.getExtension() + " file...");
     }

    public static void delete(AFileHandler file){
        System.out.println("File was deleted!");
    }
}
