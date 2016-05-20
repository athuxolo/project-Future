using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace dotnet_interest_project.Models
{
    public class Food
    {
        public double Price { get; set; }
        public double TaxValue { get; set; }
        public String Name { get; set; }
        public const double Tax = 0.14;

        public Food(String name, double price)
        {
            this.Price = price;
            this.Name = name;
            this.TaxValue = price * Tax;
        }
    }
}