package sound;

public class SoundEvent {

    private final Sound sound;
    private final Duration duration;

    public SoundEvent(Sound sound, Duration duration){
        this.sound = sound;
        this.duration = duration;
    }

    public Sound getSound(){
        return sound;
    }

    public Duration getDuration(){
        return duration;
    }


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

    @Override
    public int hashCode() {
        return sound.hashCode() + duration.hashCode();
    }

}
