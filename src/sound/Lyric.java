package sound;

public class Lyric {

    private final String text;

    public Lyric(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        Lyric that = (Lyric) obj;
        return this.text.equals(that.text);
    }

    @Override
    public int hashCode() {
        return text.hashCode();
    }

}
