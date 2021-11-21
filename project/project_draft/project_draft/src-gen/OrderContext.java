import java.io.PrintStream;

public final class OrderContext
    extends FSMContext
{
//---------------------------------------------------------------
// Member methods.
//

    public OrderContext(Order owner)
    {
        super();

        _owner = owner;
        setState(OrderFSM.PowerOn);
        OrderFSM.PowerOn.Entry(this);
    }

    public synchronized void Closed_Door()
    {
        _transition = "Closed_Door";
        getState().Closed_Door(this);
        _transition = "";
        return;
    }

    public synchronized void HighTemp()
    {
        _transition = "HighTemp";
        getState().HighTemp(this);
        _transition = "";
        return;
    }

    public synchronized void MediumTemp()
    {
        _transition = "MediumTemp";
        getState().MediumTemp(this);
        _transition = "";
        return;
    }

    public synchronized void MediumTemp_Half_Power()
    {
        _transition = "MediumTemp_Half_Power";
        getState().MediumTemp_Half_Power(this);
        _transition = "";
        return;
    }

    public synchronized void Timer()
    {
        _transition = "Timer";
        getState().Timer(this);
        _transition = "";
        return;
    }

    public synchronized void number()
    {
        _transition = "number";
        getState().number(this);
        _transition = "";
        return;
    }

    public OrderState getState()
        throws StateUndefinedException
    {
        if (_state == null)
        {
            throw(
                new StateUndefinedException());
        }

        return ((OrderState) _state);
    }

    protected Order getOwner()
    {
        return (_owner);
    }

//---------------------------------------------------------------
// Member data.
//

    transient private Order _owner;

//---------------------------------------------------------------
// Inner classes.
//

    public static abstract class OrderState
        extends State
    {
    //-----------------------------------------------------------
    // Member methods.
    //

        protected OrderState(String name, int id)
        {
            super (name, id);
        }

        protected void Entry(OrderContext context) {}
        protected void Exit(OrderContext context) {}

        protected void Closed_Door(OrderContext context)
        {
            Default(context);
        }

        protected void HighTemp(OrderContext context)
        {
            Default(context);
        }

        protected void MediumTemp(OrderContext context)
        {
            Default(context);
        }

        protected void MediumTemp_Half_Power(OrderContext context)
        {
            Default(context);
        }

        protected void Timer(OrderContext context)
        {
            Default(context);
        }

        protected void number(OrderContext context)
        {
            Default(context);
        }

        protected void Default(OrderContext context)
        {
            if (context.getDebugFlag() == true)
            {
                PrintStream str = 
                    context.getDebugStream();

                str.println(
                    "TRANSITION   : Default");
            }

            throw (
                new TransitionUndefinedException(
                    "State: " +
                    context.getState().getName() +
                    ", Transition: " +
                    context.getTransition()));
        }

    //-----------------------------------------------------------
    // Member data.
    //
    }

    /* package */ static abstract class OrderFSM
    {
    //-----------------------------------------------------------
    // Member methods.
    //

    //-----------------------------------------------------------
    // Member data.
    //

        //-------------------------------------------------------
        // Statics.
        //
        public static OrderFSM_Default.OrderFSM_PowerOn PowerOn;
        public static OrderFSM_Default.OrderFSM_Waiting Waiting;
        public static OrderFSM_Default.OrderFSM_Full_Power Full_Power;
        public static OrderFSM_Default.OrderFSM_Half_Power Half_Power;
        public static OrderFSM_Default.OrderFSM_Set_Timer Set_Timer;
        public static OrderFSM_Default.OrderFSM_Disabled Disabled;
        public static OrderFSM_Default.OrderFSM_Enabled Enabled;
        public static OrderFSM_Default.OrderFSM_Operation Operation;
        public static OrderFSM_Default.OrderFSM_Power_Off Power_Off;
        private static OrderFSM_Default Default;

        static
        {
            PowerOn = new OrderFSM_Default.OrderFSM_PowerOn("OrderFSM.PowerOn", 12);
            Waiting = new OrderFSM_Default.OrderFSM_Waiting("OrderFSM.Waiting", 13);
            Full_Power = new OrderFSM_Default.OrderFSM_Full_Power("OrderFSM.Full_Power", 14);
            Half_Power = new OrderFSM_Default.OrderFSM_Half_Power("OrderFSM.Half_Power", 15);
            Set_Timer = new OrderFSM_Default.OrderFSM_Set_Timer("OrderFSM.Set_Timer", 16);
            Disabled = new OrderFSM_Default.OrderFSM_Disabled("OrderFSM.Disabled", 17);
            Enabled = new OrderFSM_Default.OrderFSM_Enabled("OrderFSM.Enabled", 18);
            Operation = new OrderFSM_Default.OrderFSM_Operation("OrderFSM.Operation", 19);
            Power_Off = new OrderFSM_Default.OrderFSM_Power_Off("OrderFSM.Power_Off", 20);
            Default = new OrderFSM_Default("OrderFSM.Default", -1);
        }

    }

    protected static class OrderFSM_Default
        extends OrderState
    {
    //-----------------------------------------------------------
    // Member methods.
    //

        protected OrderFSM_Default(String name, int id)
        {
            super (name, id);
        }

    //-----------------------------------------------------------
    // Inner classse.
    //


        private static final class OrderFSM_PowerOn
            extends OrderFSM_Default
        {
        //-------------------------------------------------------
        // Member methods.
        //

            private OrderFSM_PowerOn(String name, int id)
            {
                super (name, id);
            }

        //-------------------------------------------------------
        // Member data.
        //
        }

        private static final class OrderFSM_Waiting
            extends OrderFSM_Default
        {
        //-------------------------------------------------------
        // Member methods.
        //

            private OrderFSM_Waiting(String name, int id)
            {
                super (name, id);
            }

            protected void HighTemp(OrderContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : OrderFSM.Waiting.HighTemp()");
                }


                (context.getState()).Exit(context);
                context.setState(OrderFSM.Full_Power);
                (context.getState()).Entry(context);
                return;
            }

            protected void MediumTemp(OrderContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : OrderFSM.Waiting.MediumTemp()");
                }


                (context.getState()).Exit(context);
                context.setState(OrderFSM.Half_Power);
                (context.getState()).Entry(context);
                return;
            }

        //-------------------------------------------------------
        // Member data.
        //
        }

        private static final class OrderFSM_Full_Power
            extends OrderFSM_Default
        {
        //-------------------------------------------------------
        // Member methods.
        //

            private OrderFSM_Full_Power(String name, int id)
            {
                super (name, id);
            }

            protected void MediumTemp_Half_Power(OrderContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : OrderFSM.Full_Power.MediumTemp_Half_Power()");
                }


                (context.getState()).Exit(context);
                context.setState(OrderFSM.Half_Power);
                (context.getState()).Entry(context);
                return;
            }

            protected void Timer(OrderContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : OrderFSM.Full_Power.Timer()");
                }


                (context.getState()).Exit(context);
                context.setState(OrderFSM.Set_Timer);
                (context.getState()).Entry(context);
                return;
            }

        //-------------------------------------------------------
        // Member data.
        //
        }

        private static final class OrderFSM_Half_Power
            extends OrderFSM_Default
        {
        //-------------------------------------------------------
        // Member methods.
        //

            private OrderFSM_Half_Power(String name, int id)
            {
                super (name, id);
            }

            protected void HighTemp(OrderContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : OrderFSM.Half_Power.HighTemp()");
                }


                (context.getState()).Exit(context);
                context.setState(OrderFSM.Full_Power);
                (context.getState()).Entry(context);
                return;
            }

        //-------------------------------------------------------
        // Member data.
        //
        }

        private static final class OrderFSM_Set_Timer
            extends OrderFSM_Default
        {
        //-------------------------------------------------------
        // Member methods.
        //

            private OrderFSM_Set_Timer(String name, int id)
            {
                super (name, id);
            }

            protected void Closed_Door(OrderContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : OrderFSM.Set_Timer.Closed_Door()");
                }


                (context.getState()).Exit(context);
                context.setState(OrderFSM.Enabled);
                (context.getState()).Entry(context);
                return;
            }

            protected void number(OrderContext context)
            {

                if (context.getDebugFlag() == true)
                {
                    PrintStream str = context.getDebugStream();

                    str.println("TRANSITION   : OrderFSM.Set_Timer.number()");
                }


                return;
            }

        //-------------------------------------------------------
        // Member data.
        //
        }

        private static final class OrderFSM_Disabled
            extends OrderFSM_Default
        {
        //-------------------------------------------------------
        // Member methods.
        //

            private OrderFSM_Disabled(String name, int id)
            {
                super (name, id);
            }

        //-------------------------------------------------------
        // Member data.
        //
        }

        private static final class OrderFSM_Enabled
            extends OrderFSM_Default
        {
        //-------------------------------------------------------
        // Member methods.
        //

            private OrderFSM_Enabled(String name, int id)
            {
                super (name, id);
            }

        //-------------------------------------------------------
        // Member data.
        //
        }

        private static final class OrderFSM_Operation
            extends OrderFSM_Default
        {
        //-------------------------------------------------------
        // Member methods.
        //

            private OrderFSM_Operation(String name, int id)
            {
                super (name, id);
            }

        //-------------------------------------------------------
        // Member data.
        //
        }

        private static final class OrderFSM_Power_Off
            extends OrderFSM_Default
        {
        //-------------------------------------------------------
        // Member methods.
        //

            private OrderFSM_Power_Off(String name, int id)
            {
                super (name, id);
            }

        //-------------------------------------------------------
        // Member data.
        //
        }

    //-----------------------------------------------------------
    // Member data.
    //
    }
}
