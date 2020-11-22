package composingmethods.inlinemethod;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MovieTest {

  @Test
  public void testRatingWithLessThanFiveDeliveries() {
    Movie movie = new Movie(1);
    int expectedRating = 1;
    int actualRating = movie.getRating();
    assertEquals(expectedRating , actualRating);
    movie = new Movie(2);
    actualRating = movie.getRating();
    assertEquals(expectedRating , actualRating);
    movie = new Movie(3);
    actualRating = movie.getRating();
    assertEquals(expectedRating , actualRating);
    movie = new Movie(4);
    actualRating = movie.getRating();
    assertEquals(expectedRating , actualRating);
  }

  @Test
  public void testRatingWithMoreThanFiveDeliveries() {
    Movie movie = new Movie(5);
    int expectedRating = 2;
    int actualRating = movie.getRating();
    assertEquals(expectedRating , actualRating);
    movie = new Movie(6);
    actualRating = movie.getRating();
    assertEquals(expectedRating , actualRating);
  }

}
