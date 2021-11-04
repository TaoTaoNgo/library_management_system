package com.example.librarymanagementsystem.Repository;

import com.example.librarymanagementsystem.Model.IssuedBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssuedBookRepository extends JpaRepository<IssuedBook,Long> {
}
