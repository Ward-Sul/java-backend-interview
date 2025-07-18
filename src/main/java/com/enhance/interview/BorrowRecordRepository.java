package com.enhance.interview;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.OffsetDateTime;
import java.util.List;

public interface BorrowRecordRepository extends JpaRepository<BorrowRecord, Long> {

       List<BorrowRecord> findByBookId(Long bookId);

//       @Query("")
       // TODO: Implement the logic to find conflicting borrow records
//       List<BorrowRecord> findConflictingBorrowRecords(
//                     @Param("bookId") Long bookId,
//                     @Param("startTime") OffsetDateTime startTime,
//                     @Param("endTime") OffsetDateTime endTime);
}
