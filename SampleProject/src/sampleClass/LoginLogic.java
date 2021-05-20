package sampleClass;

public class LoginLogic {

	public boolean execute(SampleClass sampleClass) {

		switch(sampleClass.getEmployee_id()) {

			case "Emp001":

				sampleClass.setEmployee_name("池田");
				return true;

			case "Emp002":

				sampleClass.setEmployee_name("内田");
				return true;

			case "Emp003":

				sampleClass.setEmployee_name("宇佐美");
				return true;

			case "Emp004":

				sampleClass.setEmployee_name("大松");
				return true;

			case "Emp005":

				sampleClass.setEmployee_name("南里");
				return true;

			default:

				return false;

		}


	}


}