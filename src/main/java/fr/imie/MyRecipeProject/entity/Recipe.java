package fr.imie.MyRecipeProject.entity;

import java.util.List;

public class Recipe {
	
	private Long id;
	private String name;
	private String description;
	private List<String> instruction;
	private int time;
	private int difficulty;
	
	// @OneToMany
	private List<Image> images;
	
	private List<Ingredient> ingredients;
	
	private float totalPrice;

	public Recipe(Long id, String name, String description, List<String> instruction, int time, int difficulty,
			List<Image> images, List<Ingredient> ingredients, float totalPrice) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.instruction = instruction;
		this.time = time;
		this.difficulty = difficulty;
		this.images = images;
		this.ingredients = ingredients;
		this.totalPrice = totalPrice;
	}
	
	public Recipe() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getInstruction() {
		return instruction;
	}

	public void setInstruction(List<String> instruction) {
		this.instruction = instruction;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	

}
