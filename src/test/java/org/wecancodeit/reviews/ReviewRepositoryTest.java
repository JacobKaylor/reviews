package org.wecancodeit.reviews;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {

	private ReviewRepository underTest;

	private long reviewId = 233;
	private Review firstReview = new Review(reviewId, "Pink Floyd Vinyl", "", "Music",
			"Pink Floyd The Wall Vinyl Record");

	private long secondReviewId = 234;
	private Review secondReview = new Review(secondReviewId, "Lumineers Vinyl", "", "Music",
			"Lumineers Cleopatra Vinyl Record");

	private long thirdReviewId = 235;
	private Review thirdReview = new Review(thirdReviewId, "Glass Animals Vinyl", "", "Music",
			"Glass Animals How To Be A Human Being Vinyl Record");

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

	@Test
	public void shouldFindAllReviews() {
		underTest = new ReviewRepository(firstReview, secondReview, thirdReview);
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(firstReview, secondReview, thirdReview));
	}

}
