ABSTRACTION

		Abstract is the opposite of Final, Abstract classes and methods are built STRICTLY TO BE INHERITED! An abstract class is a purpose built superclass

	REFERENCE EXAMPLE:

		public abstract class Car {

    		int year;
    		String brand;

    		public abstract void start();

		}

		public class ElectricCar extends Car{

    		int batteryLevel;

		    @Override
		    public void start() {
		        System.out.println("Electric car turns on");
		    }
		}

	

	Abstract Class:

		I don't want to create a car object using this class, I only want this class to be a super class to provide reusable fields and methods for the sub class

		This class is designed to be a super class.

		An Abstract class can not be instantiated (made into a object) it is strictly a template for sub classes.



	Abstract Method

		abstract method is just a placeholder for a method that will exist in all subclasses of the abstract class OR the interface

		Abstract methods are MEANT TO BE OVERRIDDEN!

			EXAMPLE:

				public abstract void start(); <-- the abstract method, written in Car class

				@Override
			    public void start() {
			        System.out.println("Electric car turns on");  <-- the inherited method that is overriden to the current class
			    }

		Rules:

			Abstract methods do not end with curly braces{} but with semicolon ;

				**Abstract methods DO NOT HAVE A BODY (unless it exists in an abstract class THAT EXTENDS ANOTHER ABSTRACT CLASS)

			Abstract methods CAN ONLY BE USED IN ABSTRACT CLASSES!

	Concrete Class:

		A Concrete class is ANY subclass that extends an abstract class 


	MULTI LAYERED ABSTRACTION:

		Abstract classes can also extend other abstract classes Ad Infinititum 

		Abstract methods 


	CREATING AN ABSTRACT OBJECT ADDRESS

		While you can NOT create an OBJECT with an abstract class you CAN create an address to an empty place in the heap that can hold an object from 
		ANY of the concrete classes ASSOCIATED WITH THE ABSTACT CLASS.

		Example:

			public abstract class Employee {
			}

			public class FullTimeEmployee extends Employee {
			}

			public class HourlyEmployee extends Employee {
			}

			public class Main {

	    		public static void main(String[] args) {

	    			Employee e1; <-- Creates blank Employee address that can hold any object ASSOCIATED with the abstract class

	    			Employee e2 = new FullTimeEmployee(); <-- creates a FullTimeEmployee object "e2" that can be reassigned to another Employee type Object

	    			e2 = new HourlyEmployee(); <--- e2 is reassigned to an HourlyEmployee





