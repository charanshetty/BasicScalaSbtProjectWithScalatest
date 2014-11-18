package com.acme.pizza.Pizza

/**
 * Created by hduser on 17/11/14.
 */


import com.acme.pizza.com.acme.pizza.Pizza
import org.scalatest.FunSpec
import org.scalatest.BeforeAndAfter

class PizzaSpec extends FunSpec with BeforeAndAfter {

  var pizza: Pizza = _

  before {
    pizza = new Pizza
  }

  describe("A Pizza") {

    it("should start with no toppings") {
      assert(pizza.getToppings.size == 0)
      //assert(pizza.getToppings.size == 1)
    }

    it("should allow addition of toppings") (pending)

    it("should allow removal of toppings") (pending)
  }

}