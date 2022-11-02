package n1exercici1;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Mesos {	

	private ArrayList<String> mesos;
	
	public Mesos() {		
		this.mesos = new ArrayList<String>();
		
		mesos.add("Gener");
		mesos.add("Febrer");
		mesos.add("Març");
		mesos.add("Abril");
		mesos.add("Maig");
		mesos.add("Juny");
		mesos.add("Juliol");
		mesos.add("Agost");
		mesos.add("Setembre");
		mesos.add("Octubre");
		mesos.add("Novembre");
		mesos.add("Decembre");
		
	}	

	public ArrayList<String> getMesos() {
		return mesos;
	}
	
}
