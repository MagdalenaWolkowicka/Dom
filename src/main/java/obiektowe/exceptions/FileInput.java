package obiektowe.exceptions;

import obiektowe.inheritance.point.Line;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInput {

    public List<Book> readBooks() throws BookMappingException {
        List<Book> bookList = new ArrayList<>();
        File file = new File("src\\main\\java\\obiektowe\\exceptions\\ksiazki.txt"); // ścieżka względna czyli od src ;)
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Book book = mapLineToBook(line);
                bookList.add(book);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return bookList;
    }

    private Book mapLineToBook(String line) throws BookMappingException {
        try {
            String[] elements = line.split(";");
            String title = elements[0];
            int year = Integer.parseInt(elements[1]);
            Book book = new Book(title, year);
            return book;

        } catch (Exception e) {
            //throw new Exception("Niepoprawny format pliku " + line);
            throw new BookMappingException("Niepoprawny format pliku dla linii: " + line, line);
        }

    }

    public static void main(String[] args) {
        FileInput input = new FileInput();
        try {
            System.out.println(input.readBooks());
        } catch (BookMappingException e) {
            System.out.println("Wystąpił wyjątek");
            System.out.println(e.getMessage());
            System.out.println(e.getLine());
        }

    }


}
