public class Program {

	private Category[] categories = new Category[1];
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
		Gui.start(informations, categories);
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

		// increase the size of categories
		this.increaseCategoryLenght(1);
	}

	/**
	 * creates a new Information
	 * 
	 * @param
	 */
	public void newInformation(Category category, String[] text) {
		informations[informationCounter] = new Information(category, text);
		informationCounter++;

		// increase the size of categories
		this.increaseInformationLenght(1);
	}

	private void increaseCategoryLenght(int increaseSize) {
		Category[] tempCategoryArr = new Category[categories.length + increaseSize];
		for (int i = 0; i <= categories.length; i++) {
			categories[i] = tempCategoryArr[i];
		}
		this.categories = tempCategoryArr;
	}

	private void increaseInformationLenght(int increaseSize) {
		Information[] tempInformationsArr = new Information[informations.length + increaseSize];
		for (int i = 0; i <= informations.length; i++) {
			this.informations[i] = tempInformationsArr[i];
		}
		this.informations = tempInformationsArr;
	}
}
