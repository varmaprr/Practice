package com.varma.ds.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by varma on 3/18/2018.
 */
public class MostFrequentWordInArray {

    public static class Word implements Comparable<Word> {

        public String word;
        public Integer count;

        @Override
        public boolean equals(Object obj) {
            return word.equals(((Word) obj).word);
        }

        @Override
        public int hashCode() {
            return word.hashCode();
        }

        @Override
        public int compareTo(Word w) {
            return w.count - count;
        }
    }

    public static void main(String[] args) {
        String[] array = {"the", "of", "the", "and", "a", "to", "in", "is", "you", "that", "it", "he", "was", "for", "on", "are", "as", "with", "his", "they", "I", "at", "be", "this", "have", "from", "or", "one", "had", "by", "word", "but", "not", "what", "all", "were", "we", "when", "your", "can", "said", "there", "use", "an", "each", "which", "she", "do", "how", "their", "if", "will", "up", "other", "about", "out", "many", "then", "them", "these", "so", "some", "her", "would", "make", "like", "him", "into", "time", "has", "look", "two", "more", "write", "go", "see", "number", "no", "way", "could", "people", "my", "than", "first", "water", "been", "call", "who", "oil", "its", "now", "find", "long", "down", "day", "did", "get", "come", "made", "may", "part"};
        frequentWordInArray(array);
    }

    private static String frequentWordInArray(String[] arr) {

        HashMap<String, Word> wordMap = new HashMap<>();

        for (String s : arr) {

            Word word = wordMap.get(s);
            if (word == null) {
                word = new Word();
                word.count = 0;
                word.word = s;
            }

            ++word.count;

            wordMap.put(s, word);
        }

        SortedSet<Word> wordSet = new TreeSet<>(wordMap.values());

        IntStream.range(0, wordSet.size()).forEach(i -> {
            System.out.println(wordSet.first().word);
            wordSet.remove(wordSet.first());
        });

        return null;
    }
}
