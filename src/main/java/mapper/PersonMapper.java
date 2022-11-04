package mapper;

import dest.LombokBuilder;
import dest.ParameterLessBuilder;
import dest.PersonRankingPlain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import source.PersonPlain;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    //LombokBuilder toPerson(PersonPlain person);
    PersonRankingPlain toPerson(PersonPlain person);
    ParameterLessBuilder toPerson2(PersonPlain person);

    LombokBuilder toPerson3(PersonPlain person);
}
