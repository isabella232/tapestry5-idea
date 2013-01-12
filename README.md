Tapestry 5 IntelliJ IDEA Test Project
=====================================

This is a Tapestry 5 project to exercise IntelliJ's support [Tapestry 5](http://tapestry.apache.org/)
code highlighting, navigation, and error detection.

This app is specifically designed to use features that are typical of large Tapestry applications,
but distilled to the bare essentials to allow easier isolation of bugs in the IntelliJ Tapestry plugin.

Isolated bugs are listed in the file `idea-bugs.md`

How to run this test application
--------------------------------
- Clone repo `git clone git@github.com:Widen/tapestry5-idea.git`
- Build IntelliJ classpath file: `gradle idea` (tested with Gradle version 1.3)
- Open project in IntelliJ
 - Add Tapestry Module via Project Structure
  - Filter Name: `plaid`
  - Application Package: `com.example.plaid`
 - Run `PlaidJettyLauncher` configuration
- Test application at `http://localhost:8080/`

