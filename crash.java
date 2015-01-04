public class crash {
	public static void main(String... args) {
		sun.nio.ch.NativeThread.signal(9);
	}
}
