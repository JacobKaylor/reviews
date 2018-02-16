package org.wecancodeit.reviews;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReviewRepositoryTest {

	private ReviewRepository underTest;

	private long reviewId = 233;
	private Review firstReview = new Review(reviewId, "Pink Floyd Vinyl", "", "Music",
			"Pink Floyd The Wall Vinyl Record");

	private long secondReviewId = 233;
	private Review secondReview = new Review(secondReviewId, "Lumineers Vinyl", "", "Music",
			"Lumineers Cleopatra Vinyl Record");

	@Test
	public void shouldFindFirstReview() {
		underTest = new ReviewRepository(firstReview);
		Review result = underTest.findReview(reviewId);
		assertThat(result, is(firstReview));
	}

	@Test
	public void shouldFindSecondReview() {
		underTest = new ReviewRepository(firstReview, secondReview);
		Review result = underTest.findReview(secondReviewId);
		assertThat(result, is(secondReview));
	}

}
