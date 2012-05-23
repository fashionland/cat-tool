package order.entity.categorization;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * TODO move annotations to getter methods
 */

@Entity
public class Item {

	@Id
	private int id;

	private String name;

	// TODO what type should this be?
	private String image;

}
