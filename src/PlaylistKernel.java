public interface Playlist extends Standard<Playlist> {

    /**
     * Reports the number of tracks in {@code this}.
     *
     * @return The number of tracks in {@code this}
     */
    int trackCount();

    /**
     * Adds {@code track} to the end of {@code this}.
     *
     * @param track
     *            The track to be added
     * @requires this.trackCount() < 100
     * @updates {@code this}
     * @ensures {@code this} = #this + {@code track} and this.trackCount() =
     *          #this.trackCount() + 1
     */
    void add(Track track);

    /**
     * Removes {@code track} from {@code this} and moves later tracks forward to
     * eliminate internal blank space.
     *
     * @param track
     *            The track to be removed
     * @requires {@code track} exists in {@code this}
     * @updates {@code this}
     * @ensures {@code this} = #this - {@code track} and this.trackCount() =
     *          #this.trackCount() - 1
     */
    void remove(Track track);

    /**
     * Swaps the track at {@code pos1} with the track at {@code pos2}.
     *
     * @param pos1
     *            The postion of track 1
     * @param pos2
     *            The position of track 2
     * @requires this[pos1] /= null and this[pos2] /= null
     * @updates {@code this}
     * @ensures this[pos1] = #this[pos2] and this[pos2] = #this[pos1]
     */
    void swap(int pos1, int pos2);

}
