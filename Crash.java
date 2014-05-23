import java.lang.reflect.Field;
import sun.misc.Unsafe;

public class Crash {
	public static void main(String[] args) throws Exception {
		Field privUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
		privUnsafe.setAccessible(true);
		Unsafe theUnsafe = (Unsafe) privUnsafe.get(null);
		
		theUnsafe.freeMemory(1);
	}
}
