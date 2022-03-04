//supawit itthisiriwet 
//6209650370
package homework2;

public class InvalidDataException extends Exception{
	public InvalidDataException() {
		super("Data Error");
	}
	public InvalidDataException(String message) {
		super(message);
	}

}
