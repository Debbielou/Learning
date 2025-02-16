package enumHandling;


// this is Data Transfer Object (DTO)
public class AuthorCount {
	
    private Category category;
    private Long count;

    public AuthorCount(Category category, Long count) {
        this.category = category;
        this.count = count;
        
            }

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

}