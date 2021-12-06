<h1>School Dance Ticket Software</h1>

* Students pay for tickets (+ guest)
* Early bird price
* ❓ Cross reference against student number list

## Completion Check
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
9. [Basic operation check: add, save, load, insert, remove ...](Test.java)
10. ❓💡 What is the difference between add() and insert() method in BinaryTree?


✔️ UML - class, attributes, method... 👇[See below](#class-diagram)
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
✔️❓ Data Structure (ArrayList, LinkedList, Queue)
✔️❓ Basic operations (implemented size, contains, add, insert, find, but only used add, find)
✔️ Advanced operation - remove() (BinaryTree.remove())
✔️ Use of a Tree data structure (BinaryTree.java)
✔️ Use file I/O to load/save configuration (danceticket.properties) and data (tickets.csv)
✔️ must incorporate your own data structure(s) (BinaryTree, Node, BinaryTree.insert)

## Class Diagram
```mermaid
classDiagram
class Comparable{
    <<interface>>
    compareTo(Object)
}
class Student{
    - id:int
    - name:String
    - earlyBirdTickets:int
    - doorTickets:int
    students:BinaryTree
    addStudent(Student)
    save()
    saveAll()
    loadAll()
}

class BinaryTree{
    root:Node
    add(Student)
    remove(Student)
    insert(Node, Student)
    contains(Student)
    size()
}

class Node{
    student:Student
    left:Node
    right:Node
}
Comparable<|--Student
BinaryTree *-- Node
Student *-- BinaryTree

class ActionListener{
    <<interface>>
    actionPerforme(ActionEvent)
}
class MainFrame{
    displayAll()
    getStudentData()
    traverseInOrder(root, list)
    setStatus(String)
}

class TicketDialog{
    save()
}

class DetailDialog{
    updateStudent()
    findStudent()
}
JFrame<|--AbstractFrame
AbstractFrame <|-- MainFrame
ActionListener<|--MainFrame
MainFrame *--MainPanel
JPanel<|--MainPanel
JDialog<|--DetailDialog
MainFrame *-- DetailDialog
JDialog<|-- RefundDialog
MainFrame *-- RefundDialog
MainFrame *-- TicketDialog
```
## Data store file
```mermaid
graph TB
MAIN_GET["MainFram.displayAll()"]
TICKET["TicketDialog.save()"]
UPDATE["DetailDialog.updateStudent()"]
DETAIL["DetailDialog.findStudent()"]
FILE["File<br/>students.csv<br/>Store Student Info."]
FILE--pull data-->MAIN_GET
TICKET--save student-->FILE
UPDATE--save all students-->FILE
FILE--find student-->DETAIL
```

## Flowchart
* Detail Operation Logic
```mermaid
graph TB

START(Display Detail window)
LOAD[Load students]
FILE[(Data<br/>storage)]
FIND[find student by id]
EXIST{exist?}
DISP[Display detail info]
MODIFY[Modify quantity]
UPDATE[Update storage]
STATUS[Not exist message]

START-->LOAD
FILE-->LOAD
LOAD-->FIND
FIND-->EXIST
EXIST--true-->DISP
EXIST--false-->STATUS
DISP-->MODIFY
MODIFY-->UPDATE
UPDATE--update-->FILE


classDef if fill:#EBCD6F,stroke:black,stroke-width:2px;
classDef html fill:#F46624,stroke:#F46624,stroke-width:4px,color:white;
classDef start fill:green,stroke:#DE9E1F,stroke-width:2px,color:white;
classDef db fill:#BEBDB7,stroke:black,stroke-width:2px;

class START start
class EXIST if
class FILE db
```

* Refund Operation Logic
```mermaid
graph TB

START(Display Refund window)
LOAD[Load students]
FILE[(Data<br/>storage)]
FIND[find student by id]
EXIST{exist?}
DISP[Display detail info]
REMOVE[Remove from tree]
UPDATE[Update storage]
STATUS[Not exist message]

START-->LOAD
FILE-->LOAD
LOAD-->FIND
FIND-->EXIST
EXIST--true-->DISP
EXIST--false-->STATUS
DISP-->REMOVE
REMOVE-->UPDATE
UPDATE--update-->FILE


classDef if fill:#EBCD6F,stroke:black,stroke-width:2px;
classDef html fill:#F46624,stroke:#F46624,stroke-width:4px,color:white;
classDef start fill:green,stroke:#DE9E1F,stroke-width:2px,color:white;
classDef db fill:#BEBDB7,stroke:black,stroke-width:2px;

class START start
class EXIST if
class FILE db
```

## Java Docs
```DOS
Open DOS command window, cd to the folder below, type in javadoc command

C:\Users\12818\workspace\Rodney\java\doc\danceticket>javadoc -sourcepath ../../john/src -subpackages com.john.danceticket
```
![](images/javadoc.png)

Double click index.html file name

![](images/index-html.png)

## Software include

```mermaid
graph LR

A(Dance Ticket)
B["User Interface (GUI)"]
C[Business Logic]
D[(Data Storage File)]
E[Java Doc]
F[Test]
G[Java Logging]
H["Software Delivery (jar)"]

A --> B & C & D & E & F & G & H

classDef start fill:green,stroke:#DE9E1F,stroke-width:2px,color:white;
classDef db fill:#BEBDB7,stroke:black,stroke-width:2px;
classDef html fill:#F46624,stroke:#F46624,stroke-width:4px,color:white;
classDef if fill:#EBCD6F,stroke:black,stroke-width:2px;

class A start
class D db
class B html
class C if
```