/* Minimal java class to control a LED from the Raspberry Pi  */

import com.pi4j.io.gpio.*;
import com.pi4j.io.gpio.event.*;

public class LED  { 
  //The LED private GpioPinDigitalOutput ledPin; 

  /* Constructor for objects of class LED */ 
  public LED()  { 
    // Get a gpio controller 
    GpioController gpio = GpioFactory.getInstance(); 

    // Provision the LED pin. 
    ledPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_06, "BlueLED", PinState.LOW); } 

    /* Turns on the LED */ 
    public void on() { 
       ledPin.high(); 
    } 

    /* Turns off the LED */ 
    public void off() { 
       ledPin.low(); 
    } 
}
