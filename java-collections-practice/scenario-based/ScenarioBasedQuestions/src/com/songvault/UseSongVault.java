package com.songvault;

/*
 * SongVault – Personal Music Library Manager
Story: Nina is a music enthusiast who collects .txt files, each representing a song in the
format:
Title: Bohemian Rhapsody
Artist: Queen
Duration: 5:55
Genre: Rock
With hundreds of such files, she wants to create SongVault, a desktop app that:
● Reads song files using I/O Streams
● Extracts fields using Regex
● Stores songs in a List<Song> and groups them by genre using Map<String,
List<Song>>
● Uses Set<String> to list unique artists
● Allows filtering and sorting using Java Streams
● Supports Generics for different types of media: audio, video, podcast
 */

import java.util.*;

public class UseSongVault {

    public static void main(String[] args) {

        // Read songs
        List<Song> songs = MusicUtils.readSongs("C:/Users/91743/Desktop/songs");

        //Display unique artists
        Set<String> artists = MusicUtils.uniqueCreators(songs);
        System.out.println("\n==============================");
        System.out.println(" UNIQUE ARTISTS (Audio) ");
        System.out.println("==============================");
        artists.forEach(System.out::println);

        //Group songs by genre
        Map<String, List<Song>> genreMap = MusicUtils.groupByType(songs, "genre");
        System.out.println("\n==============================");
        System.out.println(" SONGS BY GENRE ");
        System.out.println("==============================");
        for (String genre : genreMap.keySet()) {
            System.out.println("\n" + genre + ":");
            genreMap.get(genre).forEach(System.out::println);
        }

    }
}
