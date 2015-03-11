import java.lang.reflect.Field;
import sun.misc.Unsafe;

public class crash {
	public static void main(String... args) throws Exception {
		Field privUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
		privUnsafe.setAccessible(true);
		((Unsafe) privUnsafe.get(null)).putAddress(0, 0);
	}
}
