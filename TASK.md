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
Create a new Author entity to establish proper relationships between books and their authors.

### Acceptance Criteria
- [ ] Create new `Author` entity with appropriate fields (id, name, biography, etc.)
- [ ] Establish relationship between `Book` and `Author` entities
- [ ] Update existing `Book` entity to include author reference
- [ ] Ensure proper JPA annotations and relationships

### Technical Notes
- Use JPA annotations for entity mapping
- Consider one-to-many relationship (one author can have many books)

---

## 🎯 Task 2: Top-Rated Books by Author Endpoint

**Ticket ID:** BOOK-002  
**Type:** Story  
**Priority:** Medium  
**Story Points:** 5

### Description
Implement an endpoint to retrieve a list of the highest-rated book(s) for each author.

### Acceptance Criteria
- [ ] Create endpoint: `GET /api/books/top-rated-by-author`
- [ ] Return a list of the highest-rated book for each author with the author name

### Technical Notes
- Use Spring Data JPA for efficient querying
- Consider using `@Query` annotation for complex aggregation
- Return JSON response with author and book details

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

### Technical Notes
- Ensure the system is easily extensible for new filters
- Use proper pagination for large result sets

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

### Technical Notes
- Use Spring Data JPA aggregation functions
- Consider performance for large datasets
- Round average ratings to 2 decimal places

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

### Technical Notes
- Error in sending notifications should not effect the the transaction for submitting the review

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

### Technical Notes
- Use existing `BorrowRecord` entity
- Implement proper transaction management
- Consider concurrent access scenarios
- Validate dates (return date should be after borrow date)

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

### Technical Notes
- Use @SpringBootTest or @DataJpaTest
- Mock external dependencies if needed
- Use proper test data setup and cleanup

---

## 🎯 Task 8: Rare Book Borrowing Support

**Ticket ID:** BOOK-008  
**Type:** Story  
**Priority:** Medium  
**Story Points:** 7

### Description
Implement extensible system to support different types of book borrowing, starting with rare books.

### Acceptance Criteria
- [ ] Design extensible borrowing strategy pattern
- [ ] Implement rare book borrowing (quantity < 2)
- [ ] Create framework for future borrowing types
- [ ] Ensure system is open for extension, closed for modification
- [ ] Add proper validation for rare book borrowing

### Technical Notes
- Implement proper validation rules for each strategy
- Make the system easily extensible for future borrowing types

---

## 🔧 Technical Stack

- **Framework:** Spring Boot
- **Database:** H2 (embedded)
- **ORM:** Spring Data JPA
- **Testing:** JUnit 5, Spring Boot Test
- **Build Tool:** Maven
