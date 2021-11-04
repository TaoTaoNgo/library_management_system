package com.example.librarymanagementsystem.Repository;

import com.example.librarymanagementsystem.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsersRepository extends JpaRepository<Users,Long> {
}
