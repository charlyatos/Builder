package net.crojo.builder;

public class MealBuilder {

	   public Meal prepareVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new VegBurger());
	      meal.addItem(new Coke());
	      return meal;
	   }   

	   public Meal prepareNonVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new Pepsi());
	      meal.addItem(new ChickenBurger());
	      return meal;
	   }
	   
	   public Meal justCoke (){
		      Meal meal = new Meal();
		      meal.addItem(new Coke());
		      return meal;
		   }
	}