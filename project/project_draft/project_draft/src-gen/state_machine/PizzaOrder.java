package state_machine;/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



/**
 * UML state diagram for a Booking on an airline, represented in Umple
 */
// line 4 "model.ump"
// line 77 "model.ump"
public class PizzaOrder
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PizzaOrder State Machines
  public enum State { orderPlaced, processOrder, preparePizza, eatIn, carryOut, delivery }
  private State state;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PizzaOrder()
  {
    setState(State.orderPlaced);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getStateFullName()
  {
    String answer = state.toString();
    return answer;
  }

  public State getState()
  {
    return state;
  }

  public boolean received()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case orderPlaced:
        exitState();
        setState(State.processOrder);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean completed()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case processOrder:
        exitState();
        setState(State.preparePizza);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean orderE()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case preparePizza:
        exitState();
        setState(State.eatIn);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean orderC()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case preparePizza:
        exitState();
        setState(State.carryOut);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean orderD()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case preparePizza:
        exitState();
        setState(State.delivery);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void exitState()
  {
    switch(state)
    {
      case orderPlaced:
        // line 8 "model.ump"
        exitOrder();
        break;
      case processOrder:
        // line 13 "model.ump"
        exitProcess();
        break;
      case preparePizza:
        // line 18 "model.ump"
        exitPreparation();
        break;
    }
  }

  private void setState(State aState)
  {
    state = aState;

    // entry actions and do activities
    switch(state)
    {
      case orderPlaced:
        // line 7 "model.ump"
        entryOrder();
        break;
      case processOrder:
        // line 12 "model.ump"
        entryProcess();
        break;
      case preparePizza:
        // line 17 "model.ump"
        entryPreparation();
        break;
      case eatIn:
        // line 24 "model.ump"
        entryEatIn();
        break;
      case carryOut:
        // line 27 "model.ump"
        entryCarryOut();
        break;
      case delivery:
        // line 30 "model.ump"
        entryDelivery();
        break;
    }
  }

  public void delete()
  {}


  /**
   * entry for orderPlaced
   */
  // line 34 "model.ump"
  public void entryOrder(){
    System.out.println("Order has been placed");
  }


  /**
   * exit for orderPlaced
   */
  // line 39 "model.ump"
  public void exitOrder(){
    System.out.println("Order has been received to the nearest branch");
  }


  /**
   * entry for processOrder
   */
  // line 43 "model.ump"
  public void entryProcess(){
    System.out.println("Processing order");
  }


  /**
   * exit for processOrder
   */
  // line 47 "model.ump"
  public void exitProcess(){
    System.out.println("Process completed");
  }


  /**
   * entry for preparePizza
   */
  // line 52 "model.ump"
  public void entryPreparation(){
    System.out.println("Preparing pizza by instructions");
  }


  /**
   * exit for preparePizza
   */
  // line 56 "model.ump"
  public void exitPreparation(){
    System.out.println("Pizza is ready");
  }


  /**
   * entry for eatIn
   */
  // line 60 "model.ump"
  public void entryEatIn(){
    System.out.println("Order is ready to eat in");
  }


  /**
   * entry for carryOut
   */
  // line 64 "model.ump"
  public void entryCarryOut(){
    System.out.println("Order is ready to be carried out");
  }


  /**
   * entry for carryOut
   */
  // line 68 "model.ump"
  public void entryDelivery(){
    System.out.println("Order is ready to be delivered");
  }

}