

import java.time.LocalDate;

import org.mapstruct.factory.Mappers;

import br.com.dio.dto.UserDTO;
import br.com.dio.mapper.UserMapper;
import br.com.dio.model.UserModel;
import lombok.var;

public class Main {
    private final static UserMapper mapper = Mappers.getMapper(UserMapper.class);
    public static void main(String[] args) {
        var model = new UserModel();
        model.setCode(1);
        model.setUserName("Joao");
        model.setBirthDay(LocalDate.now().minusYears(20));
        System.out.println(mapper.toDTO(model));

        var dto = new UserDTO();
        dto.setId(1);
        dto.setName("Marcos");
        dto.setBirthDay(LocalDate.now().minusYears(30));
        System.out.println(mapper.toModel(dto));
    }
}