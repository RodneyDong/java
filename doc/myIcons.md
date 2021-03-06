## Useful Icons

ββοΈβπβοΈβ‘οΈπ‘πππ¨βπ§βοΈππβοΈππππ₯πΎπππβ οΈππ’β»οΈπ ππ―βοΈβοΈ

## Color picker
[Color Picker Website](https://www.webfx.com/web-design/color-picker/)

## ζ±θ―­ζΌι³ε£°θ°
Δ Γ‘ Η Γ 
Ε Γ³ Η Γ²
Δ Γ© Δ Γ¨
Δ« Γ­ Η Γ¬
Ε« ΓΊ Η ΓΉ
Η Η Η Η

## math symbols
|operator | LaTex Symbols |
|---------|---------------|
Γ | times
Γ· | div
Β± | pm
Β° | degree
β | infty
Ο | phi
Ξ¦ | Phi
ΞΈ | theta
Ξ± | alpha
Ξ² | beta
Ξ³ | gamma
Ξ΄ | delta
ΞΌ | mu
Ο | pi
Ξ» | lambda
Ο | omega
β | Rightarrow
<font color="red">βΉ</font>| Longrightarrow
β | Downarrow

## Sample File Structure:

```output
<project root>
    βββ πdoc/
    |    βββ mistakes.md 
    |    βββ vscodeTrics.md 
    |    βββ python.md 
    βββ π¨homeworks/
    |       βββ <filenameXX.md>
    βββ π₯src/
    |      βββ hello.py 
    βββ πReadMe.md
```

## Sample Mermaid Diagram

```mermaid
graph LR
START((start))
B[code block]
END[end]
IF{condition<br> block}
DB[(database)]

START-->IF
IF--True-->DB-->END
IF--False-->B-->END

classDef start fill:green,stroke:#DE9E1F,stroke-width:2px,color:white;
classDef if fill:#EBCD6F,stroke:black,stroke-width:2px;
classDef html fill:#F46624,stroke:#F46624,stroke-width:4px,color:white;
classDef start fill:green,stroke:#DE9E1F,stroke-width:2px,color:white;
classDef end1 fill:red,stroke:#DE9E1F,stroke-width:2px,color:white;
classDef js fill:yellow,stroke:black,stroke-width:2px;
classDef db fill:#BEBDB7,stroke:black,stroke-width:2px;

class START start
class B,D,E js
class IF if
class DB db
class END end1
```