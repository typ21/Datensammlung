
public class Program {
	private Category[] categories;
	private int categoryCounter = 0;

	private Information[] informations;
	private int informationCounter = 0;

	public Program() {
		initialize();
	}

	/**
	 * initializes the Program up to a Level the user can work
	 */
	private void initialize() {
		// TODO read from Database if wanted(let user choose between NEW and IMPORT
		Gui.start(informations);
	}

	/**
	 * creates a new Category, which later on helps creating a new Information
	 * 
	 * @param
	 */
	public void newCategroy(int lenght, String name) {
		categories[categoryCounter + 1] = new Category();
		categoryCounter++;

		categories[categoryCounter].setLenght(lenght);
		categories[categoryCounter].setName(name);
	}

	/**
	 * creates a new Information
	 * 
	 * @param
	 */
	public void newInformation(Category category) {
		informations[informationCounter] = new Information(category);
		informationCounter++;
	}
}
