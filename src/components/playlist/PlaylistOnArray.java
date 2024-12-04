/**
 * {@code Playlist} of {@code Track} represented on an array.
 *
 * @convention {@code playlist} is an array of size 100 of {@code Track}. All
 *             spots in the array should be filled with the default value of
 *             {@code track}. There should be no spots with default value
 *             between spots that have been filled in.
 * @correspondence {@code playlist} corresponds to the list of {@code Track}.
 *                 {@code this[i]} represents the {@code Track} at position
 *                 {@code i}.
 */
public class PlaylistOnArray extends PlaylistSecondary {

    class Track {
        String title;
        String artist;
        String isrc;

        public Track() {
            this.title = "";
            this.artist = "";
            this.isrc = "";
        }
    }

    Track[] playlist;

    private void createNewRep() {
        this.playlist = new Track[100];
        for (int i = 0; i < 100; i++) {
            this.playlist[i] = new Track();
        }
    }

    public PlaylistOnArray() {
        this.createNewRep();
    }

    @Override
    public final void clear() {
        for (int i = 0; i < 100; i++) {
            this.playlist[i] = new Track();
        }
    }

    @Override
    public final Playlist newInstance() {
        Playlist result = new PlaylistOnArray();
        return result;
    }

    @Override
    public final void transferFrom(Playlist source) {
        int sourceCount = source.trackCount();
        for (int i = 0; i < sourceCount; i++) {
            this.playlist[i] = source.playlist[i];
            source.playlist[i] = new Track();
        }
    }

    @Override
    public int trackCount() {
        for (int i = 0; i < 100; i++) {
            if (this.playlist[i].title.equals("")) {
                return i;
            }
        }
        return 100;
    }

    @Override
    public void add(Track track) {
        int pos = this.trackCount();
        if (pos < 100) {
            this.playlist[pos] = track;
        }
    }

    @Override
    public void remove(Track track) {
        int pos = -1;
        for (int i = 0; i < 100; i++) {
            if (this.playlist[i].title.equals(track.title)) {
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            this.playlist[pos] = new Track();
            for (int i = pos; i < 99; i++) {
                this.playlist[i] = this.playlist[i + 1];
            }
            this.playlist[99] = new Track();
        }
    }

    @Override
    public void swap(int pos1, int pos2) {
        if (pos1 >= 0 && pos1 < 100 && pos2 >= 0 && pos2 < 100) {
            Track temp = this.playlist[pos1];
            this.playlist[pos1] = this.playlist[pos2];
            this.playlist[pos2] = temp;
        }
    }

}
