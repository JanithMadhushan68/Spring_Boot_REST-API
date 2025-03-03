package com.library.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Borrow {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int borrowID;

	    @ManyToOne
	    @JoinColumn(name = "member_id")
	    private Member member;

	    @ManyToOne
	    @JoinColumn(name = "book_id")
	    private Book book;

	    @Temporal(TemporalType.DATE)
	    private Date issueDate;

	    @Temporal(TemporalType.DATE)
	    private Date dueDate;

	    @Temporal(TemporalType.DATE)
	    private Date returnDate;

	    private float fineAmount;

}
