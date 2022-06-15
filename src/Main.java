import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class Main implements NativeKeyListener {

	public static void main(String[] args) {

		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException e) {
			e.printStackTrace();
		}
		GlobalScreen.addNativeKeyListener(new Main());
	}

	public void nativeKeyPressed(NativeKeyEvent e) {
		System.out.println("Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
	}
	
	//hello world - testing keylogger
	public void nativeKeyReleased(NativeKeyEvent e) {
		System.out.println("Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
	}
}
