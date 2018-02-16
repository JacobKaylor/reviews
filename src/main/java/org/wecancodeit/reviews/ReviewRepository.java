package org.wecancodeit.reviews;

import java.util.HashMap;
import java.util.Map;

public class ReviewRepository {
	
	Map<Long, Review> reviews = new HashMap<>();
	
	public ReviewRepository() {
		Review pinkfloyd = new Review(12, "Pink Floyd Vinyl", "", "Music","Vinyl");
		
		
		reviews.put(pinkfloyd.getId(), pinkfloyd);
		
	}
	
	//testing only
	public ReviewRepository(Review...reviews) {
		populateReviewsMap(reviews);
	}
	private void populateReviewsMap(Review... reviews) {
		for(Review review : reviews) {
			this.reviews.put(review.getId(), review);
		}
	}



	public Review findReview(Long reviewId) {
		
		return reviews.get(reviewId);
	}

}
