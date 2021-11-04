package com.example.librarymanagementsystem.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Issue")
@Data
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "issueDate")
    private Date issueDate;

    @Column(name = "notes")
    private String notes;

    @Column(name = "expected_return_date")
    private Date expected_return_date;

    @Column(name = "returned")
    private Integer returned;

    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "member_id")
    @NotNull
    private Member member_id;

    @JsonIgnore
    @OneToMany(mappedBy = "issue_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<IssuedBook> issuedBooks;

}
