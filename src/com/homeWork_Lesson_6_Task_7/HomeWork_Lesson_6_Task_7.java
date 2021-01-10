package com.homeWork_Lesson_6_Task_7;

import com.homeWork_Lesson_6_Task_7.handler.*;

import java.util.Scanner;

/**
 * ЗАДАНИЕ 7
 * 	Написать проект для обработки пришедших в программу файлов, состоящий из нескольких классов.
 * 	Файлы реально обрабатывать не будет(вернее будем, но через несколько занятий).
    Пока же пусть все методы выводят на консоль сообщения через System.out.println(ваш текст)
 * 	Тип обрабатываемого файла будет вводиться с консоли(например, txt, pdf...).
 * 	Для каждого типа файлов создать свой класс. Для всех типов файлов будет хранить следующие поля: размер файла, автор файла, дата создания файла.
 * 	Так же придумать для каждого конкретного класса-файла еще пару своих собственных полей.
 * 	Для каждого типа класса реализовать свой CRUD-обработчик.
    Причем метод удаления файла пусть будет одинаков для всех типов файлов и просто выводит на консоль строку "файл удален".
 * 	Каждый класс, описывающий файл должен иметь конструктор с параметрами.
 * 	Так же реализовать возможность сравнения двух экземпляров одного класса.
 * 	Все логически схожие классы разместить по пакетам(мы эту тему еще не затрагивали, но давайте начнем ее в этом задании).
 *
 * 	Что практикуем в этом задании:
 * 		- тут специально ничего не пишу, т.к. это творческое задание на проектирование программы.
 */
public class HomeWork_Lesson_6_Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                   // scanner opened
        System.out.println("Enter your file type: ");
        String type = scanner.nextLine();
        scanner.close();                                            // scanner closed

        Handler file = createDefaultFile(type);
        file.setExtension(type);                                    // setting file extension
        file.readingFile();
        updateFile(file);
        file.delete();
        System.out.println("  ");

                            // checking if the comparison of files of the same type //
        TxtHandler txtFile1 = new TxtHandler(16000, "Petrov", "Brigantina", "Wikipedia");
        TxtHandler txtFile2 = new TxtHandler(16200, "Petrov", "Brigantina_2", "BooksStorage");
        TxtHandler txtFile3 = new TxtHandler(16420, "Petrov", "Brigantina", "Wikipedia");
        TxtHandler.isTXTFilesFromOneSource(txtFile1,txtFile2);
        TxtHandler.isTXTFilesFromOneSource(txtFile1,txtFile3);
        System.out.println(" ");

        PdfHandler pdfFile1 = new PdfHandler(16300, "Simonov", 26, 14);
        PdfHandler pdfFile2 = new PdfHandler(16920, "Simonova", 23, 14);
        PdfHandler pdfFile3 = new PdfHandler(16710, "Simonov", 26, 17);
        PdfHandler pdfFile4 = new PdfHandler(16730, "Simonov", 22, 14);
        PdfHandler.isPicturesByOneAuthor(pdfFile1, pdfFile2);
        PdfHandler.isPicturesByOneAuthor(pdfFile1, pdfFile3);
        PdfHandler.isPicturesByOneAuthor(pdfFile1, pdfFile4);
        System.out.println(" ");

        Fb2Handler fb2File1 = new Fb2Handler(36200, "Ivanov", "05.09.2009", "C/: books");
        Fb2Handler fb2File2 = new Fb2Handler(38900, "Karpov", "01.04.1963", "C/: books");
        Fb2Handler fb2File3 = new Fb2Handler(36200, "Hvorin", "06.12.1757", "D/: books / MyBooks");
        Fb2Handler.isFilesInOneFolder(fb2File1,fb2File2);
        Fb2Handler.isFilesInOneFolder(fb2File1,fb2File3);
    }

    public static Handler createDefaultFile(String type){
        Handler file;
        switch (type){
            case ("txt"):
                return file = TxtHandler.createDefaultFile();
            case ("pdf"):
                return file = PdfHandler.createDefaultFile();
            case ("fb2"):
                return file = Fb2Handler.createDefaultFile();
            default:
                System.out.println("Wrong type of file.");
                return file = Handler.createDefaultFile();
        }
    }
    public static void updateFile(Handler file){
        switch (file.getExtension()){
            case ("txt"):
                TxtHandler.updateFile((TxtHandler) file, 12500, "Nikolay Nosov", "Skazki i povesti", "Wikipedia");
                break;
            case ("pdf"):
                PdfHandler.updateFile((PdfHandler) file, 42000, "Pushkin", 65, 5);
                break;
            case ("fb2"):
                Fb2Handler.updateFile((Fb2Handler) file, 16520, "Popov", "05.08.1895", "C/books");
                break;
            default:
                System.out.println("For some reason I can't change this file. Magically, the file started changing on its own:");
                Handler.updateFile(file, 10520, "AncientElfPriest", "16000 days after creating New Moon");
                break;
        }
    }
}
