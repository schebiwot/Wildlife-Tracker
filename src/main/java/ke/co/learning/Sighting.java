public class Sighting {
    public int speciesId;
    public String location;
    public String rangerName;
    public long timestamp;

    public Sighting(int speciesId, String location, String rangerName) {
        this.speciesId = speciesId;
        this.location = location;
        this.rangerName = rangerName;
    }
}