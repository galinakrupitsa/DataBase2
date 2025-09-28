package com.example.database2.Service;

import com.example.database2.DTO.dbUserDTO;
import com.example.database2.Repository.DBRepository;
import com.example.database2.Repository.User;
import org.springframework.stereotype.Service;

@Service
public class dbService {
    private final DBRepository dbRepository;

    public dbService(DBRepository dbRepository) {
        this.dbRepository = dbRepository;
    }
    public dbUserDTO getUserById(Long id) {
        User user = dbRepository.findById(id);

        return new dbUserDTO(user.getId(), user.getName(), user.getAge());
    }
    public Integer saveUser(dbUserDTO userDto) {
        User user = new User(-1L, userDto.getName(), userDto.getAge());

        return dbRepository.save(user);
    }


}
