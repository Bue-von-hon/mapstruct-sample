package dest;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class LombokBuilder {
    private String name;
    private int rating;
}
