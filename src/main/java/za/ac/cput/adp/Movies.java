package za.ac.cput.adp;
/*
*author: keenan Solomons 219264228
*/
public class Movies {
    private String type;
    private String rating;
    private String length;

    public Movies(){
    }

    public Movies(String type, String rating, String length){
        this.type = type;
        this.rating = rating;
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public String getRating() {
        return rating;
    }

    public String getLength() {
        return length;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setLength(String length) {
        this.length = length;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Movies{" +
                "type='" + type + '\'' +
                ", rating='" + rating + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}
