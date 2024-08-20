package io.project.task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        String filePath = "src/main/resources/file/test_world.txt";
        try {

            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            List<String> words = Arrays.asList(content.split("\\s+"));


            Collections.sort(words);

            Map<String, Long> wordCountMap = words.stream()
                    .collect(Collectors.groupingBy(word -> word, Collectors.counting()));


            System.out.println("Статистика по словам:");
            wordCountMap.forEach((word, count) -> System.out.println(word + ": " + count));

            String mostFrequentWord = wordCountMap.entrySet().stream()
                    .max(Map.Entry.comparingByValue())
                    .map(Map.Entry::getKey)
                    .orElse(null);

            Long maxCount = wordCountMap.get(mostFrequentWord);

            System.out.println("Слово с максимальным количеством повторений: " + mostFrequentWord);
            System.out.println("Количество повторений: " + maxCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}