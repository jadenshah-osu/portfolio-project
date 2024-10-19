public class Playlist extends PlaylistKernel {

    shuffle(Playlist playlist) {
        size = playlist.trackCount();
        Random rand = new Random();
        for(int i = size; i > 0, i--) {
            int j = rand.nextInt(i + 1);
            playlist.swap(i, j);
        }
    }

}