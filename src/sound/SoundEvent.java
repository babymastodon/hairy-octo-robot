package sound;

/**
 * A Sound (group of pitches) associated with a duration.
 *
 * The duration of a SoundEvent is the relative duration of the
 * note. To get the absolute duration of the note, multiply the
 * relative duration with the defaultDuration of the Song.
 *
 * Immutable object.
 */
public class SoundEvent {

    private final Sound sound;
    private final Duration duration;

    /**
     * Create a SoundEvent with the given Sound and Duration.
     *
     * @param sound the sound object (rest, note, or chord)
     * @param duration the relative duration
     */
    public SoundEvent(Sound sound, Duration duration){
        this.sound = sound;
        this.duration = duration;
    }

    /**
     * Get the sound for this sound event.
     *
     * @return the sound for this SoundEvent.
     */
    public Sound getSound(){
        return sound;
    }

    /**
     * Get the relative duration for this sound event.
     *
     * @return the relative duration
     */
    public Duration getDuration(){
        return duration;
    }


    /**
     * Two sound events are equal if they have the same
     * sound pitches and the same duration.
     *
     * @return the relative duration
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        SoundEvent that = (SoundEvent) obj;
        return this.sound.equals(that.sound) &&
            this.duration.equals(that.duration);
    }

    /**
     * Updated to reflect the new equals() function.
     *
     * @return an integer hash code
     */
    @Override
    public int hashCode() {
        return sound.hashCode() + duration.hashCode();
    }

    /**
     * Return a string representation of the SoundEvent's members.
     *
     * @return a string
     */
    @Override
    public String toString(){
        return "SoundEvent(" + sound.toString() + ", " + duration.toString() + ")";
    }
}
