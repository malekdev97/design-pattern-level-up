# Factory Method

As the name said its method that instantiate from concrete class  

Factory Method
Factory means the thing that create or produce
Simple I pass the concrete class that I want to create in method,
Keys note that will simplify everything

	1- Abstract Method(no body) factoryDevice
	2- Implement an concrete class that return its class(type) e.g. return new Playstation'
In the main method defined object from abstract class call the factory method

Coupled Code
```java
abstract class Logistics {
// Factory Method
protected abstract Transport createTransport();

    void planDelivery() {
        Transport transport = createTransport();  // ✅ Uses abstraction
        transport.deliver();
    }
}
```

Decoupled Code

```java
class Logistics {
    void planDelivery() {
        Truck truck = new Truck();  // ❌ Hardcoded dependency
        truck.deliver();
    }
}
```