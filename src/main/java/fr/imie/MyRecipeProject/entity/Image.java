package fr.imie.MyRecipeProject.entity;

public class Image {
	
	private Long id;
	private String name;
	private String mimeType;
	private byte[] data;
	
	
	public Image(Long id, String name, String mimeType, byte[] data) {
		super();
		this.id = id;
		this.name = name;
		this.mimeType = mimeType;
		this.data = data;
	}
	
	public Image() {
		
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

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
	
	

}
