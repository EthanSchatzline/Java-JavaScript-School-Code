package data;

import java.io.IOException;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

import static org.lwjgl.opengl.GL11.*;

public class Image {
	
	
	public static Texture player;
	
	public static int playerID;
	
	public Image(String name){
		
		player = get(name);
		playerID = player.getTextureID();
		
		
	}
	
	
	public static Texture get(String name){
		
		try {
			return TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/"+name + ".png"), GL_NEAREST);
		} 
		catch 
		(IOException e) 
		{
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static void dispose(){
		
		player.release();
		
	}
	
	

}
