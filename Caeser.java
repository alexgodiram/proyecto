import java.io.*;
import java.nio.file.*;
import java.util.*;
public class Caeser {
    private int shift;

    public Caeser(int shift) {
        this.shift = shift;
    }

    public String encrypt(String text) {
        return shiftText(text, shift);
    }

    public String decrypt(String text) {
        return shiftText(text, -shift);
    }

    private String shiftText(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) ((c - base + shift + 26) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}

