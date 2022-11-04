import dest.ParameterLessBuilder;
import mapper.PersonMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import source.PersonPlain;

class ParameterLessBuilderTest {

    @Test
    void test1() {
        PersonMapper instance = PersonMapper.INSTANCE;
        PersonPlain personPlain = new PersonPlain("jack", 24, "owner", 1200);
        ParameterLessBuilder person = instance.toPerson2(personPlain);
        Assertions.assertEquals("jack", person.getName());
        Assertions.assertEquals(1200, person.getRating());
    }

}
