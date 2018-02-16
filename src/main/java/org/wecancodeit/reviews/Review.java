package org.wecancodeit.reviews;

public class Review {

	public Review(long reviewId, String title, String imageUrl, String category, String content) {
		this.reviewId = reviewId;
		this.title = title;
		this.imageUrl = imageUrl;
		this.category = category;
		this.content = content;
	}

	private long reviewId;
	private String title;
	private String imageUrl;
	private String category;
	private String content;

	public Long getId() {
		return reviewId;
	}

	public String getTitle() {
		return title;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	public String getCategory() {
		return category;
	}
	public String getContent() {
		return content;
	}

}
