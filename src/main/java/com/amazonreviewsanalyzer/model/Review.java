package com.amazonreviewsanalyzer.model;

import javax.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String summary;

    private String text;

    @ManyToOne
    private Item item;

}
