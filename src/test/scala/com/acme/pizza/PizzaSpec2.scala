

/**
 * Created by hduser on 17/11/14.
 */

import com.acme.pizza.Topping
import com.acme.pizza.com.acme.pizza.Pizza
import org.scalatest.FunSpec
import org.scalatest.BeforeAndAfter
import org.scalatest.GivenWhenThen

class PizzaSpec2 extends FunSpec with GivenWhenThen {

  var pizza: Pizza = _

  describe("A Pizza") {

    it ("should allow the addition of toppings") {
      Given("a new pizza")
      pizza = new Pizza

      When("a topping is added")
      pizza.addTopping(Topping("green olives"))

      Then("the topping count should be incremented")
      expectResult(1) {
        pizza.getToppings.size
      }

      And("the topping should be what was added")
      val t = pizza.getToppings(0)
      assert(t === new Topping("green olives"))
    }
  }

}