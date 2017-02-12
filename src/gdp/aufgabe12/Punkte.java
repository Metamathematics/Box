package gdp.aufgabe12;

public class Punkte {
	public static void main(String[] args){
		
		
		
		int ammount;
		System.out.print ("Number of Points: ");
		ammount = console.InputHelper.readInteger();
		
		//read Array
		Punkt[] P = new Punkt[ammount];
		readPoints(P);
		
		//Vergleichspunkt
		Punkt vp = readP('x');
		
		//p-Parameter
		System.out.print ("p-Parameter: ");
		int p = console.InputHelper.readInteger();
		
		
		/*
		Punkt[] P = {new Punkt (1,1,1),new Punkt (1,0,0)}; 
		Punkt vp = new Punkt (0,0,0);
		int p = 2;
		*/
		
		
		Punkt clp = closestPoint (P,vp,p);
		
		System.out.println ("Closest Point: "+ clp.x + ","+ clp.y +","+clp.z);
		System.out.println ("Distance: " + pNorm(clp,vp,p));
	}
	
	//p-Norm Berechnung-----------------------------------------------------------------
	
	public static Punkt closestPoint (Punkt[] P, Punkt vp, int p){
		
		double distance = pNorm(P[0],vp,p);
		Punkt clpoint = P[0];
		
		for (int i=1;i<P.length;++i){
			double pn = pNorm(P[i],vp,p);
			
			if (pn <= distance){
				distance = pn;
				clpoint = P[i];
			}
		}
		
		return clpoint;
	}
	
	
	public static double pNorm (Punkt a,Punkt vp, int p){
		
		double X = Math.pow(Math.abs(vp.x-a.x),p);
		double Y = Math.pow(Math.abs(vp.y-a.y),p);
		double Z = Math.pow(Math.abs(vp.z-a.z),p);
		
		return Math.pow(X + Y + Z, 1.0/p);
	}
	
	//Read Points----------------------------------------------------------------------------
	
	public static void readPoints (Punkt[] P){
		
		System.out.println ("Enter Points");
		for (int i=0;i<P.length;++i){
			P[i]=readP(i+1);
		}
	}
	
	public static Punkt readP (int l){
		Punkt a = new Punkt(0,0,0);
		System.out.print ("p" + l + "x: ");
		a.x = console.InputHelper.readDouble();
		System.out.print ("p" + l + "y: ");
		a.y = console.InputHelper.readDouble();
		System.out.print ("p" + l + "z: ");
		a.z = console.InputHelper.readDouble();
		return a;
	}
	
	public static Punkt readP (char l){
		Punkt a = new Punkt(0,0,0);
		System.out.print ("p" + l + "x: ");
		a.x = console.InputHelper.readDouble();
		System.out.print ("p" + l + "y: ");
		a.y = console.InputHelper.readDouble();
		System.out.print ("p" + l + "z: ");
		a.z = console.InputHelper.readDouble();
		return a;
	}
}
