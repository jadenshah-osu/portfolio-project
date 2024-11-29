/**
 * {@code playlist} of {@code Track} represented on an array.
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
            this[i] = new Track();
        }
    }

    public PlaylistOnArray() {
        this.createNewRep();
    }

    @Override
    public final void clear() {
        for (int i = 0; i < 100; i++) {
            this[i] = new Track();
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
            this[i] = source[i];
            source[i] = new Track();
        }
    }

    @Override
    public int trackCount() {
        for (int i = 0; i < 100; i++) {
            if (this[i].title.equals("")) {
                int result = i + 1;
                return result;
            }
        }
    }

    @Override
    public void add(Track track) {

    void add(Track track) {
        pos = this.trackCount();
        this[pos] = track;
    }

    }

    @Override
    public void remove(Track track) {
        for (int i = 0; i < 100; i++) {
            if (this[i].title.equals(track.title)) {
                this[i].title = "";
                this[i].artist = "";
                this[i].isrc = "";
                int pos = i;
                break;
            }
        }
        for (int i = pos; i < 100; i++) {
            this[i] = this[i + 1];
        }
    }

    @Override
    public void swap(int pos1, int pos2) {
        Track temp1 = this[pos1];
        Track temp2 = this[pos2];
        this[pos1] = temp2;
        this[pos2] = temp1;
    }

}
