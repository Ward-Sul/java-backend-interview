package com.enhance.interview;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.OffsetDateTime;

@Entity
public class BorrowRecord {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Book book;

    private OffsetDateTime startTime;
    private OffsetDateTime endTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "BorrowRecord{" +
                "id=" + id +
                ", book=" + book +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}


