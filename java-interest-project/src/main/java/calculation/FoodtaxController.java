/**
 * 
 */
package calculation;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author attie.ntenteni
 *
 */
@RestController
public class FoodtaxController {
	
	FoodService foods = FoodService.getInstance();
	
	@RequestMapping("/food/add")
	public Food GetTax(@RequestParam(value="name", defaultValue="burger") String name, 
			@RequestParam(value="price", defaultValue="0") double price){
		return foods.Add(new Food(name, price));
	}
	
	@RequestMapping(value="/food/add", method = RequestMethod.POST)
	public void postTax(@RequestBody Food food){
		foods.Add(food);
	}
	
	@RequestMapping("/food/get")
	public Food getFood(@RequestParam(value="name", defaultValue="burger") String name){
		return foods.find(name);
	}
	
	@RequestMapping("/food/tax")
	public double calculateTax(@RequestParam(value="name", defaultValue="burger") String name){
		return foods.calculateTax(name);
	}
	 
	@RequestMapping(value = "/food/totalTax", method = RequestMethod.POST)
	public double totalTax(@RequestBody List<Food> list){
		return foods.calculateTax(list);
	}	
}
