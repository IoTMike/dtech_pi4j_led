/**
 *  http://www.bluej.org/raspberrypi/Led_button.html
 *  - Modified final step code for LED.
 */

import com.pi4j.io.gpio.*;
import com.pi4j.io.gpio.event.*;

/**
 * Class to control a LED.
 * 
 */
public class LED implements GpioPinListenerDigital
{
    //The LED
    private GpioPinDigitalOutput ledPin;
    
    /**
     * Constructor for objects of class LED
     */
    public LED ()
    {
        //get a gpio controller
        GpioController gpio = GpioFactory.getInstance();
        //provision the LED pin.
        ledPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_06, "BlueLED", PinState.LOW);
    }

    /*
     * Turns on the LED
     */
    public void on() {
        ledPin.high();
    }
    
    /*
     * Turns off the LED
     */
    public void off() {
        ledPin.low();
    }
    
    /* Then we need to implement the method that would be called by the
     *  button class whenever the button is pressed:
     */
    @Override
    public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event){        
        ledPin.toggle();
    }
}
