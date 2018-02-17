package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		Review pinkfloyd = new Review(121, "Pink Floyd Vinyl", "/images/The Wall.jpg", "Music",
				"Man, what an adventure.");
		Review lumineers = new Review(123, "Lumineers Vinyl", "/images/Cleopatra.jpg", "Music",
				"This is some music that will want to make you get up and follow your dreams");
		Review glassanimals = new Review(122, "Glass Animals Vinyl", "/images/How to be a human being.jpg", "Music",
				"The album speaks to me");

		reviews.put(pinkfloyd.getId(), pinkfloyd);
		reviews.put(lumineers.getId(), lumineers);
		reviews.put(glassanimals.getId(), glassanimals);

	}

	// testing only
	public ReviewRepository(Review... reviews) {
		populateReviewsMap(reviews);
	}

	private void populateReviewsMap(Review... reviews) {
		for (Review review : reviews) {
			this.reviews.put(review.getId(), review);
		}
	}

	public Review findReview(Long reviewId) {
		return reviews.get(reviewId);
	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

}
