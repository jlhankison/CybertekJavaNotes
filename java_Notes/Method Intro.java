
Day 31:


METHOD INTRO

METHODS WE KNOW:
	
	println(Something to print);
	print( something to print);

	SCANNER:
		Scanner scan = new Scanner(System.in);

		String Name

	STRING:

		str.charAt(0);
		str.toLowercase()

	ARRAYS:

		Arrays.toString(your array object here);
		Arrays.sort(***)

TYPES OF METHODS:

	Method Parameter Options:

		Methods that accept external data when being called
			subString.(1,2)
			.charAt(10)
		method that does not accept external data when being called
			.length()
			.next()	
	------
	Void method:
		Methods that return a value when being called (they just perform the action)
			.sort(array here)
		Methods that return a value that can be STORED to a variable
			.length();
			.nextInt();
	------
	Methods that needs an object when being called
	Methods that doent need an object when being called

WHAT IS A METHOD

	reusible piece of code that performs a function with an object

	RULES:

		You cannot create two methods with the same method header even if they have different code inside

BUILT IN METHODS:

	STRING:
	
		LOCATION: 
			java.lang.String
		DESCRIPTION:
			String class is an IMPLICITLY (automatically) imported class that exists within JDK it is

	MATH:

		LOCATION:
			java.lang.String

		DESCRIPTION;

METHOD OVERLOADING:
	
	Methods can be named the same thing if they process different datatypes within the parameter

	you can not create 2 methods that have the same parameters AND the same name or SIGNATURE

	method name + parameter list = method signature.



CREATING A CUSTOM METHOD

	DO NOT CREATE A METHOD INSIDE THE MAIN METHOD!

	METHOD THAT DOES NOT NEED EXTERNAL DATA WHEN BEING CALLED

		ANATOMY:

			access modifier  No object needed to call   Return Type    Method Name    Method parameters	
   				  |					    | 					 |   			|			    |
			   public                static                void       printYourName        ()

		   
		public: 
			access modifier; open to public everyone can see
		static:
			no object needed to call ;
		void:
			return type(none in this case, just take the action)
		main:
			method name can be anything (ExampleMethod)
		():
			method parameters(none in this case) 


	   RULES:

	   		How to call:

	   			if you are outside of the original class
	   			ClassName.methodName(external data if needed);

	   			if you are within your original class
	   			methodName(external data if needed);

   			Where to place method:

   				Within the Class curly braces{}

   				Outside of any other method (Main method included)


	METHOD THAT DOES NEED EXTERNAL DATA

		ANATOMY:

			access modifier  No object needed to call   Return Type    Method Name    Method parameters	
   				  |					    | 					 |   			|			    |
			   public                static                void       printYourName        ()

		   
			public: 
				access modifier; open to public everyone can see
			static:
				no object needed to call ;
			void:
				return type(none in this case, just take the action)
			main:
				method name can be anything (ExampleMethod)
			():
				method parameters(REQUIRED TO PERFORM METHOD FUNCTION IN THIS CASE) 


	METHOD WITH RETURN TYPE AND NO PARAMETER


		RETURN TYPE:

			Return type Methods can RETURN a specific value to be STORED to a variable
			
			Return keyword is used to return a value out of a method. it's mandatory to return velue of specified type in method header

		ANATOMY:

			access modifier  No object needed to call    Return Type     Method Name    Method parameters	
   				  |					    | 					 |   			  |			    |
			   public                static            int,char,String    printYourName     ()




