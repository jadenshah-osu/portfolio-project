/*
 * Assumes tracks are strings formatted "Song,Artist"
 * Playlist will be represented as an array of String
 * Default value is ","
 * Max size 100 tracks
 * No duplicates
 */

// Methods

int size() {
    for (int i = 0, i < this.length; i++) {
        if (this[i].equals(",") && !this[i + 1].equals(",")) {
            result = i + 1;
        }
    }
    return result;
}

void add(String track) {
    pos = this.size();
    this[pos] = track;
}

void remove(String track) {
    for (int i = 0, i < this.length; i++) {
        if (this[i].equals(track)) {
            this[i] = ",";
            pos = i;
            i = this.length;
        }
    }
    for (int i = pos + 1; i = this.length, i++) {
        this[i] = this[i - 1];
    }
}

void swap(String track1, String track2) {
    int pos1 = -1;
    int pos2 = -1;
    for (int i = 0, i < this.length; i++) {
        if (this[i].equals(track1)) {
            pos1 = i;
        }
    }
    for (int i = 0, i < this.length; i++) {
        if (this[i].equals(track2) {
            pos2 = i;
        }
    }
    this[pos1] = track2;
    this[pos2] = track1;
}

void move(String track, int k) {
    /*
     * Uses swap to move a track to move a track to it's new position and adjust
     * the rest of the playlist.
     */
}

String[] shuffle() {
    // Uses swap to shuffle the playlist.
}

// Representation

void createNewRep() {
    String[] playlist = new String[100];
    for (int i = 0; i < 100; i++) {
        playlist[i] = ",";
    }
}

// Main method

public static void main(String[] args) {
    playlist = new playlist;
    String track1 = "Don't Forget Me,Maggie Rogers"
    String track2 = "KID AGAIN,Jon Bellion"
    String track3 = "Rising,Jasmine Myra"
    playlist.add(track1);
    playlist.add(track2);
    playlist.add(track3);
    String[] shuffledPlaylist = playlist.shuffle();
    return shuffledPlaylist;
}