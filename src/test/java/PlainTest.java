import dest.PersonRankingPlain;
import mapper.PersonMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import source.PersonPlain;

class PlainTest {
    private static final PersonMapper instance = PersonMapper.INSTANCE;
    @Test
    @DisplayName("get 메소드를 이용해 필요한 정보를 가져온 뒤, 생성자를 통해 매핑하는지 테스트")
    void test() {
        Assertions.assertDoesNotThrow(() -> Mappers.getMapper(PersonMapper.class));
        PersonPlain personPlain = new PersonPlain("jack", 24, "owner", 1200);
        PersonRankingPlain personRankingPlain = instance.toPerson(personPlain);
        Assertions.assertEquals("jack", personRankingPlain.getName());
        Assertions.assertEquals(1200, personRankingPlain.getRating());
    }
}
