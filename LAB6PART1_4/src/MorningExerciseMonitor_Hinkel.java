import java.util.Arrays;

public class MorningExerciseMonitor_Hinkel {
	private String fullName = "Mary Lane";
	private float[] arrayNumber = {2.1f, 2.5f, 2.2f, 2.4f, 2.6f, 2.2f, 2.4f};
	
	public String toString() {
		String list = arrayNumber.toString();
		return "PERSON\n" +
				"Name = " + fullName +
				"\nWeek Exercise Distance = " + Arrays.toString(arrayNumber).replace("[", "").replace("]", "");
	}
}
