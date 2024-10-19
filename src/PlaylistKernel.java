public class Playlist extends Standard<Playlist> {

    public class Track {
        String title;
        String artist;
        String isrc;
    }

    track() {
        this.title = "";
        this.artist = "";
        this.isrc = "";
    }

    playlist() {
        Track[] playlist = new Track[100];
        for(int i = 0; i < 100; i++) {
            playlist[i] = new track();
        }
    }

    int trackCount() {
        for(int i = 0, i < 100; i++) {
            if(this[i].title.equals("")) {
                int result = i + 1;
                return result;
            }
        }
    }

    void add(Track track) {
        pos = this.trackCount();
        this[pos] = track;
    }

    void remove(Track track) {
        for(int i = 0, i < 100; i++) {
            if(this[i].title.equals(track.title)) {
                this[i].title = "";
                this[i].artist = "";
                this[i].isrc = "";
                int pos = i;
                break;
            }
        }
        for (int i = pos, i < 100; i++) {
            this[i] = this[i + 1];
        }
    }

    void swap(int pos1, int pos2) {
        Track temp1 = this[pos1];
        Track temp2 = this[pos2];
        this[pos1] = temp2;
        this[pos2] = temp1;
    }

}
