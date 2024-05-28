package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();

        File gamesDir = new File("Games");
        if (gamesDir.mkdir()) {
            stringBuilder.append("Каталог Games успешно создан\n");
        }
        File srcDir = new File("Games/src");
        if (srcDir.mkdir()) {
            stringBuilder.append("Каталог src успешно создан\n");
        }
        File resDir = new File("Games/res");
        if (resDir.mkdir()) {
            stringBuilder.append("Каталог res успешно создан\n");
        }
        File tempDir = new File("Games/temp");
        if (tempDir.mkdir()) {
            stringBuilder.append("Каталог temp успешно создан\n");
        }
        File saveGamesDir = new File("Games/savegames");
        if (saveGamesDir.mkdir()) {
            stringBuilder.append("Каталог savegames успешно создан\n");
        }
        File mainDir = new File("Games/src/main");
        if (mainDir.mkdir()) {
            stringBuilder.append("Каталог main успешно создан\n");
        }
        File testDir = new File("Games/src/test");
        if (testDir.mkdir()) {
            stringBuilder.append("Каталог test успешно создан\n");
        }

        File mainFile = new File("Games/src/main/Main.java");
        try {
            if (mainFile.createNewFile()) {
                stringBuilder.append("Файл был создан\n");
            }
        } catch (IOException ex) {
            stringBuilder.append(ex.getMessage() + "\n"); }

        File utilsFile = new File("Games/src/main/Utils.java");
        try {
            if (utilsFile.createNewFile()) {
                stringBuilder.append("Файл был создан\n");
            }
        } catch (IOException e) {
            stringBuilder.append(e.getMessage() + "\n");
        }


        File drawablesDir = new File("Games/res/drawablesDir");
        if (drawablesDir.mkdir()) {
            stringBuilder.append("Каталог drawablesDir успешно создан\n");
        }

        File vectorsDir = new File("Games/res/vectors");
        if (vectorsDir.mkdir()) {
            stringBuilder.append("Каталог vectors успешно создан\n");
        }

        File iconsDir = new File("Games/res/icons");
        if (iconsDir.mkdir()) {
            stringBuilder.append("Каталог icons успешно создан\n");
        }

        File tempFile = new File("Games/temp/temp.txt");
        try {
            if (tempFile.createNewFile()) {
                stringBuilder.append("Файл был создан\n");
            }
        } catch (IOException eq) {
            stringBuilder.append(eq.getMessage() + "\n");
        }

        FileWriter fileWriter = new FileWriter(tempFile);
        fileWriter.write(stringBuilder.toString());
        fileWriter.close();
    }
}

