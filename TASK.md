# Book Review System - Development Tasks

## Overview

This project contains intentional flaws and bad practices that you are expected to identify and improve as part of this technical interview. The goal is to showcase your ability to spot inefficiencies and refactor code, following best practices in Java and Spring Boot.

---

## 🎯 Task 1: Author Entity Implementation

**Ticket ID:** BOOK-001  
**Type:** Story  
**Priority:** High  
**Story Points:** 3

### Description
Create a new Author entity to establish proper relationships between a book and its author.

### Acceptance Criteria
- [ ] Create new `Author` entity with appropriate fields (id, name, biography, etc.)
- [ ] Establish relationship between `Book` and `Author` entities knowing that a book can have only one author.
- [ ] Update existing `Book` entity to include author reference
- [ ] Ensure proper JPA annotations and relationships

---

## 🎯 Task 2: Top-Rated Books by Author Endpoint

**Ticket ID:** BOOK-002  
**Type:** Story  
**Priority:** Medium  
**Story Points:** 5

### Description
Implement an endpoint to retrieve the highest-rated book for all authors.

### Acceptance Criteria
- [ ] Create endpoint: `GET /api/books/top-rated-by-author`
- [ ] Return the highest-rated book for each author with the author name

---

## 🎯 Task 3: Book Search with Dynamic Filters

**Ticket ID:** BOOK-003  
**Type:** Story  
**Priority:** High  
**Story Points:** 8

### Description
Implement a flexible search feature for books with dynamic filtering capabilities.

### Acceptance Criteria
- [ ] Implement search by book title (partial match)
- [ ] Add rating range filter (min and max rating)
- [ ] Design extensible filter system for future additions
- [ ] Support optional filters (users can choose which filters to apply)
- [ ] Create endpoint: `GET /api/books/search`
- [ ] Include proper validation for filter parameters
- [ ] Add comprehensive unit tests

---

## 🎯 Task 4: Reviewer Average Ratings Aggregation

**Ticket ID:** BOOK-004  
**Type:** Story  
**Priority:** Medium  
**Story Points:** 4

### Description
Implement logic to calculate and return average ratings for each reviewer across all books.

### Acceptance Criteria
- [ ] Create endpoint: `GET /api/reviews/reviewer-averages`
- [ ] Return `Map<String, Double>` where key is reviewer name and value is average rating

---

## 🎯 Task 5: Review Notification System

**Ticket ID:** BOOK-005  
**Type:** Story  
**Priority:** Low  
**Story Points:** 2

### Description
Implement notification system for new review submissions.

### Acceptance Criteria
- [ ] Send notification when new review is successfully submitted
- [ ] Simulate notification with console output/log
- [ ] Ensure notification is sent asynchronously
- [ ] Include review details in notification
- [ ] Add unit tests for notification logic

---

## 🎯 Task 6: Book Borrowing Logic

**Ticket ID:** BOOK-006  
**Type:** Story  
**Priority:** High  
**Story Points:** 6

### Description
Implement the core logic for users to borrow books with specified borrow and return dates.

### Acceptance Criteria
- [ ] Create endpoint: `POST /api/books/{bookId}/borrow`
- [ ] Accept book ID, borrow date, and return date as input
- [ ] Validate book availability
- [ ] Create borrow record in database
- [ ] Update book availability status
- [ ] Include proper validation and error handling
- [ ] Add unit tests for borrowing logic

---

## 🎯 Task 7: Book Borrowing Test Case

**Ticket ID:** BOOK-007  
**Type:** Task  
**Priority:** Medium  
**Story Points:** 2

### Description
Write comprehensive test case for the book borrowing happy path scenario.

### Acceptance Criteria
- [ ] Test borrowing a new book (not previously borrowed)
- [ ] Verify borrow record is created correctly
- [ ] Verify book availability is updated
- [ ] Test with valid borrow and return dates
- [ ] Ensure test covers all success scenarios

---

## 🎯 Task 8: Rare Book Borrowing Support

**Ticket ID:** BOOK-008  
**Type:** Story  
**Priority:** Medium  
**Story Points:** 7

### Description
Implement extensible system to support different types of book borrowing, starting with rare books.

### Acceptance Criteria
- [ ] Design extensible borrowing system.
- [ ] Implement rare book borrowing (quantity < 2)
- [ ] Create framework for future borrowing types
- [ ] Ensure system is open for extension, closed for modification
- [ ] Add proper validation for rare book borrowing

---

## 🔧 Technical Stack

- **Framework:** Spring Boot
- **Database:** H2 (embedded)
- **ORM:** Spring Data JPA
- **Testing:** JUnit 5, Spring Boot Test
- **Build Tool:** Maven
