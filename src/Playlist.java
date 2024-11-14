public interface Playlist extends PlaylistKernel {

    /**
     * Shuffles (randomizes the order) {@code playlist} and returns the shuffled
     * playlist.
     *
     * @param playlist
     *            The playlist to be shuffled
     * @return A shuffled version of {@code playlist}
     */
    Track[] shuffle(Playlist playlist);

}
