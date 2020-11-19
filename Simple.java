import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
    
public class Simple {
	public static void main(String[] args){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("This is my Hello World Java. " + dtf.format(now));
		System.out.println("From Local");
		}
	}
