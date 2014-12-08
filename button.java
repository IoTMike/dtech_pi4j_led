/**
 *  http://www.bluej.org/raspberrypi/Led_button.html
 *  - Second code segment for Button.
 */

import com.pi4j.io.gpio.*;

/**
 * This class represents a Button.
 */
public class Button
{
    // the button instance
    private GpioPinDigitalInput button;

    /**
     * Button constructor at GPIO 7
     */
    public Button()
    {
        //get a gpio controller
        GpioController gpio = GpioFactory.getInstance();
        //provision the Button.
        button = gpio.provisionDigitalInputPin(RaspiPin.GPIO_07, PinPullResistance.PULL_DOWN);
    }

    /**
     * Print the state of the button
     *  
     */
    public void checkButton()
    { 
        System.out.println("State = "+button.getState());
    }
}
