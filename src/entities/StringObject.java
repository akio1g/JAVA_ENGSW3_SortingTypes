package entities;

import java.util.ArrayList;
import java.util.List;

public class StringObject implements IObject {

	@Override
	public List<Object> generateArray() {
		List<Object> stringArrayList = new ArrayList<>();

		int length = 10;
        for (int i = 0; i < length; i++) {
            // You can modify the string content as needed
            String stringValue = "String" + i;
            stringArrayList.add(stringValue);
        }

        return stringArrayList;
	}


}
