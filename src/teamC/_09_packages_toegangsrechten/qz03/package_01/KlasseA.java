package teamC._09_packages_toegangsrechten.qz03.package_01;

import teamC._09_packages_toegangsrechten.qz03.package_02.KlasseB;

public class KlasseA
{public int w = 1;
protected int x = 2;
int y = 3;
private int z = 4;
public static void main(String[] args)
{
	KlasseB kb = new KlasseB();
	kb.mijnMethode();
	
}
}
