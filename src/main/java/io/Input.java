package io;

import org.lwjgl.glfw.*;

import static org.lwjgl.glfw.GLFW.*;

public class Input extends GLFWKeyCallback {
	
	public static boolean[] keys = new  boolean[GLFW_KEY_LAST+1];

	@Override
	public void invoke(long window, int key, int scancode, int action, int mods) {
		keys[key] = action != GLFW_RELEASE;
		
	}

}
