package model;


/**
 * Superclase con la infromacion necesaria para describir a un trabajador de una empresa.
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @author Patricia Martin
 * @version 1.0
 */

public class Empleado
{
	/**
	 * Atributo donde se guarda el nombre del trabajador.
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 */
	
	private String nombre;
	
	/**
	 * Atributo donde se guarda el sueldo del trabajador.
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 */
	
	private float sueldo;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 */
	public Empleado(){
		super();
	}

	/**
	 * Metodo toString que devuelve la informacion del trabajador.
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
         * @return devuelve una cadena de los atributos.
	 */
	
	public String visualizarDatos() {
		// TODO implement me
		return "";	
	}
	
	/**
	 * Metodo que calcula el sueldo del trabajador.
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
         * @return devuelve el sueldo que gana el empleado.
	 */
	
	public float calcularSueldo() {
		// TODO implement me
		return 0;	
	}
	
}

