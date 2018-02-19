import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@org.junit.Test
	public void test() {
		gui a = new gui();
		a.start();
		a.t2.setValue(2);
		a.Confirm.doClick();
		assertEquals(a.res8.getText(), "109,02");
	}
}
