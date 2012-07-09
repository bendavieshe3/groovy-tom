Tom
===

A BDD layer implemented on top of Webdriver APIs to allow highly readable web testing DSL. Implemented in Groovy

About
-----
The goal of Tom is to provide a highly readable DSL and the accompanying framework for specifying and executing web tests. We want to enable test specifications like this:

````
given {
	//preconditions
	UserIsJoe
	UserIsLoggedIn
}
when {
	//tested actions
	UserNavigatesToTodoPage
	UserEntersTodoItem
	TodoItemIsGroceryTodo
	TodoCountIsTodoListCount
}
then {
	//expected result
	TodoListContainsTodoItem
	TodoCountIsTodoCountPlusOne
}
````

To achieve test specifications like the above, you need to define a page model, a test data domain model and a set of highlevel actions.

Status
------
Tom is only in the initial stages of development. The usage information below is intended to specify the goals and intentions of the project.

Building the Project
--------------------
This repository has the structure of Gradle Groovy/Java project. To use, clone or export the project files to a local directory and run gradle tasks (which obviously, requires [Gradle][gradle])

Using Tom
---------
Tom describes a framework for specifying and executing a web testing DSL. To use Tom you need to create:
- A Page model (that is, a set of object representing your pages and their relationships)
- An Action model (describing how - In WebDriver speak and higher abstractions - an action is 
performed),
- A Test data domain for providing the required test data
- The Test specifications in the DSL itself.

[gradle]: http://gradle.org

