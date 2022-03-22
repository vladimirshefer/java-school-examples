package learning.word_count;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

  public static final Logger logger = Logger.getLogger("Main");

  public static void main(String[] args) throws IOException {
    // дан файл с текстом
    // считать текст, разбить на строчки и слова
    // посчитать количество разных слов в каждой строчке
    // раздел в java - IO Input/Output
    // InputStream, OutputStream, Reader, Writer

    // 1. считать текст в массив строчек
    // 2. разбить каждую строчку на массив (список) слов

    BufferedReader reader = new BufferedReader(
        new InputStreamReader(
            Main.class.getResourceAsStream("/text.txt")
        )
    );

    logger.log(Level.INFO, "Opened file");

    List<String> lines = Main.readAllLines(reader);

    List<String> textWords = new ArrayList<>();

    for (String textLine : lines) {
      List<String> lineWords = Main.getWords(textLine);
      textWords.addAll(lineWords);
    }

    Map<String, Integer> wordCount = getWordCount(textWords);
//    System.out.println(wordCount);

    List<Entry<String, Integer>> entries1 = new ArrayList<>(wordCount.entrySet());
    entries1.sort(Entry.comparingByValue());
    for (int i = entries1.size() - 1; i >= 0; i--) {
      Entry<String, Integer> stat = entries1.get(i);
      System.out.println(stat);
    }

    // [["Разнообразный", "и", "богатый", ...], ["Товарищи!", "сложившаяся", ...]]
    // [{"Разнообразный": 1, "и": 7, ...}, {...}]

//    System.out.println(lines);

  }

  private static Map<String, Integer> getWordCount(List<String> words) {
    Map<String, Integer> result = new HashMap<>();
    for (String word : words) {
      // 2. Если слово уже есть в словаре - то переписать значение на X+1;
      if (result.containsKey(word)) {
        Integer currentAmount = result.get(word);
        result.put(word, currentAmount + 1);
      }
      // 1. Если слова еще нет в словаре - добавить что оно используется 1 раз.
      else {
        result.put(word, 1);
      }
    }

    return result;
  }

  private static List<String> getWords(String line) {
    String[] s = line.split(" ");
    List<String> words = Arrays.asList(s);
    return words;
  }

  private static List<String> readAllLines(BufferedReader reader) throws IOException {
    List<String> lines = new ArrayList<>();
    while (true) {
      String line = reader.readLine();
      if (line == null) {
        break;
      }
      lines.add(line);
    }
    return lines;
  }

}
