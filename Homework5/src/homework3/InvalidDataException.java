//supawit itthisiriwet 
//6209650370
package homework3;

public class InvalidDataException extends Exception{
	public InvalidDataException() {
		super("Invalid data");
	}
	public InvalidDataException(String message){
		super(message);
	}
}
