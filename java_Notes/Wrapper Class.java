

Day 35


WRAPPER CLASSES

	Wrapper classes typically take primitive types and wrap them up as an object

	example:
		Class Integer --> deals with primitive int as if it were an object
		Class Double  --> deals with primitive double as if it were an object

	RULES:

		Wrapper classes can store null while a primitive CAN NOT

	TERMS:

		BOXING:

			Turning a primitive type to Wrapper Refference type

				Integer i1 = 12; automatic conversion
				Integer i2 = new Integer("3.14"); OLD way of boxing (not recommended)
				Integer i3 = Float.valueOf (3.14); basically oposite of .parseInt




		UNBOXING:

			Turning a Wrapper Reference Type to a primitive type

				int i1 - new Integer ("12"); automatic conversion
				Integer.parseInt("12") basically opposite of .valueOf


	ABOUT:

		PRIMITIVE WRAPPER CLASSES:

			classes that are provided in JDK for creating an object that needs to represent a primitive type

			each primitive type has its own correspoding wrapper class to create an object

				boolean = Boolean 		
				char 	= Characters 	
				byte 	= Byte 		
				short	= Short 		
				int 	= Integer
				long	= Long
				float 	= Float
				double	= Double
				... you get it

			SYNTAX:

				how to declare:

					version 1:

						Boolean b = new Boolean(true);
						Character c = new Character('c');
						Byte bt1 = new Byte ((byte) 123); OR Byte bt2 = new Byte ("123")
						Short s = new Short ("1200");

					version 2:

						Boolean b = Boolean.valueOf(true);
						Integer i = Integer.valueOf(249112);
						Float f   = Float.valueOf(12.2f);
						Integer i2 = Integer.valueOf("249112");

	METHODS:

		Integer.parseInt(exampleString), Float.parseFloat(exampleString), Boolean.parseBoolean(exampleString)

			All of these methods do the same thing. They take a String object Value and convert the contents to a primitive data type IF THE STRING ONLY CONTAINS THE RELATIVE INFORMATION 
				Example:
					Boolean.parseBoolean("true"); --> boolean value of true
					Boolean.parseBoolean("yes");  --> .parseBoolean does not read "yes" as meaning true so this outputs boolean value of false
					Integer.parseInt("2341");	 --> int value of 2341
					Integer.parseInt("hello");	  --> returns an error. "hello" is not a value that can be parsed into an integer

	EXCEPTIONS:	
		parsInt --> converts a string with number charactes into the primitve int
			Note: the string needs to be ONLY NUMBER CHARACTERS if it is not it will throw an error. Extract number characters from a string first before performing parsInt

