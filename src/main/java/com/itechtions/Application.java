package com.itechtions;

public class Application{
	public Application(){
		System.out.println("Inside Application");
	}
	
	public static void main(String[] args){
		System.out.println("Starting application");
		Application app = new Application();
	}
}