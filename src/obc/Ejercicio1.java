package obc;
/**
 * Tipos de datos en Java
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		// Tipos de datos primitivos
		// ===========================================
		
		/*
		 * Tipos numéricos enteros
        	byte: como su propio nombre denota, emplea un solo byte (8 bits) de almacenamiento. Esto permite almacenar valores en el rango [-128, 127].
        	short: usa el doble de almacenamiento que el anterior, lo cual hace posible representar cualquier valor en el rango [-32.768, 32.767].
        	int: emplea 4 bytes de almacenamiento y es el tipo de dato entero más empleado. El rango de valores que puede representar va de -231 a 231-1.
		 */
		
		byte var1=122;
		short var2=2054;
		int var3=450;
		long var4= -300;
		
        /*
        Tipos numéricos en punto flotante
        
        Los tipos numéricos en punto flotante permiten representar números tanto muy grandes como muy pequeños además de números decimales.
        
        float: conocido como tipo de precisión simple, emplea un total de 32 bits. Con este tipo de datos es posible representar números en el rango de 1.4x10-45 a 3.4028235x1038.
        double: sigue un esquema de almacenamiento similar al anterior, pero usando 64 bits en lugar de 32. Esto le permite representar valores en el rango de 4.9x10-324 a 1.7976931348623157x10308.
        */

		float var5=25.66f;
		double var6=-500.22d;
		
        /*
        Booleanos y caracteres
        
        boolean: tiene la finalidad de facilitar el trabajo con valores "verdadero/falso" (booleanos), resultantes por regla general de evaluar expresiones. Los dos valores posibles de este tipo son true y false.
        char: se utiliza para almacenar caracteres individuales (letras, para entendernos). En realidad está considerado también un tipo numérico, si bien su representación habitual es la del carácter cuyo código almacena. Utiliza 16 bits y se usa la codificación UTF-16 de Unicode.
        */
		
		boolean var7=true;
		char var8='c';
		
        /*
        Cadenas de caracteres
        
        Aunque las cadenas de caracteres no son un tipo simple en Java, sino una instancia de la clase String, el lenguaje otorga un tratamiento bastante especial a este tipo de dato, lo cual provoca que, en ocasiones, nos parezca estar trabajando con un tipo primitivo.
        Aunque cuando declaramos una cadena estamos creando un objeto, su declaración no se diferencia de la de una variable de tipo primitivo de las que acabamos de ver:
         */
		
		String var9 = "Variable de ejemplo";
		
		
        /*
        Vectores o arrays
        
        Los vectores son colecciones de datos de un mismo tipo. También son conocidos popularmente como arrays.
        Un vector es una estructura de datos en la que a cada elemento le corresponde una posición identificada por uno o más índices numéricos enteros.
        También es habitual llamar matrices a los vectores que trabajan con dos dimensiones.
         */
		
		int[][] matriz;
		matriz=new int[3][2];
		matriz[2][1]=25;
		System.out.println("1. Tipos de datos primitivos");
		System.out.println();
		System.out.println("Tipos númericos enteros");
		System.out.println("=============================================");
		System.out.println("byte: "+var1);
		System.out.println("short: "+var2);
		System.out.println("int: "+var3);
		System.out.println("long: "+var4);
		System.out.println();
		
		System.out.println("Tipos numéricos en punto flotante");
		System.out.println("======================================================");
		System.out.println("float: "+var5);
		System.out.println("double: "+var6);
		System.out.println("Tipos de datos caracteres y booleanos");
		System.out.println("================================================================");
		System.out.println("boolean: "+var7);
		System.out.println("char: "+var8);

		System.out.println();
		
		System.out.println("2. Tipos de datos estructurados - clases");
		System.out.println();
		
		System.out.println("Cadenas de caracteres / Vectores o arrays");
		System.out.println("==================================================");
		System.out.println("Cadena de caracteres: "+var9);
		System.out.println("Array: "+matriz[2][1]);
		
		System.out.println();

	}

}
