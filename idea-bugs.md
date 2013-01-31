Examples of Validation bugs in IntelliJ IDEA Tapestry 5 Plugin
==============================================================
Current as of IDEA 12.0.3 (#IU-123.155)

![Bugs Screenshot 1](https://github.com/Widen/tapestry5-idea/raw/master/bugs-screenshot-1.png)

Issue A
-------
 - /com/example/plaid/pages/Index.tml, line 1 (pageTitle="Home")
 - /com/example/plaid/pages/Index.tml, line 7 (alt="Random plaid image")
 - Error Message: Cannot resolve property 'Home' of class 'Index'
 - Bug: `defaultPrefix = literal` on @Parameter is not supported
 - Workaround: Change __pageTitle="Home" --> pageTitle="literal:Home"__ (prefix with binding)
 - Tracker: [IDEA-98955](http://youtrack.jetbrains.com/issue/IDEA-98955)

Issue B
-------
 - Tracker: [IDEA-52763](http://youtrack.jetbrains.com/issue/IDEA-52763) __fixed in IDEA 12.0.3 (build >= 123.155)__

Issue C
-------
 - Tracker: [IDEA-24697](http://youtrack.jetbrains.com/issue/IDEA-24697) __fixed in IDEA 12.0.3 (build >= 123.155)__
