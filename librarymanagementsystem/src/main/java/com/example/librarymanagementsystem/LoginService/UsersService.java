package com.example.librarymanagementsystem.LoginService;

import com.example.librarymanagementsystem.Model.Users;
import com.example.librarymanagementsystem.Repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UsersService {

    private UsersRepository usersRepository ;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    public List<Users> getAllUsers() {
        return usersRepository.findAllByOrderByDisplayNameAsc();
    }

    public List<Users> getAllActiveUsers(){
        return usersRepository.findAllByActiveOrderByDisplayNameAsc(1);
    }

    public Users getByUsername(String username){
        return usersRepository.findByUsername(username);
    }

    public Users getById(Long id){
        return usersRepository.findById(id).get();
    }

    public Users addNew(Users users){
        users.setActive(1);
        users.setCreated_date(new Date());
        users.setLastModifiedDate(users.getCreated_date());
        usersRepository.save(users);
        return users;
    }

    public Users updateDate(Users users){
        users.setLastModifiedDate(new Date());
        return usersRepository.save(users);
    }
}
