using dotnet_interest_project.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using System.Web.Http.Cors;

namespace dotnet_interest_project.Controllers
{
    [EnableCorsAttribute("*", "*", "*")]
    public class FoodController : ApiController
    {

        // GET api/food
        public IEnumerable<Food> Get()
        {
            var foodRepository = new FoodRepository();
            return foodRepository.Retrieve();
        }

        // GET api/food/5
        public Food Get(string name)
        {
            var foodRepository = new FoodRepository();
            var products = foodRepository.Retrieve();
            return products.First(p => p.Name.Equals(name));
        }

        // POST api/food
        public void Post([FromBody]Food food)
        {
            var foodRepository = new FoodRepository();
            foodRepository.Save(food);
        }

        // PUT api/food/5
        public void Put(int id, [FromBody]Food value)
        {
        }

        // DELETE api/food/5
        public void Delete(int id)
        {
        }
    }
}
