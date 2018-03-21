package net.bookmanager.proselyte.bookmanager.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "books")
@Data
public class Book {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "BOOK_PRICE")
    private int price;

    @Column(name = "BOOK_TITLE")
    private String bookTitle;

    @Column(name = "BOOK_AUTHOR")
    private String bookAuthor;


}
