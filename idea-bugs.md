![Bugs Screenshot 1](https://github.com/Widen/tapestry5-idea/raw/master/bugs-screenshot-1.png)

- /com/example/plaid/pages/Index.tml, line 1
 - Screen Shot: `Issue A`
 - Error Message: Cannot resolve property 'Home' of class 'Index'
 - Bug: defaultPrefix on @Parameter is not supported
 - Workaround: Change 'pageTitle="Home"' --> 'pageTitle="literal:Home"'

- /com/example/plaid/pages/Index.tml, line 5
 - Screen Shot: `Issue B`
 - Error Message: Attribute alt is not allowed here
 - Error Message: Cannot resolve property 'Random' of class 'Index'
 - Error Message: Attribute width is not allowed here
 - Error Message: Attribute height is not allowed here
 - Bug: @SupportsInformalParameters not supported
 - Workaround: None

- /com/example/plaid/pages/Index.tml, line 13
 - Screen Shot: `Issue C`
 - Error Message: Cannot resolve symbol 'GroovyLibraryMappedPage'
 - Bug: '' (application) path on org.apache.tapestry5.services.LibraryMapping is not supported
  - Contribute Component Class Resolver with `configuration.add(new LibraryMapping("", "com.example.checked"))`
 - Note: LibraryMappings using an non-empty string work correctly (line 12)
 - Workaround: None

![Bugs Screenshot 2](https://github.com/Widen/tapestry5-idea/raw/master/bugs-screenshot-2.png)

- /com/example/tartan/pages/JavaLibraryMappedPage.tml, line 5
- /com/example/checked/pages/GroovyLibraryMappedPage.tml, line 5
 - Screen Shot: `Issue D`
 - Error Message: Cannot resolve property 'text' of class '???'
 - Bug: Property expression validation is not supported with non-primary ComponentClassResolver
 - Workaround: None
