# codeguide

# SRP (Single Responsibility Principle)

- one class should do one thing and do it well.

  ## **How**

  `Separating responsibility can be done by defining for every responsibility a class or an interface. It makes no difference, a class can be seen as nothing more than a container of code, like a file or a library. What's important is that responsibilities are separated by abstraction and therefore can be implemented by different consumers of that interface.`

  ### example in RectangleDraw class.

# reference<br>

<https://www.codeproject.com/articles/611593/solid-principles-single-respons>

# ISP (Interface Segregation Principle)

- Avoid monolithic interface, reduce pain on client side.

  ## **How**

  `If the design is already done fat interfaces can be segregated using the Adapter pattern. Like every principle Interface Segregation Principle is one principle which require additional time and effort spent to apply it during the design time and increase the complexity of code. But it produce a flexible design. If we are going to apply it more than is necessary it will result a code containing a lot of interfaces with single methods, so applying should be done based on experience and common sense in identifying the areas where extension of code are more likely to happens in the future.`

  ### example in IWorker class.

# reference<br>

<http://www.oodesign.com/interface-segregation-principle.html>
