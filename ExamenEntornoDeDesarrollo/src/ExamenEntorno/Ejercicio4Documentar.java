package ExamenEntorno;
/**
 * 
 * @author Invitado21-22-08
 * @version 1.0
 * @see https://www.google.com
 */

public class Ejercicio4Documentar implements InterSaludo {
	public static class MainParameter {
		private String[] args;
		private Object param2;

		public MainParameter(String[] args, Object param2) {
			this.args = args;
			this.param2 = param2;
		}

		public String[] getArgs() {
			return args;
		}

		public void setArgs(String[] args) {
			this.args = args;
		}

		public Object getParam2() {
			return param2;
		}

		public void setParam2(Object param2) {
			this.param2 = param2;
		}
	}
	/**
	 * Inicializa el codigo con parametro args
	 * @param parameterObject TODO
	 */
	protected static void main(MainParameter parameterObject) {
		String saludo;
	}
	/**
	 * Nos devuelve un Hola
	 * @return
	 */
	@Override
	public String saludo() {
		return "Hola";
	}
	/**
	 * parametro saludo
	 * @param saludo
	 */
	public void setSaludo(String saludo){
	}

}
