package Java.Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * messi
 * type is interface and class
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface fcb {
  int age() default 40;

  String club() default "fcb";
}

/**
 * messi1
 */
@fcb
class messi1 {

  int goals;
  int matches;
  int age;

  public void setgoals(int goals) {
    this.goals = goals;

  }

  public void setmatch(int matches) {
    this.matches = matches;
  }

  public int getgoals() {
    return this.goals;
  }

  public int getmatches() {
    return this.matches;
  }
}

public class messi {
  public static void main(String[] args) {
    messi1 messi = new messi1();
    messi.setgoals(100);
    messi.setmatch(300);
    System.out.println("goals=" + messi.getgoals());
    System.out.println("matches=" + messi.getmatches());
    // System.out.println("ages=" + messi.age);
    Class x = messi.getClass();
    Annotation an = x.getAnnotation(fcb.class);
    System.out.println(x);
    System.out.println(an);
    fcb fc = (fcb) an;
    System.out.println(fc.age());
    System.out.println(fc.club());
  }
}