package classes;

public class Product {

	public Product(int id,String name,String description,double price,int unitsInStock,String color)
	{
		this._id=id;
		this._name=name;
		this._color=color;
		this._description=description;
		this._price=price;
		this._unitsInStock=unitsInStock;
		
	}
	// attribute or fields
	private int _id;
	private String _name;
	private String _description;
	private Double _price;
	private int _unitsInStock;
	private String _color;
	private String _code;

	//Getters and Setters
	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public Double get_price() {
		return _price;
	}

	public void set_price(Double _price) {
		this._price = _price;
	}

	public int get_unitsInStock() {
		return _unitsInStock;
	}

	public void set_unitsInStock(int _unitsInStock) {
		this._unitsInStock = _unitsInStock;
	}

	public String get_color() {
		return _color;
	}

	public void set_color(String _color) {
		this._color = _color;
	}

	public String get_code() {
		return this._code.substring(0, 1) + _id;
	}

}
