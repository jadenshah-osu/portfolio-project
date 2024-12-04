import static org.junit.Assert.assertEquals;
import org.junit.Test;

public abstract class PlaylistSecondaryTest {

        @Test
        public final void testShuffleZero() {
                Playlist p = new PlaylistOnArray();
                p.shuffle(p);
                assertEquals(0, p.trackCount());
        }

        @Test
        public final void testShuffleOne() {
                Playlist p = new PlaylistOnArray();
                PlaylistOnArray.Track t = p.new Track();
                t.title = "Song 1";
                p.add(t);
                p.shuffle(p);
                assertEquals(1, p.trackCount());
        }

        @Test
        public final void testShuffleMany() {
                Playlist p = new PlaylistOnArray();
                for (int i = 1; i <= 5; i++) {
                        PlaylistOnArray.Track t = p.new Track();
                        t.title = "Song " + i;
                        p.add(t);
                }
                p.shuffle(p);
                assertEquals(5, p.trackCount());
        }

        @Test
        public final void testToStringZero() {
                Playlist p = new PlaylistOnArray();
                assertEquals("", p.toString());
        }

        @Test
        public final void testToStringOne() {
                Playlist p = new PlaylistOnArray();
                PlaylistOnArray.Track t = p.new Track();
                t.title = "Song 1";
                t.artist = "Artist 1";
                t.isrc = "ISRC1";
                p.add(t);
                assertEquals("<Song 1, Artist 1, ISRC1>", p.toString());
        }

        @Test
        public final void testToStringMany() {
                Playlist p = new PlaylistOnArray();
                for (int i = 1; i <= 3; i++) {
                        PlaylistOnArray.Track t = p.new Track();
                        t.title = "Song " + i;
                        p.add(t);
                }
                assertEquals("<Song 1, , ><Song 2, , ><Song 3, , >",
                                p.toString());
        }

        @Test
        public final void testEqualsZero() {
                Playlist p1 = new PlaylistOnArray();
                Playlist p2 = new PlaylistOnArray();
                assertEquals(true, p1.equals(p2));
        }

        @Test
        public final void testEqualsOne() {
                Playlist p1 = new PlaylistOnArray();
                Playlist p2 = new PlaylistOnArray();
                PlaylistOnArray.Track t = p1.new Track();
                t.title = "Song 1";
                p1.add(t);
                p2.add(t);
                assertEquals(true, p1.equals(p2));
        }

        @Test
        public final void testEqualsMany() {
                Playlist p1 = new PlaylistOnArray();
                Playlist p2 = new PlaylistOnArray();
                for (int i = 1; i <= 3; i++) {
                        PlaylistOnArray.Track t = p1.new Track();
                        t.title = "Song " + i;
                        p1.add(t);
                        p2.add(t);
                }
                assertEquals(true, p1.equals(p2));
        }
}
