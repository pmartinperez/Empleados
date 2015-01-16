package model;


/**
 * Subclase de Empleado que describe a un directivo.
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @author Patricia Martin
 * @version 1.0
 */

public class Directivo extends Empleado
{
	/**
	 * Atributo que guarda el precio de las dietas del empleado.
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 */
	
	private float dietas;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 */
	public Directivo(){
		super();
	}

	/**
	 * Metodo que calcula las dietas.
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
         * @return devuelve las dietas del empleado
	 */
	
	public float calcularDietas() {
		// TODO implement me
		return 0;	
	}
	
	/**
	 * Sobreescritura metodo de la Superclase.
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
         * @return devuelve el sueldo del empleado
	 */
	
        @Override
	public float calcularSueldo() {
		// TODO implement me
		return 0;	
	}
	
	/**
	 * Sobreescritura metodo de la Superclase.
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
         * @return devuelve los atributos del objeto
	 */
	
        @Override
	public String visualizarDatos() {
		// TODO implement me
		return "";	
	}
	
}

