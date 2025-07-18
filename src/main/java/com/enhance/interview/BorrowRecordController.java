package com.enhance.interview;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/borrow-records")
public class BorrowRecordController {

    private final BorrowRecordService borrowService;

    public BorrowRecordController(BorrowRecordService borrowRecordService) {
        this.borrowService = borrowRecordService;
    }

    @GetMapping("/books/{bookId}/next-available-slot")
    public ResponseEntity<?> getNextAvailableSlot(
            @PathVariable Long bookId,
            @RequestParam int duration,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime from

    ) {
        Optional<OffsetDateTime> availableSlot = borrowService.findNextAvailableSlot(bookId, duration, from);
        return ResponseEntity.ok(Map.of("availableFrom", availableSlot.orElse(null)));
    }

    @PostMapping("/books/{bookId}/borrow")
    public ResponseEntity<?> borrowBook(
            @PathVariable Long bookId,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime borrowDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime returnDate) {
        // TODO: Implement the logic to borrow a book
        return ResponseEntity.ok(new BorrowRecord());
    }
}
