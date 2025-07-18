package com.enhance.interview;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public String addReview(@RequestParam Long bookId, @RequestParam Long userId,
            @RequestParam String content, @RequestParam int rating) {
        reviewService.addReview(bookId, userId, content, rating);
        return "com.enhance.interview.Review Added";
    }

    @GetMapping("/average-by-reviewer")
    public ResponseEntity<Map<String, Double>> getAverageRatingsByReviewer() {
        return ResponseEntity.ok(reviewService.getAverageRatingsByReviewer());
    }
}
