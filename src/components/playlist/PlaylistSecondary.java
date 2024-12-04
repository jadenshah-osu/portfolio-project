public abstract class PlaylistSecondary implements Playlist {

    @Override
    public void shuffle(Playlist source) {
        int size = source.trackCount();
        Random rand = new Random();
        for (int i = size - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            source.swap(i, j);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        int trackCount = 0;
        for (int i = 0; i < 100; i++) {
            if (this.playlist[i].title.equals("")) {
                trackCount = i; // Track count should be the last non-empty index
                break;
            }
        }
        for (int i = 0; i < trackCount; i++) {
            String title = this.playlist[i].title;
            String artist = this.playlist[i].artist;
            String isrc = this.playlist[i].isrc;
            result.append("<").append(title).append(", ").append(artist)
                    .append(", ").append(isrc).append(">");
        }
        return result.toString();
    }

    @Override
    public boolean equals(Playlist source) {
        for (int i = 0; i < 100; i++) {
            if (!this.playlist[i].title.equals(source.playlist[i].title)
                    || !this.playlist[i].artist
                            .equals(source.playlist[i].artist)
                    || !this.playlist[i].isrc.equals(source.playlist[i].isrc)) {
                return false;
            }
        }
        return true;
    }

}