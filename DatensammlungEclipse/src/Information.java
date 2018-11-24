public class Information {

	private Category category;

	private String[] text;

	public Information(Category c, String[] text) {
		//enter the Category to the object and use its information for the lenght of text
		this.category = c;
		this.text = new String[category.getLenght() + 1];
		this.text[0] = category.getName();
	}

	public void setText(String[] text) {
		//TODO add text correctly in the Strings Text
	}

	public String[] getText() {
		return text;
	}
}
