package com.songvault;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class MusicUtils {

    // Regex for song files
    static Pattern titlePattern = Pattern.compile("^Title:\\s*(.*)$");
    static Pattern artistPattern = Pattern.compile("^Artist:\\s*(.*)$");
    static Pattern durationPattern = Pattern.compile("^Duration:\\s*(.*)$");
    static Pattern genrePattern = Pattern.compile("^Genre:\\s*(.*)$");

    // Read Audio Songs
    public static List<Song> readSongs(String folderPath) {
        List<Song> songs = new ArrayList<>();
        File folder = new File(folderPath);

        if (!folder.exists() || !folder.isDirectory()) return songs;

        File[] files = folder.listFiles((f) -> f.getName().endsWith(".txt"));
        if (files == null) return songs;

        for (File file : files) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line, title="", artist="", duration="", genre="";

                while ((line = br.readLine()) != null) {
                    Matcher m;
                    m = titlePattern.matcher(line);
                    if (m.find()) title = m.group(1);

                    m = artistPattern.matcher(line);
                    if (m.find()) artist = m.group(1);

                    m = durationPattern.matcher(line);
                    if (m.find()) duration = m.group(1);

                    m = genrePattern.matcher(line);
                    if (m.find()) genre = m.group(1);
                }

                if (!title.isEmpty() && !artist.isEmpty()) {
                    songs.add(new Song(title, artist, duration, genre));
                }

            } catch (Exception e) {
                System.out.println("Skipped " + file.getName());
            }
        }
        return songs;
    }

    // Generic grouping by genre/topic
    public static <T extends Media<?>> Map<String, List<T>> groupByType(List<T> mediaList, String keyField) {
        Map<String, List<T>> map = new HashMap<>();
        for (T media : mediaList) {
            String key = "";
            if (media instanceof Song && keyField.equalsIgnoreCase("genre")) {
                key = ((Song) media).genre;
            } else if (media instanceof Video && keyField.equalsIgnoreCase("genre")) {
                key = ((Video) media).genre;
            } else if (media instanceof Podcast && keyField.equalsIgnoreCase("topic")) {
                key = ((Podcast) media).topic;
            }

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(media);
        }
        return map;
    }

    // List unique artists/hosts/directors
    public static <T extends Media<?>> Set<String> uniqueCreators(List<T> mediaList) {
        Set<String> set = new HashSet<>();
        for (T media : mediaList) {
            if (media instanceof Song) set.add(((Song) media).artist);
            else if (media instanceof Video) set.add(((Video) media).director);
            else if (media instanceof Podcast) set.add(((Podcast) media).host);
        }
        return set;
    }
}
