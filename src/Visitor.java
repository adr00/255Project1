public class Visitor extends Person{

    public int fare;
    public boolean paid;
    public String currentLoc;

    public Visitor(String f, String l, String a, int aa, int ff, boolean p, String c)
    {
        super(f,l,a,aa);
        fare = ff;
        paid = p;
        currentLoc = c;
    }
}
