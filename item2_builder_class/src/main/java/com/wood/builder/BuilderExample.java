package com.wood.builder;

public class BuilderExample {

	public static enum Color {
		BLUE,
		RED,
		GREEN,
		ORANGE,
		YELLOW,
		INDIGO,
		VIOLET,
		BLACK,
		WHITE;

		@Override
		public String toString() {
			switch(this) {
				case BLUE: return "blue";
				case RED: return "red";
				case GREEN: return "green";
				case ORANGE: return "orange";
				case YELLOW: return "yellow";
				case INDIGO: return "indigo";
				case VIOLET: return "violet";
				case BLACK: return "black";
				case WHITE: return "white";
				default: throw new IllegalArgumentException();
			}
		}
	}

	private String firstName;
	private String lastName;
	private int age;
	private int height;
	private int shoeSize;
	private String ssn;
	private Color favoriteColor;

	public static class Builder {
		private final String firstName;
		private final String lastName;

		private int age;
		private int height;
		private int shoeSize;
		private String ssn;
		private Color favoriteColor;

		// required parameters
		public Builder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public Builder age(int val) { age = val; return this; }
		public Builder height(int val) { height = val; return this; }
		public Builder shoeSize(int val) { shoeSize = val; return this; }
		public Builder ssn(String val) { ssn = val; return this; }
		public Builder favoriteColor(Color val) { favoriteColor = val; return this; }

		public BuilderExample build() {
			return new BuilderExample(this);
		}
	}

	private BuilderExample(Builder builder) {
		firstName = builder.firstName;
		lastName = builder.lastName;
		age = builder.age;
		height = builder.height;
		shoeSize = builder.shoeSize;
		ssn = builder.ssn;
		favoriteColor = builder.favoriteColor;
	}

	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public int getAge() { return age; }
	public int getHeight() { return height; }
	public int getShoeSize() { return shoeSize; }
	public String getSsn() { return ssn; }
	public Color getFavoriteColor() { return favoriteColor; }

	@Override
	public String toString() {
		return firstName + " " + lastName + ":\n  " + 
			age + " years old\n  " +
			height + " inches tall\n  " +
			"size " + shoeSize + " shoes\n  " +
			"ssn: " + ssn + "\n  " +
			"favorite color is " + favoriteColor.toString() + "\n";
	}


	public static void main(String args[]) {
		BuilderExample example = new Builder("Chris","Wood").
			age(32).height(62).shoeSize(12).ssn("--").favoriteColor(Color.BLUE).build();
		System.out.println(example.toString());
	}

}
