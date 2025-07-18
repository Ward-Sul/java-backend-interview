package com.enhance.interview;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Map;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final BookRepository bookRepository;
    private final UserRepository userRepository;

    public ReviewService(ReviewRepository reviewRepository, BookRepository bookRepository,
            UserRepository userRepository) {
        this.reviewRepository = reviewRepository;
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }

    public void addReview(Long bookId, Long userId, String content, int rating) {
        Book book = bookRepository.findById(bookId).orElseThrow();
        User user = userRepository.findById(userId).orElseThrow();

        Review review = new Review();
        review.setBook(book);
        review.setUser(user);
        review.setContent(content);
        review.setRating(rating);

        reviewRepository.save(review);
    }

    public Map<String, Double> getAverageRatingsByReviewer() {
        // TODO: Implement the logic to get the average ratings by reviewer
        return Collections.emptyMap();
    }
}
