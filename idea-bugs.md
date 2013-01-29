Examples of Validation bugs in IntelliJ IDA Tapestry Plugin
===========================================================
Current as of IDEA 12.0.1 (#IU-123.94)

![Bugs Screenshot 1](https://github.com/Widen/tapestry5-idea/raw/master/bugs-screenshot-1.png)

Issue A
-------
- Screen Shot: `Issue A`
 - /com/example/plaid/pages/Index.tml, line 1 (pageTitle="Home")
 - /com/example/plaid/pages/Index.tml, line 7 (alt="Random plaid image")
 - Error Message: Cannot resolve property 'Home' of class 'Index'
 - Bug: `defaultPrefix = literal` on @Parameter is not supported
 - Workaround: Change __pageTitle="Home"__ --> __pageTitle="literal:Home"__ (prefix with binding)
 - Tracker: [IDEA-98955](http://youtrack.jetbrains.com/issue/IDEA-98955)

Issue B.1
-------
- /com/example/plaid/pages/Index.tml, line 5
 - Screen Shot: `Issue B`
 - ~~Error Message: Attribute alt is not allowed here~~
 - ~~Error Message: Attribute width is not allowed here~~
 - ~~Error Message: Attribute height is not allowed here~~
 - ~~Bug: @SupportsInformalParameters not supported~~
 - Tracker: (__fixed IDEA 12 >= 123.152__) [IDEA-52763](http://youtrack.jetbrains.com/issue/IDEA-52763)

Issue B.2 (related to Issue A?)
-------
- /com/example/plaid/pages/Index.tml, line 5
 - Screen Shot: `Issue B`
 - Error Message: Cannot resolve property 'Random' of class 'Index'
 - Workaround: None

Issue C
-------
- /com/example/plaid/pages/Index.tml, line 13
 - Screen Shot: `Issue C`
 - Error Message (line 12): Cannot resolve symbol 'JavaLibraryMappedPage'
 - Error Message (line 13): Cannot resolve symbol 'GroovyLibraryMappedPage'
 - ~~Bug: Groovy based components are not resolvable~~
 - Bug: Multiple Library Mappings to the same path confuse the editor
  - If library mappings are modified editor errors are 'fixed' [diff to remove errors](https://github.com/Widen/tapestry5-idea/compare/master...unique-library-mappings)
 - Tracker:  - Tracker: (__partially fixed in IDEA 12 >= 123.152__ - related to Groovy component) [IDEA-24697](http://youtrack.jetbrains.com/issue/IDEA-24697), [IDEA-52761](http://youtrack.jetbrains.com/issue/IDEA-52761)

![Bugs Screenshot 2](https://github.com/Widen/tapestry5-idea/raw/master/bugs-screenshot-2.png)

Issue D
-------
- /com/example/tartan/pages/JavaLibraryMappedPage.tml, line 5
- /com/example/checked/pages/GroovyLibraryMappedPage.tml, line 5
 - __This issue may be related to Issue C.
 - Screen Shot: `Issue D`
 - Error Message: Cannot resolve property 'text' of class '???'
 - Workaround: Create
 - Tracker: [IDEA-98956](http://youtrack.jetbrains.com/issue/IDEA-98956)
