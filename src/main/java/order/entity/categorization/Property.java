package order.entity.categorization;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/*
 * TODO move annotations to getter methods
 */

@Entity
public class Property {

	@Id
	private int id;

	private String name;

	// TODO what type should this be?
	private String image;

	// TODO what type should this be?
	// TODO mappedBy?
	@OneToMany
	private List<PropertyValue> possibleValues;

}
