package com.sorting.gamerzone;

public class QuickSortHighScore {

    // Quick Sort
    public void quickSort(Player[] players, int low, int high) {
        if (low < high) {
            int p = partition(players, low, high);
            quickSort(players, low, p - 1);
            quickSort(players, p + 1, high);
        }
    }

    // Partition (descending order by score)
    private int partition(Player[] players, int low, int high) {

        int pivot = players[high].score;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (players[j].score > pivot) { // higher score first
                i++;
                swap(players, i, j);
            }
        }

        swap(players, i + 1, high);
        return i + 1;
    }

    private void swap(Player[] players, int i, int j) {
        Player temp = players[i];
        players[i] = players[j];
        players[j] = temp;
    }
}
