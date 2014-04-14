import java.util.Properties;
import java.util.Set;

public class SystemProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Properties props = System.getProperties();
		Set<Object> keys = props.keySet();
		for (Object key : keys) {
			System.out.println(key + "-->" + props.getProperty((String) key));
		}
	}

}
