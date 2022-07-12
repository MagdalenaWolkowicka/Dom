package obiektowe.exceptions.task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileConnection {

    private boolean connected = false;

    public void connect() throws FileConnectionException {
        Random random = new Random();
        double randomPercent = random.nextDouble();
        if (randomPercent < 0.25) {  // 25% szans ze rzuci wyjątek (przerwie prace programu)
            throw new FileConnectionException();
        }
        connected = true;

    }

    public void disconnect() {
        connected = false;
    }

    public List<String > getBooksFromFile() throws FileDbConnectionException {
        File file = new File("src\\main\\java\\obiektowe\\exceptions\\ksiazki.txt");
        List <String> lines = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null) {
                lines.add(line);
                line = bufferedReader.readLine();
            }

            if (lines.isEmpty()) {
                throw new FileDbConnectionException("Plik jest pusty");
            }

        } catch (IOException e) {
            throw  new FileDbConnectionException("Nie znaleziono pliku");
        }
        return lines;
    }

    @Override
    public String toString() {
        return "FileConnection{" +
                "connected=" + connected +
                '}';
    }
}
