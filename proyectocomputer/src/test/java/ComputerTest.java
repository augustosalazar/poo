

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uninorte.DeviceCard;
import com.uninorte.ExtensionBoard;
import com.uninorte.Machine;

public class ComputerTest {

    @Test
    public void testCard(){
        Machine machine = new Machine();

        machine.addCard(new DeviceCard(1), 0);
        machine.addCard(new DeviceCard(2), 1);
        machine.addCard(new ExtensionBoard(3), 2);

        assertEquals(2, machine.getNumberOfDeviceCards());

        machine.addCard(2,new DeviceCard(4), 0);

        assertEquals(3, machine.getNumberOfDeviceCards());

        assertEquals(4, machine.getNumberOfCards()); // including the extension board
    }
    
}
