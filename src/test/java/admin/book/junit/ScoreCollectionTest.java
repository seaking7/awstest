package admin.book.junit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class ScoreCollectionTest {

    @Test
    public void test(){
     //   fail("Not yet implemented");
    }

    @Test
    public void answerArithMeanOfTwo(){

        ScoreCollection collection = new ScoreCollection();
        collection.add(()-> 5);
        collection.add(()-> 7);

        int actualResult = collection.arithmeticMean();

        assertThat(actualResult, equalTo(6));
    }

}