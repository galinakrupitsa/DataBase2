package Service;

import DTO.dbUserDTO;
import Repository.DBRepository;
import Repository.User;
import org.springframework.stereotype.Service;

@Service
public class dbService {
    private final DBRepository dbRepository;

    public dbService(DBRepository dbRepository) {
        this.dbRepository = dbRepository;
    }

    public Integer saveUser(dbUserDTO userDto) {
        User user = new User(-1L, userDto.getName(), userDto.getAge());

        return dbRepository.save(user);
    }


}
