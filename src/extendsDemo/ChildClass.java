package extendsDemo;

public class ChildClass extends SuperClass {
	public static class InnerClass {
		private String innerField;

		public String getInnerField() {
			return innerField;
		}

		public void setInnerField(String innerField) {
			this.innerField = innerField;
		}

	}

	private InnerClass innerClassField;

	public InnerClass getInnerClassField() {
		return innerClassField;
	}

	public void setInnerClassField(InnerClass innerClassField) {
		this.innerClassField = innerClassField;
	}
}
