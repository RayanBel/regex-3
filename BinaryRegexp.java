//https://www.codewars.com/kata/54de279df565808f8b00126a
import java.util.regex.Pattern;

public class BinaryRegexp {
  public static Pattern multipleOf3() {
    // Regular expression that matches binary inputs that are multiple of 3
    return Pattern.compile("^0*((1(0(1)*0)*1)*0*)*$");
  }
}
