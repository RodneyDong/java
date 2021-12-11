<h1>School Dance Ticket Software</h1>
  
<h2>Table of Contents</h2>
  
- [Completion Check](#completion-check )
- [Class Diagram](#class-diagram )
- [Configuration & Data store files](#configuration--data-store-files )
- [Flowchart](#flowchart )
- [Test](#test )
- [Java Docs](#java-docs )
- [Deployment (jar)](#deployment-jar )
- [Logging](#logging )
- [Software include](#software-include )
  
##  Completion Check
  
❓ Methods (add() recursive method)
❓ Loops (insert() while loop, )
❓ Decision structures
1. allow student buy early bird tickets for cheap price;
2. allow student buy more than one tickets for guests;
3. allow student buy door price tickets;
4. allow student refund his/her tickets;
5. allow display all students information on a table in the order of student id;
6. if student does NOT exist while refund, the message will be displayed on status bar at the bottom.
7. main window shall display party start time, duration, location and sponsor information
8. it is better to have help document for user.
9. [Basic operation check: add, save, load, insert, remove ...](Test.java )
10. ❓💡 What is the difference between add() and insert() method in BinaryTree?
  
  
✔️ UML - class, attributes, method... 👇[See below](#class-diagram )
❓ Original ideas and design complexity
✔️ Data Structure - applicable, Generic [See Node.java and BinaryTree.java]
✔️ Functionality - Ticket(early bird, door price, refund), Find(one.update, all), Help
✔️ Use of Tree data structure - BinaryTree, Node
✔️ Naming conventions (Camel style, upercase for class, lower case for fields and methods)
🔨 Comments/Docs
✔️🔨 Code readability (fields and methods naming, function single responsibility)
✔️ User Interface (MainFram, MainPanel, DetailDialog, RefundDialog, ...)
❓ UML Layout/presentation
✔️ File I/O (see Student.save(), Student.saveAll(), Student.loadAll())
✔️❓ Data Structure (ArrayList, LinkedList, Queue) 😢May not be used🚧
✔️❓ Basic operations (implemented size, contains, add, insert, find, but only used add, find)😢May not be used🚧
✔️ Advanced operation - remove() (BinaryTree.remove()==>refund ticket)
✔️ Use of a Tree data structure (BinaryTree.java)
✔️ Use file I/O to load/save configuration (danceticket.properties) and data (tickets.csv)
✔️ must incorporate your own data structure(s) (BinaryTree, Node, BinaryTree.find, BinaryTree.remove)
  
##  Class Diagram
  

```
Error: mermaid CLI is required to be installed.
Check https://github.com/mermaid-js/mermaid.cli for more information.

Error: Command failed: npx mmdc --theme default --input C:\Users\12818\AppData\Local\Temp\mume-mermaid2021117-5672-1aembqi.4guw.mmd --output C:\Users\12818\workspace\Rodney\java\assets\a58383159061995e70114a4ac4cfa3630.png
npm ERR! code E404
npm ERR! 404 Not Found - GET https://registry.npmjs.org/mmdc - Not found
npm ERR! 404 
npm ERR! 404  'mmdc@latest' is not in the npm registry.
npm ERR! 404 You should bug the author to publish it (or use the name yourself!)
npm ERR! 404 
npm ERR! 404 Note that you can also install from a
npm ERR! 404 tarball, folder, http url, or git url.

npm ERR! A complete log of this run can be found in:
npm ERR!     C:\Users\12818\AppData\Roaming\npm-cache\_logs\2021-12-08T00_27_43_031Z-debug.log
Install for [ 'mmdc@latest' ] failed with code 1

```  

##  Configuration & Data store files
  

```
Error: mermaid CLI is required to be installed.
Check https://github.com/mermaid-js/mermaid.cli for more information.

Error: Command failed: npx mmdc --theme default --input C:\Users\12818\AppData\Local\Temp\mume-mermaid2021117-5672-1k5vlyz.9lya.mmd --output C:\Users\12818\workspace\Rodney\java\assets\a58383159061995e70114a4ac4cfa3631.png
npm ERR! code E404
npm ERR! 404 Not Found - GET https://registry.npmjs.org/mmdc - Not found
npm ERR! 404 
npm ERR! 404  'mmdc@latest' is not in the npm registry.
npm ERR! 404 You should bug the author to publish it (or use the name yourself!)
npm ERR! 404 
npm ERR! 404 Note that you can also install from a
npm ERR! 404 tarball, folder, http url, or git url.

npm ERR! A complete log of this run can be found in:
npm ERR!     C:\Users\12818\AppData\Roaming\npm-cache\_logs\2021-12-08T00_27_50_622Z-debug.log
Install for [ 'mmdc@latest' ] failed with code 1

```  


```
Error: mermaid CLI is required to be installed.
Check https://github.com/mermaid-js/mermaid.cli for more information.

Error: Command failed: npx mmdc --theme default --input C:\Users\12818\AppData\Local\Temp\mume-mermaid2021117-5672-11bappm.5q68k.mmd --output C:\Users\12818\workspace\Rodney\java\assets\a58383159061995e70114a4ac4cfa3632.png
npm ERR! code E404
npm ERR! 404 Not Found - GET https://registry.npmjs.org/mmdc - Not found
npm ERR! 404 
npm ERR! 404  'mmdc@latest' is not in the npm registry.
npm ERR! 404 You should bug the author to publish it (or use the name yourself!)
npm ERR! 404 
npm ERR! 404 Note that you can also install from a
npm ERR! 404 tarball, folder, http url, or git url.

npm ERR! A complete log of this run can be found in:
npm ERR!     C:\Users\12818\AppData\Roaming\npm-cache\_logs\2021-12-08T00_27_56_174Z-debug.log
Install for [ 'mmdc@latest' ] failed with code 1

```  

  
##  Flowchart
  
* Detail Operation Logic

```
Error: mermaid CLI is required to be installed.
Check https://github.com/mermaid-js/mermaid.cli for more information.

Error: Command failed: npx mmdc --theme default --input C:\Users\12818\AppData\Local\Temp\mume-mermaid2021117-5672-seacxs.a5e7p.mmd --output C:\Users\12818\workspace\Rodney\java\assets\a58383159061995e70114a4ac4cfa3633.png
npm ERR! code E404
npm ERR! 404 Not Found - GET https://registry.npmjs.org/mmdc - Not found
npm ERR! 404 
npm ERR! 404  'mmdc@latest' is not in the npm registry.
npm ERR! 404 You should bug the author to publish it (or use the name yourself!)
npm ERR! 404 
npm ERR! 404 Note that you can also install from a
npm ERR! 404 tarball, folder, http url, or git url.

npm ERR! A complete log of this run can be found in:
npm ERR!     C:\Users\12818\AppData\Roaming\npm-cache\_logs\2021-12-08T00_28_01_167Z-debug.log
Install for [ 'mmdc@latest' ] failed with code 1

```  

  
* Refund Operation Logic

```
Error: mermaid CLI is required to be installed.
Check https://github.com/mermaid-js/mermaid.cli for more information.

Error: Command failed: npx mmdc --theme default --input C:\Users\12818\AppData\Local\Temp\mume-mermaid2021117-5672-otep4w.vjz8i.mmd --output C:\Users\12818\workspace\Rodney\java\assets\a58383159061995e70114a4ac4cfa3634.png
npm ERR! code E404
npm ERR! 404 Not Found - GET https://registry.npmjs.org/mmdc - Not found
npm ERR! 404 
npm ERR! 404  'mmdc@latest' is not in the npm registry.
npm ERR! 404 You should bug the author to publish it (or use the name yourself!)
npm ERR! 404 
npm ERR! 404 Note that you can also install from a
npm ERR! 404 tarball, folder, http url, or git url.

npm ERR! A complete log of this run can be found in:
npm ERR!     C:\Users\12818\AppData\Roaming\npm-cache\_logs\2021-12-08T00_28_06_240Z-debug.log
Install for [ 'mmdc@latest' ] failed with code 1

```  

##  Test
  
[test BinaryTree add(), loadAll(), saveAll(), Find(), Insert(), Remove()](../john/src/com/john/danceticket/Test.java )
  
also test configuration properties load(), Date format.
  
##  Java Docs
  
```DOS
Open DOS command window, cd to the folder below, type in javadoc command
  
C:\Users\12818\workspace\Rodney\java\doc\danceticket>javadoc -sourcepath ../../john/src -subpackages com.john.danceticket
```
![](images/javadoc.png )
  
Double click index.html file name
  
![](images/index-html.png )
  
##  Deployment (jar)
  
1. [Ant build](../john/build.xml )
2. target: dist
3. Generate danceticket.jar
```file
<project root>
    ├── 🔨build.xml
    |      
    ├── 🔥build/
    |      ├── com
    |      ├── resources
    |      └── logging.properties
    └── 🎯dist
           └── lib
                └── danceticket.jar
```
to Run the jar file
```DOS
cd <danceticket.jar folder>
java -jar danceticket.jar
```
  
❗️⚡️💡 Very important: 
1. In order to run the jar file, put all configuration and resource files (logging.properties, dance.jpg, danceticket.properties) in classpath.
2. use InputStream to read file, instead of FileReader.
```java
		String imageFile = parent.getProp().getProperty(IMAGE_FILE_PROP);
        // load image file by using InputStream
		InputStream imgIn = MainPanel.class.getClassLoader().getResourceAsStream(imageFile);
		try {
			img = ImageIO.read(imgIn);
		} catch (IOException e) {
			e.printStackTrace();
		}
```
  
```java
	private void loadProperties() {
		logger.info("loadProperties() ...");
		prop = new Properties();
        // load resources/danceticket.properties file using InputStream
		InputStream in = MainFrame.class.getClassLoader().getResourceAsStream(PROP_FILE);
		try {
			// load a properties file
			prop.load(in);
		} catch (IOException ex) {
			logger.severe(ex.getMessage());
		}
	}
  
```
  
Run danceticket.jar on DOS command window.
```dos
C:\Users\12818\workspace\Rodney\java\john\dist\lib>java -jar danceticket.jar
file:/C:/Users/12818/workspace/Rodney/java/john/dist/lib/danceticket.jar!/logging.properties
```
##  Logging
  
1. Logging configuration file: logging.properties
2. logging output file: <userhome>/workspace/Rodney/java/mylogs%u.log
3. Create logger
```java
	static {
//		System.setProperty("java.util.logging.config.file", "/Users/12818/workspace/Rodney/java/john/conf/logging.properties");
		String path = MainFrame.class.getClassLoader().getResource("logging.properties").getFile();
		System.setProperty("java.util.logging.config.file", path);		
//		System.setProperty("java.util.logging.ConsoleHandler.level", "java.util.logging.Level.WARNING");
	}
	static Logger logger = Logger.getLogger("DANCE_TICKET");
```
  
##  Software include
  
  

```
Error: mermaid CLI is required to be installed.
Check https://github.com/mermaid-js/mermaid.cli for more information.

Error: Command failed: npx mmdc --theme default --input C:\Users\12818\AppData\Local\Temp\mume-mermaid2021117-5672-zm8x0w.juph.mmd --output C:\Users\12818\workspace\Rodney\java\assets\a58383159061995e70114a4ac4cfa3635.png
npm ERR! code E404
npm ERR! 404 Not Found - GET https://registry.npmjs.org/mmdc - Not found
npm ERR! 404 
npm ERR! 404  'mmdc@latest' is not in the npm registry.
npm ERR! 404 You should bug the author to publish it (or use the name yourself!)
npm ERR! 404 
npm ERR! 404 Note that you can also install from a
npm ERR! 404 tarball, folder, http url, or git url.

npm ERR! A complete log of this run can be found in:
npm ERR!     C:\Users\12818\AppData\Roaming\npm-cache\_logs\2021-12-08T00_28_13_703Z-debug.log
Install for [ 'mmdc@latest' ] failed with code 1

```  

  