## 1 User Case Diagram
![image](https://drive.google.com/uc?export=view&id=1sUJdhBcHOf-5BQMJbU7epKZIMTdYlJLC)
## 2 Use Case Descriptions

- *Requirements: User can search items by item type.*
- *Pre-conditions: User needs to be on the Grocery list activity.*
- *Post-conditions: Activity changes to Item Activity when user clicks on Item type.*
- *Scenarios: \
Normal:\
User clicks on item type (For example, clicks on Item type: meat)	\
New Activity -> Send user to the Item Activity\
	Alternate:\
User clicks on Back -> send user back to previous Activity(Grocery List Activity)\
Exceptional:\
Not clicking on Item Type. \
InvalidSelectionException*

- *Requirements: User can Select the item that they wants to buy.*
- *Pre-conditions: User needs to be on the Search Item by item type activity.*
- *Post-conditions: 
Activity changes to grocery list when 
->user click on the item 
and enter the quantity of the selected item 
and clicks on Add to Grocery List*
- *Scenarios: \
Normal:\
User clicks on item (For example, clicks on Item 3: Beef)\
Input Box pop up -> ask for Quantity of the selected item.\
User Enter the Quantity\
User click on Add to Grocery List\
Item add to the Grocery List\
New Activity -> Send user to the grocery list.\
Alternate:	\
User clicks on Item\
Input box pop up\
User clicks on cancel -> input box goes away\
User clicks on Back -> send user back to previous Activity(Select Item by item type Activity)\
Exception:\
User clicks on item\
Input box shows (ask for quantity)\
User Enter Invalid input and presses Add to Grocery List (Invalid input = anything other than Integer or number start with 0)\
InvalidInputException
