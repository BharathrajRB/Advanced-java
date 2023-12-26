package Java.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * player
 * to fetch the default values using reflection api
 * 
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@interface player {
  int age() default 40;

  String country() default "india";

}

/**
 * dhoni
 */
// @player(age = 40, country = "india")
@player
class dhoni {
  int age;
  int runs;

  public void setruns(int runs) {
    this.runs = runs;
  }

  public void setage(int age) {
    this.age = age;
  }

  public int getage() {
    return age;
  }

  public int getruns() {

    return runs;
  }

}

/*
 *
 * annotation most important
 * 
 * @override
 * 
 * @functionalinterface
 * 
 * @bean
 * 
 * @component extra information add on the code
 * it works on the basics of interface
 * what is the target where do we use the annotation
 * fields for variables only
 * 
 * 
 */
public class annotation {
  public static void main(String[] args) {
    dhoni obj = new dhoni();
    obj.setage(40);
    obj.setruns(9000);
    System.out.println("age " + obj.getage() + " runs" + obj.getruns());

  }
}