# <p align="center"> # APPL_SOLID_181524017 </p>

Bahasa pemrograman : Java

## 1.Stream Progress Info

Refactor code for this task, so **Stream Progress Info** can work with different kinds of **Streams**. First make sure it works with **Music** too. Refactor code, so in the future if a **new kind of stream** is introduced, you will need **just to import one new class** with   **BytesSent** and **Length** getters in it.

**Keterangan Penyelesaian** :
Untuk Problem ini, saya amati code C# pada contoh sudah clean code yang artinya tidak perlu di refactor. Target atau tujuan yaitu **Stream Progress Info** dapat melayani berbagai jenis **Stream** telah terpenuhi. Maka dari itu saya hanya perlu menyamakan konsepnya, kemudian mengganti bahasanya ke Java, dan mencoba menambahkan kelas **Stream** baru dengan **BytesSent** dan **Length** getter di dalamnya. Pada problem ini digunakan prinsip **Open-Closed Principle** agar module (dalam kasus ini stream) dapat ditambah atau di-extend tanpa mengubah atau memodifikasi module-module terdahulu.

## 2.Graphic Editor

Refactor code for this task, so **Graphic Editor can draw all kind of shapes** without checking, **what kind is concrete shape.** In the future new shapes will be added to system, so prepare the system for this moments. When you **add new shape** , you just should **add new class and nothing more**.

**Keterangan Penyelesaian** :
Sama halnya dengan problem 1. Kode C# pada contoh sudah clean code. Pada kode tersebut tidak menggunakan kondisi if/else untuk mengecek setiap shape, melainkan menggunakan interface yang diimplementasikan di setiap kelas shape. Sehingga interface shape tersebut menjadi argumen fungsi DrawShape pada **Graphics Editor** yang menentukan secara otomatis objek shape apa yang sedang di passing. Pada problem ini digunakan prinsip **Open-Closed Principle** agar module (dalam kasus ini shape) dapat ditambah atau di-extend tanpa mengubah atau memodifikasi module-module terdahulu.

## 3.Detail Printer

Refactor code for this task, so **Detail Printer** don&#39;t need to ask **what kind of employee is passed to it**. Detail Printer need just to print details for all kind of employees. When new kind of employee is added you will need just to **add new class and nothing else.**

**Keterangan Penyelesaian** :
Pada problem 3 juga saya tidak menemukan adanya kebutuhan untuk merefactor, karena menurut saya kode tersebut sudah SOLID dan tujuannya (yaitu ketika tipe employee baru (kelas baru yang extend kelas employee) dibuat, hanya perlu menambah kelas saja) dapat dilakukan. Untuk perbedaannya dari C# ke Java hanya di tipe tipe datanya saja saya ubah(Dari collection ke list), dan **DetailsPrinter** diubah agar output menjadi rapi.

## 4.Recharge

You are given a library with the following classes

- Worker implements ISleeper
- Employee inherits Worker
- Robot inherits Worker
- RechargeStation

If you inspect the code, you can see that some of the classes have methods that they can&#39;t use (throw **UnsupportedOpperationException** ) which is clear indication that the code should be refactored.

Refactor the structure so that it conforms to the **Interface Segregation** principle.

> ### Hints
> Make the **Robot** to extend **Worker** and at the same time to implement **Rechargeable**

**Keterangan Penyelesaian** :
Interface Segregation Principles menyatakan bahwa sebuah interface tidak seharusnya memaksakan method yang tidak dipakai/diinginkan pada suatu kelas. Maka solusi dari problem ini adalah dengan menjadikan **Worker** abstract class yang tidak mengimplementasikan interface apapun. Kemudian menjadikan kelas **Employee** meng-extend kelas **Worker** sekaligus mengimplementasi interface **ISleeper**. Sama halnya dengan **Robot**, extend **Worker** dan implements **IRechargeable**. Dengan ini, tidak ada method dari interface yang tidak dipakai pada kelas manapun, setiap kelas dipasangkan dengan interfacenya masing-masing.

## 5.Security Door

You are given:

- SecurityManager
- abstract class SecurityCheck
- interface SecurityUI

**SecurityManager** which can interact with a user by validating his key card or by getting his pin code. Both methods are provided by an interface called **SecurityUI**. The validation is performed by the appropriate **SecurityCheck** class.

Refactor the structure so that it conforms to the **Interface Segregation** principle.

> ### Hints
> Split **SecurityUI** into smaller role interfaces, one for each **SecurityCheck** class

**Keterangan Penyelesaian** :
Problem ini mirip dengan problem 4, yaitu masalah prinsip Interface Segregation Principles. Solusinya adalah memecah dan mengganti **SecurityUI** menjadi **IRequestKeyCard** dan **IRequestPinCode** lalu mengimplementasikannya pada kelas-kelas yang sesuai. Sehingga SOLID dapat tercapai.

