import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void testStatement() {
		//Create movie
		Movie movie1 = new Movie("O Homem Elefante", Movie.CHILDRENS);
		Movie movie2 = new Movie("Divertidamente", Movie.NEW_RELEASE);
		Movie movie3 = new Movie("O Touro Ferdinando", Movie.REGULAR);
		
		//Create customer
		Customer customer = new Customer("Eduardo Paulo");
		
		//Create rental and add
		customer.addRental(new Rental(movie1, 5));
		customer.addRental(new Rental(movie2, 10));
		customer.addRental(new Rental(movie3, 15));

		String result = 
				"Rental Record for Eduardo Paulo\n" +
                "\tO Homem Elefante\t4.5\n" +
                "\tDivertidamente\t30.0\n" +
                "\tO Touro Ferdinando\t21.5\n" +
                "Amount owed is 56.0\n" +
                "You earned 4 frequent renter points";
        
		String statement = customer.statement();
        assertEquals(result, statement);

	}

}
