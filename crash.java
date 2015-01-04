import java.lang.reflect.Field;
import sun.misc.Unsafe;

public class crash {
	public static void main(String... args) throws Exception {
		b();
	}

	static void a() {
		sun.nio.ch.NativeThread.signal(9);
	}

	static void b() throws Exception {
		Field privUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
		privUnsafe.setAccessible(true);
		((Unsafe) privUnsafe.get(null)).putAddress(0, 0);
	}
}
