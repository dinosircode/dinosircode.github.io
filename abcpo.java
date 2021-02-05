abstract class shape
{
  public abstract void numberofsides();
}
class Rectange extends shape
{
      public void numberofsides()
      {
        System.out.println("Number of Sides=4");
      }
}
class Triangle extends shape
{
      public void numberofsides()
      {
        System.out.println("Number of sides=3");
      }
}
class Pentogon extends shape
{
    public void numberofsides()
    {
      System.out.println("Number of Sides=5");
    }
}
class Hexagon extends shape
{
    public void numberofsides()
    {
      System.out.println("Number of Sides=6");
    }
}
class Heptogon extends shape
{
    public void numberofsides()
    {

      System.out.println("Number of Sides=7");
    }
}
class Octago extends shape
{
  public void numberofsides()
  {
    System.out.println("Number of Sides=8");
  }
}
class Mainfu
{
  public static void main(String[] args)
  {
    Triangle t=new Triangle();
    Rectange r=new Rectange();
    Pentogon p=new Pentogon();
    Hexagon h=new Hexagon();
    Heptogon hp=new Heptogon();
    Octago o=new Octago();
    t.numberofsides();
    r.numberofsides();
    p.numberofsides();
    h.numberofsides();
    hp.numberofsides();
    o.numberofsides();
  }
}
