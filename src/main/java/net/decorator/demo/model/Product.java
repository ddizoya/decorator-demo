package net.decorator.demo.model;

public abstract class Product {

   protected Float price = 0.95f;

   public Product(Float price) {
      this.price = price;
   }

   public abstract Float price();

   public void setPrice(Float price) {
      this.price = price;
   }
}
