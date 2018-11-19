
public class Information {
	private Category category;
	
	private String[] text;

	public Information(Category c) {
		this.category = c;
		this.text = new String[category.getLenght() + 1];
		this.text[0] = category.getName();
	}

	public void setText(String[] text) {

	}

	public String[] getText() {
		return text;
	}
}
