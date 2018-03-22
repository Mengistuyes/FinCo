FincoFramework has AbstractFincoUi from which all the applications will extend and implement their own features.
FincoFrameworkUi will manage all the concrete application application codes which developers write.

We have also developed AbstractPopUp for abstraction of DialogPopUp. The application developers can extend DialogPopUp
and put their custom context on it. All the codes will be run by abstractPopUp.

AbstractFincoUi has implemented command pattern for button clicks. The application developers will extend the abstractFrameworkUi
and register the commands and submit in their application. Whenever, the click event happened in the concrete application,
the command invoker in abstractFincoUi will manage the events and delegate the event to appropriate command polymorphically.


We have also used the party pattern for creation of customer classes and interfaces in party folder.
The model class in the model folder will manage the transactions and act as doa classes.

