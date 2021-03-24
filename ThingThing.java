public class ThingThing
{
  public static void main(String[] args)
  {
    StackI q = new StackI(100);
    String s = "((2-3+4)*(5+6*7))";
    q.intopost(s);
    q.disp();
  }
}
    