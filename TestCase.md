* Test Name ->User can search items by item type.
  * 1.Entrance criteria: User needs to be on Grocery List Activity
  * 2.Action expected from user: User Clicks on Search item by type in the Grocery List Activity.
  * 3.Expected Result: Send user to Search item by item type Activity
    * 1.Entrance Criteria: Refer to Previous Expected Result.
    * 2.Action expected from user:User Clicks on Back 
    * 3.Expected Result: Send user back to previous Activity (Grocery List Activity) 
&nbsp;
    * 1.Entrance Criteria: Refer to Previous Expected Result. (Send user to Search item by item type Activity)
    * 2.Action expected from user: User did not Not clicking on Item Type.
    * 3.Expected Result: invalidSelectionException (Exception pop up, ask user to click on Item type again)
&nbsp;
    * 1.Entrance Criteria: Refer to Previous Expected Result. (Send user to Search item by item type Activity)
    * 2.Action expected from user: User did not Not clicking on Item Type.
    * 3.Expected Result: invalidSelectionException (Exception pop up, ask user to click on Item type again)

* Test Name -> User can Select the item that they wants to buy.
  * 1.Entrance criteria: User needs to be on the Search Item by item type activity.
  * 2.Action expected from user: User Clicks on Type of item they want to search for.
  * 3.Expected Result: Send user to item Activity (item Activity display list of item grouped by item Type)
    * 1.Entrance Criteria: Refer to Previous Expected Result.
    * 2.Action expected from user:User Clicks on Back 
    * 3.Expected Result: Send user back to previous Activity (Search item by item Type Activity) 
&nbsp;
    * 1.Entrance Criteria: Refer to Previous Expected Result. (item Activity display list of item grouped by item Type)
    * 2.Action expected from user: User clicks on item
    * 3.Expected Result: input Box pop up -> ask for Quantity of the selected item.
        * 1.Entrance Criteria: Refer to Previous Expected Result (input Box pop up)
        * 2.Action expected from user: User Enter the Quantity and Click on Add to Grocery List
        * 3.Expected Result: item add to the Grocery List and Send User back to the Grocery List Activity
&nbsp;
        * 1.Entrance Criteria: Refer to Previous Expected Result (input Box pop up)
        * 2.Action expected from user: User Enter Invalid input and presses Add to Grocery List (Invalid input = anything other than Integer or number start with 0)
        * 3.Expected Result: InvalidInputException
&nbsp;
        * 1.Entrance Criteria: Refer to Previous Expected Result (input Box pop up)
        * 2.Action expected from user: User Enter the Quantity and Click on Cancel
        * 3.Expected Result: send user back to Item activity
