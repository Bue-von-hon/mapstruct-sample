import dest.LombokBuilder;
import mapper.PersonMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import source.PersonPlain;

class LombokBuilderTest {

    @Test
    void test1() {
        PersonMapper instance = PersonMapper.INSTANCE;
        PersonPlain person = new PersonPlain("jack", 24, "owner", 1200);
        LombokBuilder lombokBuilder = instance.toPerson3(person);
        Assertions.assertEquals("jack", lombokBuilder.getName());
        Assertions.assertEquals(1200, lombokBuilder.getRating());
    }

}
