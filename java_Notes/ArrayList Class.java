Array List Class

	ARRAY LIST

		SYNTAX:

			ANATOMY:

				<>:
					Diamond opperators designate the data type being created or used

			DECLARING ARRAY LIST:

				ArrayList<String> lst1 = new ArrayList<>();
				**ArrayList<int> <-- invalid creation MUST HAVE OBJECT WITHIN <>**
				ArrayList<Integer> lst2 = new ArrayList<>();

				List<Long> myLst = new ArrayList<>();
					List is a more general data type compared to ArrayList which is more concrete



	RULES:

		Array lists can only store OBJECTS (such as Character, Integer, etc) Arrays can store primitive data

		Can be resized

		Can be directly printed 

	ARRAYLIST METHODS:

		.add(dataHere)

			adds a value to the list increasing the list size and placing the value 
			at the last index

		.add(indexHere, dateHere)

			adds a value to the list increasing the list size and placing
			the data at indexHere, shifting the whole array after indexHere by one location

		.size()

			gives the total size of the list. Similar to .length with Array

		.get(itemIndex)

			pulls the value out of the list at the itemIndex

		.remove(itemValue)

			removes an item from the ArrayList by looking for its value within the List
			removes the first occurance of the value within the List

		.remove(itemIndex)

			removes an item from the ArrayList by its index

				when you remove an item from an ArrayList, your idexes will all shift one to 

		.removeAll(listHere)

			will remove all the items in listHere FROM ANOTHER LIST 
				if an item in listHere already does not exist in the FIRST LIST
				it will just ignore that item and move on to the next one

				if there is more than one item from listHere in the first list 
					IT WILL REMOVE ALL INSTANCES OF THE ITEM IN THE FIRST LIST

		.indexOf(itemValue)

			gives you the index of an item in the ArrayList based on its itemValue

			if the value does not exist within ArrayList it will output -1

		.isEmpty();

			gives you a Boolean wrapper value if the ArrayList only contains null or not
			true or false

		.clear();

			deletes everything in your ArrayList leaving only null

		.contains(itemValue);

			checks the if the ArrayList contains itemValue and returns a Boolean value

		.retainAll(listHere);

			will replace an ArrayList that ONLY CONTAINS values that both listHere and original list SHARE

				nums1 = [123, 100, 223, 133, 125, 122]
				nums2 = [123, 125, 100, 3000, 2821]

				nums1.retainAll(nums2);
				nums1 = [123, 100, 125]

		.equals(listHere);

			will check for equality between ArrayList and listHere. MUST BE SAME VALUE IN SAME ORDER

				nums1 = [123, 125, 100, 3000, 2821]
				nums2 = [123, 125, 100, 3000, 2821]
				nums3 = [123, 3000, 100, 125, 2821]
				nums1.equals(nums2) = true
				nums2.equals(nums3) = true

		Collections.sort(listHere, Comparitor.comparitorMethodHere);

			this is a fairly confusing method of sorting an ArrayList it uses Collections and Comparitor classes which both come from java.util 

				some of the Comparitor methods we can use are:

					.naturalOrder():

						low to high ORDER

							nums1 = [123, 125, 100, 3000, 2821]

							Collections.sort(nums1, Comparitor.naturalOrder());
							nums1 = [100, 123, 125, 2821 , 3000]

					.reverseOrder();

						high to low ORDER

							nums1 = [123, 125, 100, 3000, 2821]

							Collections.sort(nums1, Comparitor.reverseOrder());
							nums1 = [3000, 2821, 123, 125, 100]

					.reverse();

						takes the existing array and reverses it

						 	nums1 = [123, 125, 100, 3000, 2821]

							Collections.sort(nums1, Comparitor.reverse());
							nums1 = [2821, 3000, 100, 125, 123]

	LIST METHODS:





