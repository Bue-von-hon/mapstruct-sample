package dest;

public class ParameterLessBuilder {
    private String name;
    private int rating;

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public static Builder builder() {
        return new Builder();
    }

    protected ParameterLessBuilder(Builder builder) {
        this.name = builder.name;
        this.rating = builder.rating;
    }

    public static class Builder {
        private String name;
        private int rating;

        public Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder rating(int rating) {
            this.rating = rating;
            return this;
        }

        public ParameterLessBuilder build() {
            return new ParameterLessBuilder(this);
        }
    }
}
