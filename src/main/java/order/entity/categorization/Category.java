package order.entity.categorization;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/*
 * TODO move annotations to getter methods
 */

@Entity
public class Category {

	@Id
	private int categoryId;

	private String name;

	// TODO what type should this be?
	private String image;

	// TODO mappedBy?
	@OneToMany
	private List<Category> subCategories;

	// TODO mappedBy?
	@OneToMany
	private List<Property> properties;
}
