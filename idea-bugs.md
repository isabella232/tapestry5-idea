Examples of Validation bugs in IntelliJ IDA Tapestry Plugin
===========================================================
Current as of IDEA 12.0.1 (#IU-123.94)

![Bugs Screenshot 1](https://github.com/Widen/tapestry5-idea/raw/master/bugs-screenshot-1.png)

Issue A
-------

- /com/example/plaid/pages/Index.tml, line 1
 - Screen Shot: `Issue A`
 - Error Message: Cannot resolve property 'Home' of class 'Index'
 - Bug: defaultPrefix on @Parameter is not supported
 - Workaround: Change 'pageTitle="Home"' --> 'pageTitle="literal:Home"'
 - Tracker: [IDEA-98955](http://youtrack.jetbrains.com/issue/IDEA-98955)

Issue B
-------
- /com/example/plaid/pages/Index.tml, line 5
 - Screen Shot: `Issue B`
 - Error Message: Attribute alt is not allowed here
 - Error Message: Cannot resolve property 'Random' of class 'Index'
 - Error Message: Attribute width is not allowed here
 - Error Message: Attribute height is not allowed here
 - Bug: @SupportsInformalParameters not supported
 - Workaround: None
 - Tracker: [IDEA-52763](http://youtrack.jetbrains.com/issue/IDEA-52763)

Issue C
-------
- /com/example/plaid/pages/Index.tml, line 13
 - Screen Shot: `Issue C`
 - Error Message: Cannot resolve symbol 'GroovyLibraryMappedPage'
 - Bug: '' (application) path on org.apache.tapestry5.services.LibraryMapping is not supported
  - Contribute Component Class Resolver with `configuration.add(new LibraryMapping("", "com.example.checked"))`
 - Workaround: Do not use a empty-string prefix (e.g. ""); note that an empty-string is an explicitly supported construct in Tapestry
  - [Javadoc](http://tapestry.apache.org/current/apidocs/org/apache/tapestry5/services/LibraryMapping.html): `The special pathPrefix "" (the empty string) identifies the application.`
 - Tracker: [IDEA-24697](http://youtrack.jetbrains.com/issue/IDEA-24697), [IDEA-52761](http://youtrack.jetbrains.com/issue/IDEA-52761)

![Bugs Screenshot 2](https://github.com/Widen/tapestry5-idea/raw/master/bugs-screenshot-2.png)

Issue D
-------
- /com/example/tartan/pages/JavaLibraryMappedPage.tml, line 5
- /com/example/checked/pages/GroovyLibraryMappedPage.tml, line 5
 - Screen Shot: `Issue D`
 - Error Message: Cannot resolve property 'text' of class '???'
 - Bug: Property expression validation is not supported with TML files when using LibraryMapping
 - Workaround: None
 - Tracker: [IDEA-98956](http://youtrack.jetbrains.com/issue/IDEA-98956)
