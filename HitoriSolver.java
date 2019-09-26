public class rute{
	Integer verdi;
  boolean markert;
  
  public rute(Integer verdi){
  	this.verdi = verdi;
    merkert = false;
  }
  
  pubic marker(){
  	markert = true;
  }
  
}
public static class hitoriSolver {
	public static main(String[] args){}

	int strl = 5;
	rute[][] brett = new rute[strl][strl];


	public int[][] hitoriInitSolve(int[][] brett){
  	if(sjekkGyldigBrett(brett)){
			return hitoriStartSolve(brett);
  	}  
	}
  
  public boolean hitoriStartSolve(brett){
  	
  }
  
  public boolean sjekkGyldigBrett(int[][] brett){
  	return (
    sjekkGyldigMarkeringer(brett) &&
    sjekkTraverserbar(brett) &&
    sjekkRader(brett) &&
    sjekkKolonner(brett)
  	);
  }

	public boolean sjekkHøgreNabo(int x, int y){
		if(brett[x][y+1].getMarkert()){
    	
    }
	}

}


