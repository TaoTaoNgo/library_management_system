package com.example.librarymanagementsystem.Repository;

import com.example.librarymanagementsystem.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UsersRepository extends JpaRepository<Users,Long> {
    public List<Users> findAllByOrderByDisplayNameAsc();
    public List<Users> findAllByActiveOrderByDisplayNameAsc(Integer active);
    public Users findByUsername(String username);

}
