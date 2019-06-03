import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ForLoop {
	static Logger logger = Logger.getLogger(ForLoop.class);
	
	public static void main(String[] args) {
		int n =5;
		for(int i = 1; i<= n ; i++){
			for(int j = n; j>= i; j--){
				System.out.print(j+" ");
				//logger.info(j+" ");
			}
			System.out.println();
		}
	}
}
