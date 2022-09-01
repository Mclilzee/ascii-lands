/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ascii.lands;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the file path:");
        File file = new File(scanner.nextLine());
        List<String> content = fillFileContent(file);

        printMirroredContent(content);
    }

    private static void printFileContent(List<String> content) {
        for (String line : content) {
            System.out.println(line);
        }
    }

    private static void printMirroredContent(List<String> content) {
        for (String line : content) {
            System.out.println(line + " | " + reversedString(line));
        }
    }

    private static List<String> fillFileContent(File file) {
        List<String> content = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                content.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        return formatFileContent(content);
    }

    private static List<String> formatFileContent(List<String> content) {
        List<String> copyContent = new ArrayList<>(content);
        int longestStringLength = getLongestString(content);

        for (int i = 0; i < copyContent.size(); i++) {
            String line = copyContent.get(i);
            int difference = longestStringLength - line.length();
            copyContent.set(i, line + " ".repeat(difference));
        }

        return copyContent;
    }

    private static int getLongestString(List<String> content) {
        if (content.size() == 0) {
            return 0;
        }

        int longest = content.get(0).length();

        for (String line : content) {
            if (line.length() > longest) {
                longest = line.length();
            }
        }

        return longest;
    }

    private static String reversedString(String string) {
        StringBuilder reversed = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--) {
            reversed.append(getMirroredChar(string.charAt(i)));
        }

        return reversed.toString();
    }

    private static char getMirroredChar(char character) {
        return switch (character) {
            case '[' -> ']';
            case ']' -> '[';
            case '(' -> ')';
            case ')' -> '(';
            case '/' -> '\\';
            case '\\' -> '/';
            case '>' -> '<';
            case '<' -> '>';
            default -> character;
        };
    }
}
