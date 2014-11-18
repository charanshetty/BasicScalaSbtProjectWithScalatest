package com.acme.pizza

import com.acme.pizza.Pizza
import com.acme.pizza.Topping
import org.scalatest.FunSuite

/**
 * Created by hduser on 17/11/14.
 */


import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

class PizzaTests extends FunSuite with BeforeAndAfter {

  var pizza: Pizza = _

  before {
    pizza = new Pizza
  }

  test("new pizza has zero toppings") {
    assert(pizza.getToppings.size == 0)
  }

  test("adding one topping") {
    pizza.addTopping(Topping("green olives"))
    assert(pizza.getToppings.size === 1)
  }

  // mark that you want a test here in the future
  test ("test pizza pricing") (pending)

  test("new pizza has zero toppings (version 2)") {
    // intentional error here; size should be 0
    assert(pizza.getToppings.size === 1)
  }
  test("new pizza has zero toppings (version 3)") {
    expectResult(1) {
      pizza.getToppings.size
    }
  }
  test ("catching an exception") {
    val thrown = intercept[Exception] {
      pizza.boom
    }
    assert(thrown.getMessage === "Boom!")
  }
}