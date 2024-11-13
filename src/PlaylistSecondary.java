public abstract class PlaylistSecondary implements Playlist {

    shuffle(Playlist playlist) {
        size = playlist.trackCount();
        Random rand = new Random();
        for(int i = size; i > 0, i--) {
            int j = rand.nextInt(i + 1);
            playlist.swap(i, j);
        }
    }

    @Override
    String toString() {
        String result = "";
        int trackCount = 0;
        for(int i = 0, i < 100; i++) {
            if(this[i].title.equals("")) {
                trackCount = i + 1;
                break;
            }
        }
        for (int i = 0; i < trackCount; i++) {
            String title = this[i].title;
            String artist = this[i].artist;
            String isrc = this[i].isrc;
            result = result + "<" + title + ", " + artist + ", "+ isrc + ">";
        }
        return result;
    }

    @Override
    boolean equals(Playlist playlist) {
        boolean result = true;
        for (int i = 0; i < 100; i++) {
            if (this[i].title != playlist[i].title
                    || this[i].artist != playlist[i].artist
                    || this[i].isrc != playlist[i].isrc) {
                result = false;
            }
        }
        return result;
    }

}