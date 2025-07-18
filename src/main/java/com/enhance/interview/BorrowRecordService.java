package com.enhance.interview;

import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.Optional;

@Service
public class BorrowRecordService {

    private final BorrowRecordRepository borrowRecordRepository;

    public BorrowRecordService(BorrowRecordRepository borrowRecordRepository) {
        this.borrowRecordRepository = borrowRecordRepository;
    }

    /**
     * TASK: Find the Next Available Borrow Slot
     * <p>
     * The goal of this method is to determine the next available time slot within the given time range
     * where a user can borrow a specific book for a specified duration.
     * <p>
     * The borrow schedule is defined by existing BorrowRecord entries which each contain a start and end time.
     * <p>
     */
    public Optional<OffsetDateTime> findNextAvailableSlot(
            Long bookId,
            int requestedDuration,
            OffsetDateTime startTime
    ) {
        return Optional.empty();
    }
}
