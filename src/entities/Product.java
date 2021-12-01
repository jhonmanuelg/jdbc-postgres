package entities;

public class Product {

	private Long id;
	private String nome;
	private Double price;
	private String description;
	private String imageUri;
	
	public Product() {
	}	
	
	
	public Product(Long id, String nome, Double price, String description, String imageUri) {
		super();
		this.id = id;
		this.nome = nome;
		this.price = price;
		this.description = description;
		this.imageUri = imageUri;
	}




	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getImageUri() {
		return imageUri;
	}
	
	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", nome=" + nome + ", price=" + price + ", description=" + description
				+ ", imageUri=" + imageUri + "]";
	}	
	
	
}
