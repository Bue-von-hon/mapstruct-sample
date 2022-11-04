package source;

public class PersonPlain {
    private String name;
    private int age;
    private String title;
    private int rating;

    public PersonPlain(String name, int age, String title, int rating) {
        this.name = name;
        this.age = age;
        this.title = title;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public PersonPlain() {
    }

    public int getAge() {
        return age;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }
}
