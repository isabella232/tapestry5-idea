Examples of Validation bugs in IntelliJ IDEA Tapestry 5 Plugin
==============================================================
Current as of IDEA 12.0.3 (#IU-123.155)

![Bugs Screenshot 1](bugs-screenshot-1.png)

Issue A
-------
 - __Error Message:__ `Cannot resolve property 'Home' of class 'Index'`
 - Bug: `defaultPrefix = literal` on `@Parameter` is not supported
 - Workaround: Change __pageTitle="Home" ---> pageTitle="literal:Home"__ (prefix with specific `literal` binding)
 - Tracker: [IDEA-98955](http://youtrack.jetbrains.com/issue/IDEA-98955)

Issue B
-------
 - Bug: Incorrect red squiggly error line below "-" (dash) characters in TML tag attributes
 - Workaround: None
 - Tracker: [IDEA-100346](http://youtrack.jetbrains.com/issue/IDEA-100346)

Resolved Issues
---------------
 - Tracker: [IDEA-52763](http://youtrack.jetbrains.com/issue/IDEA-52763) __fixed in IDEA 12.0.3 (build >= 123.155)__
 - Tracker: [IDEA-24697](http://youtrack.jetbrains.com/issue/IDEA-24697) __fixed in IDEA 12.0.3 (build >= 123.155)__
