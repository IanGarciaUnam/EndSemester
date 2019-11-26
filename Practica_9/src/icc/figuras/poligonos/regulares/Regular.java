package icc.figuras.poligonos.regulares;
import icc.figuras.Figura;
import icc.figuras.poligonos.*;

/**
* Es la base para la definicion de cuerpos geometricos regulares.
*/
	public  abstract class Regular extends Figura{

		/**
		*Obtiene la apotema
		*/
		protected double apotema;
		/**
		*Obtiene la longitud de la figura
		*/
		protected double longitud;
		/**
		*Obtiene el area de la figura
		*/
		protected double getArea;
		/**
		*Obtiene el numero de lados
		*/
		protected int numLados;

	@Override
	public double area(){
		double toArea=0;
		 if(numLados==4){
			toArea=Math.pow(longitud,2);
		}else{
			setApotema(apotema);
			this.apotema=getApotema();
			toArea=(perimetro()*this.apotema)/2.0;
		}
		return toArea;
		}

	@Override
	public double perimetro(){
		return getLongitud()*getNumLados();
	}

	/**
	*Calcula la apotema de la figura
	*@param apotema apotema de la figura
	*/
	public void setApotema(double apotema){
		this.apotema=getLongitud()/alpha(getNumLados());
	}


	private double alpha(int n){
			return (2.0 * Math.tan(Math.PI / (double)n));
	}
	/**
	*Devuelve la longitud del lado de la figura
	*@return apotema
	*/
	public double getApotema(){
		setApotema(apotema);
		return apotema;
	}

	/**
	*Devuelve la longitud del lado de la figura
	*@return longitud
	*/
	public double getLongitud(){
		return longitud;
	}
	/**
	*Calcula la longitud del lado de la figura
	*@param x recibe valor de apotema
	*
	**/
	public void setLongitud(double x){
		setApotema(x);
		this.longitud=getApotema()*alpha(getNumLados());
	}
	/**
	*Devuelve el numero de lados
	*@return numLados
	**/
	public int getNumLados(){
		return numLados;
	}
}
