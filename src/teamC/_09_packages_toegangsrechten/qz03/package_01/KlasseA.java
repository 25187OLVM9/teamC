package teamC._09_packages_toegangsrechten.qz03.package_01;

import teamC._09_packages_toegangsrechten.qz03.package_02.KlasseB;

public class KlasseA
{
  public static void main(String[] args)
  {
    KlasseB kb = new KlasseB();
	  
	 
    kb.mijnMethode();
    System.out.println();
	   //dit kan dus als je in KlasseB public gebruikt !
	  
    System.out.print(kb.w);
    System.out.print(kb.x);
    System.out.print(kb.y);
    System.out.print(kb.z);
  }
}
