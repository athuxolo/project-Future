package calculation;

import java.util.ArrayList;
import java.util.List;

public class FoodService {

	List<Food> foods = new ArrayList<Food>();
	public static FoodService instance = null;
	
	protected FoodService(){
		
	}
	
	public static FoodService getInstance(){
		if(instance == null){
			instance = new FoodService();
		}
		return instance;
	}
	public Food Add(Food food){
		foods.add(food);
		return food;
	}
	
	public boolean Delete(String name){
		for(Food food : foods){
			if(food.getName() == name)
				return foods.remove(food);
		}
		return false;
	}
	
	public void editPrice(String name, double price){
		for(Food food : foods){
			if(food.getName() == name)
				food.setPrice(price);
		}
	}
	
	public double calculateTax(List<Food> list){
		double sum = 0;
		for(Food food : list)
			sum += food.getTaxPrice();
		return sum;
	}
	
	public double calculateTax(String name){
		Food food = find(name);
		return food.getTaxPrice();
	}
	
	public double calculateTax(){
		double sum = 0;
		for(Food food : foods)
			sum += food.getTaxPrice();
		return sum;
	}
	
	public Food find(String name){
		for(Food food : foods)
			if(food.getName() == name)
				return food;
		return null;
	}
}
