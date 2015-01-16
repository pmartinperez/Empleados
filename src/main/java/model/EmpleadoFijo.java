package model;


/**
 * Subclase de Empleado que describe a un trabajador fijo.
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @author Patricia Martin
 * @version 1.0
 */

public class EmpleadoFijo extends Empleado
{
	/**
	 * Atributo donde se guarda el tiempo que lleva trabajado el empleado en la empresa.
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 */
	
	private int antiguedad;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 */
	public EmpleadoFijo(){
		super();
	}

	/**
	 * Metodo que calcula la aniguedad del empleado.
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
         * @return devuelve la antiguedad del empleado.
	 */
	
	public float calcularAntiguedad() {
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
	
}

