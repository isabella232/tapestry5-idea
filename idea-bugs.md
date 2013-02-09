Examples of Validation bugs in IntelliJ IDEA Tapestry 5 Plugin
==============================================================
Current as of IDEA 12.0.4 (EAP IU-123.165)

Issue A
-------
![Bugs Screenshot 1](bugs-screenshot-1.png)
 - Bug: Incorrect red squiggly error line below "-" (dash) characters in TML tag attributes
 - Workaround: None
 - Tracker: [IDEA-100346](http://youtrack.jetbrains.com/issue/IDEA-100346)

Issue B
-------
![Bugs Screenshot 2](bugs-screenshot-2.png)
 - Bug: Properties file editor incorrect highlights keys as 'unused' when referenced in TML file as ${message:property-key}
 - Workaround: Use `messages.get('property-key')` in backing class file
 - Tracker: [IDEA-](http://youtrack.jetbrains.com/issue/IDEA-)

Issue C
-------
![Bugs Screenshot 3](bugs-screenshot-3.png)
 - Bug: Tapestry 'parameter' namespace elements are incorrectly marked in error in TML editor
 - Workaround: None
 - Tracker: [IDEA-](http://youtrack.jetbrains.com/issue/IDEA-)

Resolved Issues
---------------
 - [IDEA-98955](http://youtrack.jetbrains.com/issue/IDEA-98955) __fixed in IDEA 12.0.4 (build >= 123.165)__
 - [IDEA-52763](http://youtrack.jetbrains.com/issue/IDEA-52763) __fixed in IDEA 12.0.3 (build >= 123.155)__
 - [IDEA-24697](http://youtrack.jetbrains.com/issue/IDEA-24697) __fixed in IDEA 12.0.3 (build >= 123.155)__
