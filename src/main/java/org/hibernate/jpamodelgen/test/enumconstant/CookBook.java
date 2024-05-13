package org.hibernate.jpamodelgen.test.enumconstant;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import org.hibernate.annotations.processing.CheckHQL;
import org.hibernate.jpamodelgen.test.enumconstant.BookType;

@Entity
@CheckHQL
@NamedQuery(name = "#findGoodBooks",
		query = "from CookBook where bookType = org.hibernate.jpamodelgen.test.enumconstant.BookType.GOOD_BOOK")
public class CookBook {

	@Id
	String isbn;
	String title;
	BookType bookType;
}
