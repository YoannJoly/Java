package tp15_fichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ManipulationFichier {

    public static void main(final String[] args) throws IOException {
        final Path path = Paths.get("recensement.csv");

        final String read = Files.readAllLines(path).get(0);

        System.out.println("Lecture de la premiere ligne du fichier: " + read);

        final Path cible = Paths.get("cible.csv");

        final String colHead = "Nom de la ville;Code departement;Population totale";

        Files.delete(cible);
        Files.createFile(cible);
        Files.write(cible, colHead.getBytes());

        final List<String> readCible = Files.readAllLines(cible);

        System.out.println("Cible: " + readCible);

    }

}
