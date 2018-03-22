In the bank app, the bank class which is main class for running the application will extend
from AbstractFincoUi which is framework Gui. All the code in the bank basically is run by framework gui.

For the popdialog views, we have created abstractPopUp from which all the pop up dialogs in concrete application will extend
or use it as a composite for dailog views. All the dialog code is run by our abstractPopup.

We have used command pattern for button clicks. When users code the clicks, they will  create the commands and register and
submit them in abstractFincoUI. AbstractFincoUi will manage the command invoke for all the commands. All the application
developers will need to do is to register and submit it.

All the operations in the bank such as account creation, and transaction is done by implementing or extending the classes
and interfaces in framework.

All the operations is done by the framework. The framework has the dao classes for data management.
