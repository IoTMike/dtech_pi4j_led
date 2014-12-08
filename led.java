/**
 *  http://www.bluej.org/raspberrypi/Led_button.html
 *  - First code segment for LED.
 */

import com.pi4j.io.gpio.*;

/**
 * Class to control a LED.
 * 
 */
public class LED
{
    //The LED
    private GpioPinDigitalOutput ledPin;
    
    /**
     * Constructor for objects of class LED
     */
    public LED()
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
}
