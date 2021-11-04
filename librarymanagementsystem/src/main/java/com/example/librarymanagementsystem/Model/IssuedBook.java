package com.example.librarymanagementsystem.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "IsuedBook")
public class IssuedBook implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id")
    @NotNull
    private Book book;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "issue_id")
    @NotNull
    private Issue issue_id;

    @NotNull
    @Column(name = "returned")
    private Integer returned;
}
