package teamC.h10;
import java.util.ArrayList;
public class quiz7 {
	public static void main(String[] args)
	  {
	    ArrayList<String> landen = new ArrayList<String>();
	    landen.add("Duitsland");
	    landen.add("Verenigde Staten");
	    landen.add("Rusland");
	    landen.add("Verenigd Koninkrijk");
	    landen.add(2, "India");
	    for (int i = 0; i < landen.size(); i++)
	    {
	      //System.out.print(" " + landen.get(i));
	    }
	    for(String land:landen) 
	    {
	      System.out.println(land);
	    }
	  }
}
