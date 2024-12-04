import static org.junit.Assert.assertEquals;
import org.junit.Test;

public abstract class PlaylistKernelTest {

    @Test
    public final void testConstructor() {
        Playlist p = new PlaylistOnArray();
        assertEquals(0, p.trackCount());
    }

    @Test
    public final void testTrackCountZero() {
        Playlist p = new PlaylistOnArray();
        assertEquals(0, p.trackCount());
    }

    @Test
    public final void testTrackCountOne() {
        Playlist p = new PlaylistOnArray();
        PlaylistOnArray.Track t = p.new Track();
        t.title = "Song 1";
        p.add(t);
        assertEquals(1, p.trackCount());
    }

    @Test
    public final void testTrackCountMany() {
        Playlist p = new PlaylistOnArray();
        for (int i = 1; i <= 10; i++) {
            PlaylistOnArray.Track t = p.new Track();
            t.title = "Song " + i;
            p.add(t);
        }
        assertEquals(10, p.trackCount());
    }

    @Test
    public final void testAddZero() {
        Playlist p = new PlaylistOnArray();
        assertEquals(0, p.trackCount());
    }

    @Test
    public final void testAddOne() {
        Playlist p = new PlaylistOnArray();
        PlaylistOnArray.Track t = p.new Track();
        t.title = "Song 1";
        p.add(t);
        assertEquals(1, p.trackCount());
    }

    @Test
    public final void testAddMany() {
        Playlist p = new PlaylistOnArray();
        for (int i = 1; i <= 5; i++) {
            PlaylistOnArray.Track t = p.new Track();
            t.title = "Song " + i;
            p.add(t);
        }
        assertEquals(5, p.trackCount());
    }

    @Test
    public final void testRemoveZero() {
        Playlist p = new PlaylistOnArray();
        // Attempting to remove should have no effect
        assertEquals(0, p.trackCount());
    }

    @Test
    public final void testRemoveOne() {
        Playlist p = new PlaylistOnArray();
        PlaylistOnArray.Track t = p.new Track();
        t.title = "Song 1";
        p.add(t);
        p.remove(t);
        assertEquals(0, p.trackCount());
    }

    @Test
    public final void testRemoveMany() {
        Playlist p = new PlaylistOnArray();
        for (int i = 1; i <= 5; i++) {
            PlaylistOnArray.Track t = p.new Track();
            t.title = "Song " + i;
            p.add(t);
        }
        PlaylistOnArray.Track t = p.new Track();
        t.title = "Song 3"; // Removing a middle track
        p.remove(t);
        assertEquals(4, p.trackCount());
    }

    @Test
    public final void testSwapZero() {
        Playlist p = new PlaylistOnArray();
        // No-op, as there are no tracks
        assertEquals(0, p.trackCount());
    }

    @Test
    public final void testSwapOne() {
        Playlist p = new PlaylistOnArray();
        PlaylistOnArray.Track t = p.new Track();
        t.title = "Song 1";
        p.add(t);
        p.swap(0, 0); // Swap the only track with itself
        assertEquals("<Song 1, , >", p.toString());
    }

    @Test
    public final void testSwapMany() {
        Playlist p = new PlaylistOnArray();
        PlaylistOnArray.Track t1 = p.new Track();
        t1.title = "Song 1";
        PlaylistOnArray.Track t2 = p.new Track();
        t2.title = "Song 2";
        p.add(t1);
        p.add(t2);
        p.swap(0, 1);
        assertEquals("<Song 2, , ><Song 1, , >", p.toString());
    }

    @Test
    public final void testClearZero() {
        Playlist p = new PlaylistOnArray();
        p.clear();
        assertEquals(0, p.trackCount());
    }

    @Test
    public final void testClearOne() {
        Playlist p = new PlaylistOnArray();
        PlaylistOnArray.Track t = p.new Track();
        t.title = "Song 1";
        p.add(t);
        p.clear();
        assertEquals(0, p.trackCount());
    }

    @Test
    public final void testClearMany() {
        Playlist p = new PlaylistOnArray();
        for (int i = 1; i <= 5; i++) {
            PlaylistOnArray.Track t = p.new Track();
            t.title = "Song " + i;
            p.add(t);
        }
        p.clear();
        assertEquals(0, p.trackCount());
    }
}
