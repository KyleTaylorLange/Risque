package main.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Separate thread class to allow us to input data to the console while also receiving data.
 * @author Kyle
 *
 */
public class InputHandler extends Thread {
	private Console d_owner;
	
	/**
	 * Inits the InputHandler with an owner.
	 * @param p_owner the new Console owner
	 */
	public InputHandler(Console p_owner) {
		setOwner(p_owner);
	}
	
	/**
	 * Gets the owning Console for this.
	 * @return the owning Console
	 */
	public Console getOwner() {
		return d_owner;
	}
	
	/**
	 * Sets the owning Console for this.
	 * @param p_owner the new owner.
	 */
	public void setOwner(Console p_owner) {
		d_owner = p_owner;
	}
	
	/**
	 * Entry point for the InputHandler. The object is deleted once this method finishes.
	 */
	public void run() {
        try {
        	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		
			// keep looping and reading input and converting them to function calls.
			// So far we have just one command: quit
			String input = "";
			while (!input.trim().equalsIgnoreCase("quit")) {
				input = reader.readLine();
				
			//calling corresponding functions from console class according to the input 
				if (input=="editcontinent"){
			 getOwner().execEditcontinent();}
				
				if (input=="editcountry"){
			 getOwner().execEditcountry();}

                                if (input=="editneighbor"){
			 getOwner().execEditneighbor();}

                                if (input=="showmap"){
			 getOwner().execShowmap();}

				if (input=="savemap"){
			 getOwner().execSavemap();}

				if (input=="editmap"){
			 getOwner().execEditmap();}

 				if (input=="validatemap"){
			 getOwner().execValidatemap();}
				
				if (input=="loadmap"){
			 getOwner().execLoadmap();}

				if (input=="gameplayer"){
			 getOwner().execGameplayer();}

				if (input=="assigncountries"){
			 getOwner().execAssigncountries();}

				if (input=="deploy"){
			 getOwner().execDeploy();}

			}
		} catch (IOException e) {
			// Just print error and go continue to the exit portion if we encounter an error.
			System.err.println("Terminating program due to IOException: " + e.getMessage());
		}
        // Do the quit command if we entered quit.
		if (getOwner() != null) {
			getOwner().execQuit();
		}
	}
}